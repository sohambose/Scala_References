package lectures.OOP

object Inheritance extends App {
  class Animal{
    def eat = println("Animal eats")
    val creatureType: String="General Type"
  }

  class Cat extends  Animal

  //val cat = new Cat
  //cat.eat

  //-----Override-----------
  class Dog(override val creatureType: String ) extends Animal{
    //override def eat: Unit = println("Dog eats")
    override def eat: Unit = super.eat
    //override val creatureType: String="Domestic Animal"
  }

  val dog= new Dog("Domestic")
  dog.eat
  println(dog.creatureType)

  //-------------Constructors--------------
  class Person(name: String, age: Int){
   def this(name:String)= this(name,0)
  }
  //class Adult0(name1: String, age1: Int) extends Person //Not valid
  class Adult1(name1: String, age1: Int) extends Person(name1,age1) //Valid
  class Adult2(name1: String, age1: Int) extends Person(name1)  //Also Valid

  //---------Polymorphism--------------------
  val unknownAnimal: Animal= new Dog("Watchdog")
  unknownAnimal.eat


}
