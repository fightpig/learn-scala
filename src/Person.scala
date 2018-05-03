trait Chinese {
  def eat(): Unit = {
    println("我吃饭所以我快乐")
  }
}

trait Japan {
  def eat(): Unit = {
    println("我吃死所以我快乐")
  }
}


class Student extends Japan with Chinese {
  //如果一个类继承的多个trait有相同的方法实现，则必须使用override重写该方法，最右边的with接口的方法会起作用
  override def eat(): Unit = super.eat()
}

object Student {
  def main(args: Array[String]): Unit = {
    val s1 = new Student
    s1.eat()
  }
}
