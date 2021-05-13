package Scala.OOP

object MethodNotation extends App {
  class Person(val name: String, favMovie: String, var age: Int=0){
    def likes(movie: String): Boolean= movie==favMovie
    def +(person :Person): String=s"${this.name} hangs out with ${person.name}"
    def +(attr : String): Person= new Person(s"${this.name} $attr","titanic")

    def unary_! : String=s"$name !!!!!"
    def IsEmployed : Boolean = true

    def apply(): String = s"Hi, My name is $name"
    def apply(count: Int)=s"$name watched $favMovie $count times"

    def learns(topic: String): String= s"${this.name} learns $topic"
    def learnScala = this learns "Scala"

    def unary_+ : Person= new Person(name,favMovie,age+1)
  }
  val mary= new Person("mary","Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception" )  //equivalent-- Infix Notation/Operator notation

  println(!mary)
  println(mary.unary_!)

  println((+mary).age)

  println(mary(5))

  //println(mary IsEmployed)
  val tom= new Person("tom","Titanic")
  println(tom + mary)

  println((mary+"the rockstar")())
  println(mary learns "Scala1")
  //println(mary learnScala)

  println(1+2)
  println(1.+(2)) //same

  //Apply:
  println(mary.apply())
  println(mary())

  //---Prefix Notation
  val x = -1
  val y = 1.unary_-
  println(x)
  println(y)
}
