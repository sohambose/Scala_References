package Scala.Basics

object Functions extends App {
  //---Simple Function
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }
  println(aFunction("hello", 3))

  //----Parameter less Function
  def aParamLess(): Int = 40
  println(aParamLess())
  println(aParamLess) //Same as above

  //----Recursive Function is Scala:
  def aRecursiveFn(str: String, n: Int): String = {
    if (n == 1) str
    else str + aRecursiveFn(str, n - 1)
  }
  println(aRecursiveFn("hello", 4))

  //----Auxiliary Functions inside another function:
  def BiggerFn(n: Int): Int = {
    def SmallerFn(a: Int, b: Int): Int = a + b
    SmallerFn(n, n - 1)
  }
  println(BiggerFn(4))

  //-----Simple Text Greeting Function:
  def GreetingMsg(name: String, age: Int): String = {
    val strOut = "Hello my name is " + name + " and my age is " + age
    strOut
  }
  println(GreetingMsg("Soham", 31))

  //-----Factorial of a number
  def factorial(n: Int): Int = {
    if (n <= 0) 1
    else n * factorial(n - 1)
  }
  println(factorial(5))

  //---Fibonacci Series:
  println("----Fibonacci Number-------------")
  def Fibonacci(n: Int): Int = {
    if (n == 1 || n==2) 1
    else Fibonacci(n - 1) + Fibonacci(n - 2)
  }
  println(Fibonacci(6))

  //---Check Prime Number:
  //A prime number is a positive integer that is divisible only by 1 and itself.
  //For example: 2, 3, 5, 7, 11, 13, 17
  println("----Check Prime Number-------------")
  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)
    }
    isPrimeUntil(n / 2)
  }
  println(isPrime(7))


  //-----Function that takes a another Function as argument:
  def transformInt(x: Int, f: Int => Int): Int={
    f(x)
  }
  def fn1(x: Int): Int={x*10}

  println(transformInt(10,fn1))
  print(transformInt(10,x=> x*10))

  def ConvertToUpperCase(inputStr: String): String={
    if(inputStr.isEmpty) "String is Empty"
    else inputStr.toUpperCase
  }
  println(ConvertToUpperCase("abcdefgh"))

  def processString(inputStr: String, fn: String=>String):String={
    fn(inputStr)
  }
  println(processString("abcd",ConvertToUpperCase))
  println(processString("abcd", str => str.toUpperCase) )//Same using lambda

}
