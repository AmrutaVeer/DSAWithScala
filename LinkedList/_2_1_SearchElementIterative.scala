package in.olc.linkedList.basicOperations

object _2_1_SearchElementIterative {

    def main(args: Array[String]): Unit = {
      val llist = new LinkedList
      llist.append(6)
      llist.push(7)
      llist.push(1)
      llist.append(4)
      llist.append(5)
      llist.append(33)

      println(llist.searchElementIterative(5))
    }
  }

