package lectures.Basics

object DataStructures extends App {

  //-----Tuples-----
  val tupleEg=("abc","efg",1,true)
  println(tupleEg)

  println(tupleEg._1)

  //-----Key Value Pair-----
  val keyValEg="Pi" -> 3.14
  println(keyValEg)
  println(keyValEg._1)
  println(keyValEg._2)
  //--E.g2:
  val keyValEg2="One" -> "Two" -> "Three"
  println(keyValEg2)
  println(keyValEg2._1)
  println(keyValEg2._2)


  //------Lists-----
  val lstEg= List("Abc","EFGH","Str3","Str4")
  println(lstEg(0))

  println(lstEg.head)
  println(lstEg.tail)

  //--Iterate through list:
  for (item <- lstEg){
    println(item+",")
  }

  //--Reverse a list using Map Function:
  val reverseLstEg= lstEg.map( (item:String) => {item.reverse})
  for (item <- reverseLstEg){
    print(item +",")
  }

  //--Sum of elements using Reduce:
  println()
  val numList= List(1,2,3,4,5)
  val sum=numList.reduce((x: Int,y: Int) => {
    println("------------")
    println("x ="+x)
    println("y="+y)
    x+y
  })
  println(sum)

  //---Filter List:
  val filteredList= numList.filter(x=>x!=5)
  for (item <- filteredList){
    print(item +",")
  }

  val filteredList3= numList.filter(_!=3)
  for (item <- filteredList3){
    print(item +",")
  }

  //---Concatenate List:
  println()
  val numList1= List(1,2,3,4,5)
  val numList2= List(3,4,6,7,9)
  val concatList= numList1++numList2
  for (item <- concatList){
    print(item +",")
  }

  println()
  val concatListDistinct= concatList.distinct
  for (item <- concatListDistinct){
    print(item +",")
  }

  //---Reverse a List:
  println
  val reverseLst= numList1.reverse
  for (item <- reverseLst){
    print(item +",")
  }

  //--Sort a List:
  println
  val sortedLst= reverseLst.sorted
  for (item <- sortedLst){
    print(item +",")
  }

  //--Max Value
  val max= sortedLst.max
  println(max)

  //--Total:
  println(sortedLst.sum)

  //--Check if element exists:
  println(sortedLst.contains(2))  //Returns True/false

  //------------MAPS----------------
  val mapEg= Map(1->"One", 2->"Two",3->"Three", 4->"Four", 5->"Five")
  println(mapEg(2)) //Two
  println(mapEg.contains(999))

  //println(mapEg(999))
  val getmap999= util.Try(mapEg(999)) getOrElse "Item Not Found"
  println(getmap999)









}
