package lectures.Basics

object Matching extends App {
  val CheckValue =300
  CheckValue match {
    case 1=> println("One")
    case 2=> println("Two")
    case 3=> println("Three")
    case _ => println("Value not handled")
  }
}
