package main.scala

object Problem6 extends App {

  def sumOfSquares(r: Range): Int = r.map(x => x * x).sum

  def squareOfSum(r: Range): Int = Math.pow(r.sum, 2).toInt

  println {

    val range = 1 to 100

    squareOfSum(range) - sumOfSquares(range)

  }

}
