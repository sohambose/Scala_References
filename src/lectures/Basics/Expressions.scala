package lectures.Basics

object Expressions extends App {
  val x=1+2 //x is int - Compiler knows this
  println(x)

  println(2+3*4)

  var xVar= 2
  xVar+=3   //Side Effect
  println(xVar)


  var i=0
  while (i<10){
    println(i)
    i+=1
  }

  var aRandomVar=1
  val weirdVal :Unit= aRandomVar=2
  println(weirdVal)

  val codeBlock={
    val y=2
    val z=y+3

    if(z>2) "y" else "n"
  }


  val someval= {
    2<3
  }

  val someOtherVal= {
    if (someval) 239 else 223
    42
  }
  println(someOtherVal)


  //---Example of code block:
  println({
    val x=10
    x+30
  })

}



