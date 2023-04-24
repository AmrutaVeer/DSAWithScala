object _a13_ElementOnceOthersTwice extends App {

  val arr = Array(2, 3, 5, 4, 5, 3, 4, 2, 56)
  val n = arr.length
  var xor = 0
  for(i<- 0 to n-1)
    {
      xor = xor ^ arr(i)
    }

  println(xor)

}
