import java.util

object _a12_FindDistinctElements extends App {

  val arr = Array(10, 5, 3, 4, 3, 5, 6)
  val n = arr.length

  //Method 1: Use TreeSet
  val s = new util.TreeSet[Integer]
  for(i<- 0 until n) {
    s.add(arr(i))
  }

  print(s.toString)


  //Method 2: Use Hashset
  val set = new util.HashSet[Integer]

  for(i<- 0 until n) {
    if (!set.contains(arr(i))) {
      set.add(arr(i))
      System.out.print(arr(i) + " ")
    }
  }

  //Method 3: Sort & pick
  util.Arrays.sort(arr)

  var i = 0
  while (i<n) {
    if (i<n-1 && (arr(i) == arr(i + 1))) {
      i += 1
    }
    System.out.print(arr(i) + " ")

    i+=1

  }

}
