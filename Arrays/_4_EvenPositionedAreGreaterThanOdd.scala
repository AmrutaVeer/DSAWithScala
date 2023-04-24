object _4_EvenPositionedAreGreaterThanOdd extends App {


  var arr1 = Array(1, 3, 2, 2, 5, 3, 7, 8,9)
  var n = arr1.length

  // Method 1 - Extra space ans[] , sort arr & pick into ans
  var ans = new Array[Int](n)
  var arr = arr1.sortWith(_<_)

  var p = 0;
  var q = n - 1

  for (i <- 0 until n) {
    if ((i + 1) % 2 == 0) {
      ans(i) = arr(q)
      q = q - 1
    }
    else {
      ans(i) = arr(p)
      p = p + 1

    }
  }

  ans.foreach(println)

  //Method 2 - compare arr(i) and arr(i-1) and swap! -- in progress
  // -- work more on below code
  /*for(i<- 1 to n-1)
    {
      if (i%2== 0) {
        if(arr(i)>arr(i-1)) {
          var temp = arr(i)
          arr(i) = arr(i - 1)
          arr(i - 1) = temp

        }
      }

      else { if(arr(i)<arr(i-1)) {
        val temp2 = arr(i)
        arr(i) = arr(i - 1)
        arr(i - 1) = temp2
      }
      }
    }
  println("------")

  arr.foreach(println) */

}