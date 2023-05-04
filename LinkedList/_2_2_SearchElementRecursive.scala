package in.olc.linkedList.basicOperations

object _2_2_SearchElementRecursive  {

  def main(args: Array[String])  : Unit = {
    val llist = new LinkedList
    llist.append(6)
    llist.append(7)
    llist.append(1)
    llist.append(4)
    llist.append(5)
    llist.append(33)

    println(llist.searchElementRecursive(llist.head,5))
  }

}
