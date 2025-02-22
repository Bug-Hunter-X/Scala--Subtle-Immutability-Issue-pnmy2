```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = x + y
}

object Main extends App {
  val obj = new MyClass(10)
  println(obj.myMethod(5)) // prints 15

  // Demonstrating that no unintended side effects occur even with multiple object creations.
  val obj2 = new MyClass(20)
  println(obj2.myMethod(5)) // prints 25
}
```