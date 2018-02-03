package main.scala

import scala.collection.mutable

object Problem7 extends App {

  def hasDivider(n: Long, s: mutable.Set[Long]): Boolean = s.exists(n % _ == 0)

  def primes: Stream[Int] = {
    val s = mutable.Set[Long]()

    Stream.from(2).filter { n: Int =>
      if (!hasDivider(n, s)) {
        s.add(n)
        true
      } else false
    }
  }

  println {

    primes.take(10001).last

  }



}
