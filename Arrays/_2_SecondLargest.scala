object _2_SecondLargest extends App {

    var arr = Array( 12, 45, 1, -1, 45, 54, 23, 5, 0, -10,54 )
    var f = Integer.MIN_VALUE
    var s= Integer.MIN_VALUE

    for(i<- 0 until arr.size)
    {
      if(arr(i)>f)
      {
        s=f
        f=arr(i)
      }
      else if(arr(i)>s&& arr(i)<f)
      {
        s=arr(i)
      }
    }

    println(s)

  }



