package Scala.OOP

object AbstractDataTypes extends App {
  abstract class Animal{
    val creatureType:String //No Value- So Abstract
    def eat:Unit  //Not implemented- So Abstract
  }

  class dog extends  Animal{
    override val creatureType: String = "Canine"
    override def eat: Unit = println("Dog eats")
  }

  trait Carnivores{
    def eat(animal: Animal): Unit
  }
  class Crocodile extends Animal with Carnivores{
    override val creatureType: String ="Croc"

    override def eat: Unit = println("Croc eating")

    override def eat(animal: Animal): Unit = println(s"Croc eating ${animal.creatureType}")
  }

  val dog= new dog
  val croc= new Crocodile
  croc.eat(dog)
}
