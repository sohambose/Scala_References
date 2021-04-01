package lectures.OOP
/*
head= first element of the list(The int value)
tail= remainder of the list
isEmpty= Return if list is empty.
add(int)= new list with this element added
toString= String representation of this list
 */

//----The Abstract Class that subclasses will implement
abstract class MyList {
  def head: Int //The head element of the List
  def tail: MyList  //The tail part of the list
  def isEmpty: Boolean  //Return if list is empty or not.
  def add(element: Int): MyList //Take element and return the whole list with added element
  def printElements: String //For printing elements.
  override def toString: String = "["+ printElements+"]"
}

//This will be a Static implementation of an empty List
//Inherits from MyList
object Empty extends MyList{
  override def head: Int = throw new NoSuchElementException

  override def tail: MyList = throw new NoSuchElementException

  override def isEmpty: Boolean = true

  override def add(element: Int): MyList = new Cons(element, null)

  override def printElements: String = ""
}

class Cons(h:Int, t:MyList) extends MyList{
  override def head: Int = h

  override def tail: MyList = t

  override def isEmpty: Boolean = false

  override def add(element: Int): MyList = new Cons(element,this)

  //--Recursive call to print elements
  //--If tail part is empty? then print head part and exit recusrion
  //--Else head-> Tail in recursion
  override def printElements: String = {
    if (t.isEmpty)  h.toString
    else h+ "->"+ t.printElements
  }
}

object ListTest extends App{
  val list= new Cons(1,new Cons(2,new Cons(3,Empty)))
  val list2= list.add(4)
  println(list.tail.head)
  println(list.add(4).head)
  println(list2.toString)
}

