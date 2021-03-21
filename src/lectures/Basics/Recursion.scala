package lectures.Basics

import scala.annotation.tailrec

object Recursion extends App {

  //-----Factorial of a number
  def factorial(n: Int): Int = {
    if (n <= 1) {
      println("We know factorial(1) is 1")
      1
    }
    else {
      println("Trying to Compute factorial of " + n + ". Requires factorial of " + (n - 1) + " Call to factorial(" + (n - 1) + ") is stored in Stack")
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n + ";Pop factorial(" + (n - 1) + ") from Stack. Result= " + result)

      result
    }
  }

  //----Factorial using Tail Recursion:
  @tailrec
  def factTailRecursion(n: Int, accumulator: Int): BigInt = {
    if (n <= 1) {
      println("n= " + n + " Return Accumulator = " + accumulator)
      accumulator
    }
    else {
      println("n= " + n + " and accumulator= " + accumulator + ";Call recursive factHelper(" + (n - 1) + "," + (n * accumulator) + ")")
      factTailRecursion(n - 1, n * accumulator)
    }
  }

  println(factTailRecursion(10, 1))


  //-----Concatenate a String n times using Tail Recursion:
  def ConcatFnWrapper(strIn:String, i:Int):String={

    def ConcatStringTailRec(str: String, n: Int,originalStr:String): String = {
      if (n == 1)
        str
      else {
        ConcatStringTailRec(str+originalStr,n-1,originalStr)
      }
    }

    ConcatStringTailRec(strIn,i,strIn)  //Call the Recursive Fn
  }
  println(ConcatFnWrapper("Soham",5))


  //-----Prime Check using Tail Recursion:
  def isPrimeWrapper(n: Int): Boolean = {
    @tailrec
    def isPrimeChecker(i: Int): Boolean = {
      if (i<=1) true
      else {
        if (n % i != 0) isPrimeChecker(i - 1)
        else false
      }
    }
    isPrimeChecker((n/2))
  }
  println(isPrimeWrapper(13))
}
