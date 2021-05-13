package Scala.OOP

object Objects extends  App {

  object Person {
    val N_Eyes=2
    def canFly: Boolean= false
  }
  println(Person.N_Eyes)
  println(Person.canFly)

  //--Singleton:
  val p1= Person
  val p2= Person
  println(p1==p2)
}
