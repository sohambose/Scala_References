package Scala.Basics

object StringManipulations extends  App {

  val str: String= "Hello, I am learning Scala"

  println(str.charAt(2))  //Return character at the index. Index starts from 0.
  println(str.substring(7,11))  //Substring Function
  println(str.split(" ")) //Split string based on delimiter. Returns an array
  println(str.split(" ").toList) //Split string based on delimiter. Returns an array
  println(str.startsWith("Hello")) //True
  println(str.replace("Hello","Hi")) //Replace
  println(str.toLowerCase()) //Case change of all characters
  println(str.toUpperCase()) //Case change of all characters
  println(str.length()) //Length of a string

  //-------Scala own String Functions--------
  val numStr="45"
  println(numStr.toInt) //Directly parse to int

  val aNumberStr="45"
  val aNumberInt= aNumberStr.toInt
  println('a'+:aNumberStr:+'z')
  println(aNumberStr.reverse)
  println(str.take(2))

  //----String Interpolators:
  //1--S INTERPOLATOR
  val name= "David"
  val age= 12
  val greeting= s"Hello, my name is $name and I am $age years old"
  println(outStr)

  //2--F INTERPOLATOR
  val amt=4.5f
  val outStr= f"$name can walk at speed $amt%2.2f"
  println(outStr)

  //3-- Raw Interpolator
  println(raw"The escape  \n is used for new line")

  val rawStr="The escape  \n is used for new line"
  println(raw"$rawStr")


}
