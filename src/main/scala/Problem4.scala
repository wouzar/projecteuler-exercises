package main.scala

object Problem4 extends App {

  def isPalindrom(n: Int) = n.toString == n.toString.reverse

  val numbers = for {
    x <- Stream.range(100, 999, 1)
    y <- Stream.range(100, 999, 1)
  } yield x * y

  val result = numbers.filter(isPalindrom).max

  println(result)

}
