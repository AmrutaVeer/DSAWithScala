object _a10_SortArrayWhichContains1tonValues extends App {

    val arr :Array[Int]= Array( 3, 2, 5, 6, 1, 4 )

    var i =0
    while ( {
      i < arr.length
    }) { // Finding the correct index
      val correct = arr(i) - 1
      // If Element index and value do not match
      // then swapping
      if (arr(correct) != arr(i)) { // Calling swap function
        swap(arr, i, correct)
      }
      else i += 1
    }

    arr.foreach(println)

    def swap(arr: Array[Int], first: Int, second: Int): Unit = {
      val temp = arr(first)
      arr(first) = arr(second)
      arr(second) = temp
    }
  }

