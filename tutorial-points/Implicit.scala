object Run {
  implicit class IntTimes(x: Int) {
    def times [A](f: =>A): Unit = {
      def loop(current: Int): Unit =

      if(current > 0){
        f
        loop(current - 1)
      }
      loop(x)
    }
  }
}

import Run._

object Implicit {  // This is a singleton object
  def main(args: Array[String]) {
    4 times println("hello")
  }
}

