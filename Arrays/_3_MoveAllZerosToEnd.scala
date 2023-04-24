import java.util

object _3_MoveAllZerosToEnd extends App{

  var arr = Array( 12, 45, 0, -1, 45, 0, 23, 5, 0, -10,0 )

  var n= arr.size

  var count = 0 //Count of non-zero elements
  for (i<- 0 to n-1) {
    if (arr(i) != 0)
      {arr(count) = arr(i);
        count= count+1}
  }


  while (count < n) {
    arr(count) = 0;
    count= count+1}

  arr.foreach(print)

  println()

  var m = scala.collection.mutable.ListBuffer( 12, 45, 0, -1, 45, 0, 23, 5, 0, -10,0 )
  count =0 // used in method one so initialize back to zero
  var i = 0
  while ( {
    i < m.size
  }) {
    if (m(i) == 0) {
      count += 1
      m.remove(i)
      i -= 1
    }

    i += 1
  }
   i = 0
  while ( {
    i < count
  }) {
    m.addOne(0)

    i += 1
  }

  m.foreach(print)

}
