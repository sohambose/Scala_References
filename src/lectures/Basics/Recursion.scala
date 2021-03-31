package lectures.Basics

import scala.annotation.tailrec

object Recursion extends App {

  //-----Factorial of a number----------------
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

  //----Factorial using Tail Recursion----------------
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


  //-----Concatenate a String n times using Tail Recursion----------------
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

  //---Method 2:
  def ConcatFnWrapper2(strIn:String, i:Int):String={
    def ConcatStringTailRec2(str: String, n: Int,accumulator:String): String = {
      if (n == 0)
        accumulator
      else {
        ConcatStringTailRec2(str,n-1,accumulator+str)
      }
    }
    ConcatStringTailRec2(strIn,i,"")  //Call the Recursive Fn
  }
  println(ConcatFnWrapper2("Bose",5))


  //-----Prime Check using Tail Recursion----------------
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

  def isPrimeWrapper2(n: Int): Boolean = {
    @tailrec
    def isPrimeChecker2(i: Int, isStillPrime: Boolean): Boolean = {
      if(!isStillPrime) false
      else if (i<=1) true
      else {
        isPrimeChecker2(i - 1,n % i != 0 && isStillPrime)
      }
    }
    isPrimeChecker2((n/2), true)
  }
  println(isPrimeWrapper(13))


  //------Fibonacci Number using Tail Recursion----------------
  def FibonacciWrapper(n: Int): Int = {
    def FibonacciTail(num:Int,i1:Int,i2:Int,Sum:Int): Int={
      if (num <= 2 ) Sum
      else {
        //println(i1+"+"+i2+"="+Sum)
        //--Logic i1+i2=Sum; Thereafter- i1= Prev Sum; i2=Prev i1
        FibonacciTail(num-1,Sum,i1,Sum+i1)
      }
    }
    FibonacciTail(n,1,1,1)
  }
  println(FibonacciWrapper(7))

  def FibonacciWrapper2(n: Int): Int = {
    def FibonacciTail2(i:Int,last:Int,nextToLast:Int): Int={
      if (i>=n ) last
      else {
        FibonacciTail2(i+1,last+nextToLast,last)
      }
    }
    if(n<=2) 1
    else FibonacciTail2(2,1,1)
  }
  println(FibonacciWrapper2(7))

}
