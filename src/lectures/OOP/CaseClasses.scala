package lectures.OOP

object CaseClasses extends App {
  case class Person(name:String, age: Int)

  val jim= new Person("Jim",32)
  println(jim.age)

  println(jim.toString)
  println(jim)

  val jim2= new Person("Jim",32)
  println(jim==jim2)

  val jim3= jim.copy(age = 40)
  println(jim3)
}
