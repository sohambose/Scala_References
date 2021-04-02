package lectures.OOP

import lectures.OOP.Inheritance.Animal

object Generics extends App {
  class MyList[+T]{
    //use type T inside the class definition
    def add[T1 >: T](element: T1): MyList[T1] = ???
  }

  val lstIntegers= new MyList[Int]
  val lstStrings= new MyList[String]

  //---Generic Methods
  object MyList {
    def empty[T]: MyList[T] = ???
  }

  //Variance Problem:
  class cat extends  Animal
  class dog extends  Animal

  //----1----Covariance:(List of cat can extend List of Animals)
  class covariantList[+T]
  val animal: Animal = new cat
  val animalList: covariantList[Animal]= new covariantList[cat]

  //----2----Invariance: (List of Cat and List of Animals are different)
  //No substitution is allowed.
  class InvariantList[T]
  val invariantList: InvariantList[Animal] = new InvariantList[Animal]

  //----3----Contravariance: ()
  class ContravarientList[-T]
  val ContravarientList: ContravarientList[cat]= new ContravarientList[Animal]

  //--Bounded Types--
  class Cage[T<:Animal](animal: T)
  val cage= new Cage(new dog)

 /* class Car
  val newcage= new Cage(new Car)
*/
}
