package lectures.Functional

object AnonymousFunctions extends App {
  val doubler= new Function[Int,Int] {
    override def apply(x: Int): Int = x * 2
  }
  println(doubler(5))

  val doubler2: Int => Int = (x: Int) => x*2

  val adder: (Int,Int) => Int = (a,b) => a+b

  val DoSomething: () => Int = ()=>3
  println(DoSomething)
  println(DoSomething())

  val StrToInt= { (str : String) =>
    str.toInt
  }

  val incrementer : Int => Int = (x: Int) => x + 1
  val incrementer2 : Int => Int = _ + 1

  val twoAdder : (Int, Int) =>Int = (x: Int, y: Int) => x+y
  val twoAdder2 : (Int, Int) =>Int = _+_


  val superAdder: Function1[Int, Function1[Int,Int]] = new Function1[Int, Function1[Int,Int]] {
    override def apply(x: Int): Function1[Int,Int] = new Function1[Int,Int] {
      override def apply(y: Int): Int = x + y
    }
  }

  val SuperAdderMin: Int => Int =>Int = (x :Int)=> (y: Int) => x+y
}
