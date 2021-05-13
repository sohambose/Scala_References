package Scala.Functional

object HOF_Curries extends App {
  def nTimes(f: Int => Int, n: Int, x: Int): Int =
    if (n <= 0) x
    else
      nTimes(f, n - 1, f(x))


  val plusOne= (x: Int) => x+1
  println(nTimes(plusOne,10,1))

  def nTimesBetter(f: Int =>Int, n:Int) : (Int => Int)=
    if (n <=0) (x: Int) =>x
    else (x: Int)=> nTimesBetter(f,n-1)(f(x))

  val plus10= nTimesBetter(plusOne,10)
  println(plus10(1))

  //---Multiple Parameter List:
  def curriedFormatter(c: String)(x: Double) : String= c.format(x)

  val standardFormat: (Double => String) = curriedFormatter("%4.2f")
  val preciseFormat: (Double => String) = curriedFormatter("%10.8f")
  val preciseFormatFull: String = curriedFormatter("%10.8f")(Math.PI)

  println(standardFormat(Math.PI))
  println(preciseFormat(Math.PI))
}
