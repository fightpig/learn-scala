object TestTuple {
  def main(args: Array[String]): Unit = {
    val t1 = (1, "2", 'a', true)

    for(e <- t1.productIterator) {
      println(e)
    }
  }
}
