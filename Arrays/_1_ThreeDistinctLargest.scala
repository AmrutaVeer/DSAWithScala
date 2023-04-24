object _1_ThreeDistinctLargest extends App{

  // Method 1 -
    var arr = Array( 12, 45, 1, -1, 45, 54, 23, 5, 0, -10 )
    var n= arr.length
    var first = Integer.MIN_VALUE
    var second= Integer.MIN_VALUE
    var third=Integer.MIN_VALUE;
    for(i<- 0 until arr.length)
    {
      if(arr(i)>first)
      {
        third=second
        second=first
        first=arr(i)
      }
      else if(arr(i)>second&&arr(i)<first)
      {
        third=second
        second=arr(i)
      }
      else if(arr(i)>third&&arr(i)<second&&arr(i)<first)
      {
        third=arr(i)
      }

    }

    println(first+" "+second+" "+third)


}
