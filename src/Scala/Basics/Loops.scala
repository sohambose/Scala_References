package Scala.Basics

object Loops extends App {
  //-----For Loops-----
  for (x <- 1 to 4) {
    val squared = x * x
    println(squared)
  }

  //-----While Loops-----
  var x = 10
  while (x >= 0) {
    println(x)
    x -= 1
  }

  //-----Do-While Loops-----
  x = 0
  do {
    println(x)
    x = x + 1
  } while (x <= 10)

  //-----First 10 Fibonacci sequence using Loops-----
  var sum = 0
  var n1 = 0
  var n2 = 1
  for (i <- 0 to 9) {
    if (i <= 1) print(i+",")
    else {
      sum = n1 + n2
      print(sum + ",")
      n1 = n2
      n2 = sum
    }
  }
}
