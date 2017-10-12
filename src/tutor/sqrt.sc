//def sqrtIter(guess:Double,x:Double):Double=
//if(isGoodEnough(guess,x))guess
//else sqrtIter(improve(guess,x),x)
//
//def isGoodEnough(guess: Double, x: Double)=
//    abs(guess*guess-x)<0.001
//
//def improve(guess: Double, x: Double)=
//  (guess+x/guess)/2
import scala.math._

def factorial(n: Int): Int = {
  def loop(acc: Int, n: Int): Int =
    if (n == 0) acc
    else loop(acc * n, n - 1)

  loop(1, n)
}

factorial(5)

def sum(f: Int => Int, a: Int, b: Int) = {
  def loop(a: Int, acc: Int): Int =
    if (a > b) acc
    else loop(a + 1, f(a) + acc)

  loop(a, 0)
}

sum(x => x * x, 6, 5)

def product(f: Int => Int)(a: Int, b: Int): Int =
  if (a > b) 1
  else f(a) * product(f)(a + 1, b)

product(x => x * x)(5, 7)
//x*(x-1)
def fact(f: Int => Int)(a: Int): Int =
  if (a > 1) a * fact(f)(a - 1)
  else a

fact(x => x * (x - 1))(3)

val tolerance = 0.0001
def isCloseEnough(x: Double, y: Double) =
  abs((x - y) / x) / x < tolerance
def fixedPoint(f: Double => Double)(firstGuess: Double) = {
  def iterate(guess: Double): Double = {
    val next = f(guess)
    if (isCloseEnough(guess, next)) next
    else iterate(next)
  }

  iterate(firstGuess)
}

fixedPoint(x => 1 + x / 2)(1)

def sqrt(x: Double) = fixedPoint(y => (y + x / y) / 2)(1)

sqrt(9)

def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2

def sqrt2(x: Double) =
  fixedPoint(averageDamp(y => x / y))(1)

sqrt2(2)

val list = List(1, 2, 3, 6)
list.
  map(_ + 1)

s"list values are$list."

(1 to 5).map { case x$1@x => (x$2, x$1) }.map { case (j, x) => x }