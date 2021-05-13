package Scala.OOP

abstract class MyListGeneric[+A] {
  def head: A //The head element of the List
  def tail: MyListGeneric[A]  //The tail part of the list
  def isEmpty: Boolean  //Return if list is empty or not.
  def add[B>:A](element: B): MyListGeneric[B] //Take element and return the whole list with added element
  def printElements: String //For printing elements.
  override def toString: String = "["+ printElements+"]"
}

//This will be a Static implementation of an empty List
//Inherits from MyList
object EmptyGeneric extends MyListGeneric[Nothing]{
  override def head: Nothing = throw new NoSuchElementException

  override def tail: MyListGeneric[Nothing] = throw new NoSuchElementException

  override def isEmpty: Boolean = true

  override def add[B >: Nothing](element: B): MyListGeneric[B] = new ConsGeneric(element, EmptyGeneric)

  override def printElements: String = ""
}

class ConsGeneric[+A](h:A, t:MyListGeneric[A]) extends MyListGeneric[A]{
  override def head: A = h

  override def tail: MyListGeneric[A] = t

  override def isEmpty: Boolean = false

  override def add[B >: A](element: B): MyListGeneric[B] = new ConsGeneric(element,this)

  //--Recursive call to print elements
  //--If tail part is empty? then print head part and exit recusrion
  //--Else head-> Tail in recursion
  override def printElements: String = {
    if (t.isEmpty)  h.toString
    else h+ "->"+ t.printElements
  }
}

object GenericListImplementation extends App{
  val listInt: MyListGeneric[Int]= new ConsGeneric(1,new ConsGeneric(2,new ConsGeneric(3,EmptyGeneric)))
  val listStr: MyListGeneric[String]= new ConsGeneric("Hello", new ConsGeneric("Hello2",EmptyGeneric))

  println(listInt.toString)
  println(listStr.toString)

}
