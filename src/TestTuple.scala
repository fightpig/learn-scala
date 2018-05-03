object TestTuple {
  def main(args: Array[String]): Unit = {
    val re = List("hello world hello scala")
      .flatMap(_.split(" "))
      .map((_,1))
      .groupBy(_._1)

      .map(t => {
        var size = 0
        t._2.map( t => {
          size += t._2
        })
        (t._1,size)
      })
      .toList.sortBy(_._2).reverse.toBuffer
    println(re)

  }
}
