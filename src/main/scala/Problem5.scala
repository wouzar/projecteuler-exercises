package main.scala

object Problem5 extends App {

  println {

    Stream.from(20, 20).find { x =>

      (11 to 20).forall(x % _ == 0)

    }

  }

}
