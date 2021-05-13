package Scala.OOP

object Basics extends  App {
  val person= new Person("Soham",31)
  println(person.x)
  println(person.Greet("Ram"))
  println(person.Greet())

  val author= new Writer("Charles", "Dickens",1812)
  val imposter= new Writer("Charles", "Dickens",1812)
  val novel= new Novel("Great Expectations", 1861,author)
  println(novel.authorAge)
  println(novel.isWrittenBy(author))
  println(novel.isWrittenBy(imposter))  //Returns False

  val ctrObj1=new Counter(2)
  println(ctrObj1.count)

  val ctrObj2=ctrObj1.inc(5)
  println(ctrObj2.count)
  println(ctrObj1.count)  //ctrObj1 is immutable
}

//----------Counter Class----------------
/*
* Receive an int val
* method1- Get current count
* method2- Increment/Decrement the counter by 1 and return a counter
* method3- Overload of method2. increment by n instead of 1. Take n input.*
* */

class Counter(val count: Int){
  def inc= {
    println("incrementing..")
    new Counter(count+1)  //immutability
  }


  def dec= {
    println("incrementing..")
    new Counter(count-1)  //immutability
  }

  //Overloads--
  //def inc(n:Int)= new Counter(count+n)
  //def dec(n:Int)= new Counter(count-n)

  //Another implementation that uses the 1st inc/dec methods
  def inc(n:Int): Counter= {
    if (n<=0) this //the same instance that is calling this method
    else inc.inc(n-1) //--inc=a new Counter object that contains inc(n). So inc.inc(n-1). At last return this- means return
  }



}


//---------------------------------------------------------------

class Person(name: String,val age:Int){
  val x=22
  println("Inside Class")

  def Greet(name: String): Unit= {
    println(s"${this.name} says Hello $name")
  }
  def Greet(): Unit= println(s"Hello ${this.name}")
}

class Writer(firstname: String, surName: String,val year: Int){
  def FullName: String= firstname+ " " + surName
}

class Novel(name: String, releaseYear: Int, author: Writer){
  def authorAge = releaseYear- author.year

  def isWrittenBy(author: Writer)= {
    author==this.author
  }

  def copy(newYear: Int): Novel= new Novel( name,newYear,author)
}









