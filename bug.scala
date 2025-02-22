```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    x + y
  }
}

object Main extends App {
  val obj = new MyClass(10)
  println(obj.myMethod(5)) // prints 15
  
  val obj2 = new MyClass(10)
  println(obj2.myMethod(5)) // prints 15
}
```