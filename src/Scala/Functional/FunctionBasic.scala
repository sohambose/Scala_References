package Scala.Functional

object FunctionBasic extends App{

  val stringToIntConverter= new Function1[String,Int] {
    override def apply(v1: String): Int = v1.toInt
  }
  println(stringToIntConverter("3")+1)

  val Adder= new Function2[Int,Int, Int] {
    override def apply(v1: Int, v2: Int): Int = v1+v2
  }
  println(Adder(2,3))

  //The same can be written in syntactic sugar as:
  val Adder2= new ((Int, Int) => Int) {
    override def apply(v1: Int, v2: Int): Int = v1+v2
  }
  println(Adder2(2,3))

  //--Take 2 string and concat:
  val concater1 : Function2[String,String, String] = new Function2[String,String, String] {
    override def apply(v1: String, v2: String): String = v1+v2
  }
  println(concater1("Soham1 ","Bose1"))

  val concater= new ((String,String) => String){
    override def apply(v1: String, v2: String): String = v1+v2
  }
  println(concater("Soham ","Bose"))

  //---Define a Function which takes an int and returns another function -
  //---which takes an int and returns an int.
  val superAdder: Function1[Int, Function1[Int,Int]] = new Function1[Int, Function1[Int,Int]] {
    override def apply(x: Int): Function1[Int,Int] = new Function1[Int,Int] {
      override def apply(y: Int): Int = x + y
    }
  }

  val adder3=superAdder(30) //This will return a function of type Function1[Int,Int]. i.e. Takes Int, Returns Int
  println(adder3) //<function1>
  println(adder3(40))
  println(superAdder(30)(40))













  val specialFunction2: Int => Int => Int = (x: Int) => (y: Int) => x + y

}
