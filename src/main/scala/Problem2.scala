package main.scala

object Problem2 extends App {

  def fibSumEven(top: Int) = {
    @annotation.tailrec
    def go(a: Int, b: Int, acc: Int)(p: Int => Boolean): Int =
      if (!p(a)) acc
      else go(b, a + b, acc + (if (a % 2 == 0) a else 0))(p)

    go(1, 2, 0)(_ < top)
  }

  println(fibSumEven(4000000))

}
