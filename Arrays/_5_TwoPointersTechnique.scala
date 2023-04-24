object _5_TwoPointersTechnique extends App {

  val givenarr = Array[Int](1, 2, 3, 4, 5, 6)
  val n = givenarr.size
  val arr= givenarr.sortWith(_<_)

  var ans = new Array[Int](n)
  var p =0
  var q= arr.length-1

  for(i<- 0 until n)
    {
      if(i%2==0)
        {
          ans(i)= arr(q)
          q= q-1
        }

      else
      {
        ans(i)= arr(p)
        p= p+1
      }
    }

  ans.foreach(println)}
