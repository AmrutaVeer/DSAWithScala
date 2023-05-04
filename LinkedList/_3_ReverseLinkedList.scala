package in.olc.linkedList.basicOperations

object _3_ReverseLinkedList extends  App{

  val llist = new LinkedList
  llist.append(6)
  llist.append(7)
  llist.append(1)
  llist.append(4)
  llist.append(5)
  llist.append(33)

  //llist.reverse(llist.head)

  llist.printList(llist.reverse(llist.head))



}
