object _6_SegregateEvenOddNumbers extends  App{

  val arr = Array(1, 3, 2, 4, 7, 6, 9, 10)
  val n = arr.length
  var flag =0

  var i= -1; var j =0
  while(j!=n)
    {
      if(arr(j)%2==0)
        {
          i=i+1
          var temp =arr(i)
          arr(i) = arr(j)
          arr(j) = temp

        }
         j=j+1
    }

  arr.foreach(println)
}
