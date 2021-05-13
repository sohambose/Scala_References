package Scala.Basics

object Regex extends App {
  val sampleString : String = "This sentence contains the number 40"

  val regexPattern= """.* ([\d]+).*""".r

  val regexPattern(answerStr)= sampleString

}
