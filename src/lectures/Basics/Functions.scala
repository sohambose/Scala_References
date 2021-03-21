package lectures.Basics

object Functions extends App {
  //---Simple Function
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  //----Parameter less Function
  def aParamLess(): Int = 40

  println(aParamLess())
  //println(aParamLess) //Same as above

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
  print(BiggerFn(4))
}
