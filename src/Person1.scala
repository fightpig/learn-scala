class Person1 {
  val id = 1
  var age: Int = 10
  private val name = "zzz"
  private[this] var hobby: String = "sing"
}

class Person2 private(val id: Int, var age: Int, private val name:String , hobby:String = "sing") {
  println(id)
  println(this.id)


}

object Person2 {
  def main(args: Array[String]): Unit = {
    val p2 = new Person2(1,100,"zhangsan")
  }
}