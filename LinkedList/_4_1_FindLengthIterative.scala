package in.olc.linkedList.basicOperations

object _4_1_FindLengthIterative  extends  App{
  val llist = new LinkedList
  llist.append(6)
  llist.push(7)
  llist.push(1)
  llist.append(4)
  llist.append(5)
  llist.append(33)
  llist.append(49)

  println(llist.findLengthItr(llist.head))


}
