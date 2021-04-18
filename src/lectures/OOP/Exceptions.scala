package lectures.OOP

object Exceptions extends App {

  /*val x: String = null
  if (x == null)
    throw new NullPointerException*/


  def getInt(isException: Boolean): Int =
    if (isException) throw new RuntimeException("Exception Thrown From Code")
    else 100

  val ExceptionVal= try {
    getInt(true)
  }
  catch {
    case e: RuntimeException => println("Caught a Runtime Exception")
  }
  finally {
    println("Final Code")
  }


  //-----Define own Exception:
  class MyException extends Exception
    val exception= new MyException

    //throw exception


}
