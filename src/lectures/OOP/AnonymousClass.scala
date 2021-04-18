package lectures.OOP

object AnonymousClass extends App {

  abstract class Animal {
    def eat: Unit
  }

  class AnonymousClass$$anon$1 extends Animal{
    override def eat: Unit = println("Funny Animal")
  }
  val funnyAnimal2: AnonymousClass$$anon$1= new AnonymousClass$$anon$1
  println(funnyAnimal2.getClass)

  val funnyAnimal: Animal= new Animal {
    override def eat: Unit = println("Funny Animal")
  }

  println(funnyAnimal.getClass)


  class Person(name:String){
    def sayHi: Unit= println(s"Hi, My name is $name")
  }

  val jim= new Person("Jim"){
    override def sayHi: Unit = println(s"Hello, My name is Jim")
  }



}
