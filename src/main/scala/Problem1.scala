package main.scala

object Problem1 extends App {

  def f(top: Int) = {

    def sumUpTo(n: Int) = (n + 1) * n / 2

    def partSum(n: Int) = sumUpTo((top - 1) / n) * n

    partSum(3) + partSum(5) - partSum(15)

  }

}
