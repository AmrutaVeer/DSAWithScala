package in.olc.linkedList.basicOperations

class LinkedList {
  var head: Node = null
  class Node(var d: Int) {
    var data = d
    var next: Node = null
  }

  def push(new_data: Int): Unit = {
    val new_node = new Node(new_data)
    new_node.next = head
    head = new_node
  }


  def append(new_data: Int): Unit = {
    val new_node = new Node(new_data)
    if (head == null) {
      head = new Node(new_data)
      return
    }
    new_node.next = null
    var last = head
    while (last.next != null)
      last = last.next
    last.next = new_node
  }

  def printList(): Unit = {
    var tnode = head
    while ( tnode != null) {
      println(tnode.data + " ")
      tnode = tnode.next
    }
  }

  def printList(head: Node): Unit = {
    var node = head
    while ( node!=null) {
      System.out.print(node.data + " ")
      node = node.next
    }
  }

  def insertAfterKthNode(k:Int,data:Int) = {
    var prev = head
    var cnt =0
    while(cnt<k-1)
    {
      cnt=cnt+1
      prev = prev.next
    }

    var next = prev.next

    var n = new Node(data)
    n.next =next
    prev.next = n
  }

  def searchElementIterative(x: Int): Int = {
    var current = head // Initialize current
    var cnt = 1
    while ( {
      current != null
    }) {
      if (current.data == x) return cnt // data found
      else
      {current = current.next
        cnt = cnt+1}
    }
    -1
  }


  def searchElementRecursive(head: Node, x: Int): Boolean = {
    if (head == null)
      return false
    if (head.data == x)
      return true
    searchElementRecursive(head.next, x)
  }

  def reverse(head:Node)  = {

    var h1=head
    var h2 = new Node(3)
    h2=null
    var temp = head

    while (h1!=null)
    {
      temp = h1;
      h1=h1.next;
      temp.next=h2
      h2= temp
    }

    h2

  }


  def findLengthItr(head:Node) : Int = {
    var temp = head
    var cnt =0

    if(head ==0)
      return 0
    while(temp!=null)
      {
        cnt = cnt+1
        temp= temp.next
      }
    return cnt
  }

  def findLengthRec(head:Node) : Int = {
    if(head==null)
      return 0;

    return findLengthRec(head.next)+1

  }


}
