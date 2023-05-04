package in.olc.linkedList.basicOperations
//append -
//push
//insertAfterKthNode
object _1_linkedListCreationInsertion {
  def main(args: Array[String]): Unit = {
    val llist = new LinkedList
    llist.append(6)
    llist.push(7)
    llist.push(1)
    llist.append(4)
    llist.append(5)
    llist.append(33)

    println("Linked list is: ")

    llist.printList()

    llist.insertAfterKthNode(3,44);

    llist.printList()
  }
}



