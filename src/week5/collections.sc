val fruit = List("oranges", "apples", "pears")
val diag3 = List(List(1, 0, 0), List(0, 1, 0), List(0, 0, 1))
val empty = List()
val nums = List(2, -4, 5, 7, 1)

nums filter (x => x > 0)
nums filterNot (x => x > 0)
nums partition (x => x > 0)
nums takeWhile (x => x > 0)
nums dropWhile (x => x > 0)
nums span (x => x > 0)

val data = List("a", "a", "a", "b", "c", "c", "a")

def pack[T](xs: List[T]): List[List[T]] = xs match {
  case Nil => Nil
  case x :: xs1 =>
    val (first, rest) = xs span (y => y == x)
    first :: pack(rest)
}

pack(data)

def encode[T](xs: List[T]):List[(T,Int)]=
  pack(xs)map(ys=>(ys.head,ys.length))

encode(data)

def concat[T](xs: List[T],ys: List[T]):List[T]=
  (xs foldRight  ys)(_::_)

concat(List(5,6,7,8),List(3,7,6))


def mapFun[T, U](xs: List[T], f: T => U): List[U] =
  (xs foldRight List[U]())( ??? )

def lengthFun[T](xs: List[T]): Int =
  (xs foldRight 0)( ??? )

val xs=Array(1,2,3,44)
xs map(x=>x*2)

val s="Hello World"

s filter(c=>c.isUpper)

val r:Range=1 until 5
val f:Range=1 to 5
val e:Range=1 to 5 by 2
val u:Range=1 to 5 by -2

s exists(c=>c.isUpper)
s forall(c=>c.isUpper)

val pairs=List(1,2,3)zip s
pairs.unzip

s flatMap(c=> List('.',c))

xs.sum
xs.max

def scalarProduct(xs: Vector[Double], ys: Vector[Double]):Double=
  (xs zip ys).map{case(x,y)=>x*y}.sum

def scalarProduct2(xs: Vector[Double], ys: Vector[Double]):Double=
  (xs zip ys).map{xy=>xy._1*xy._2}.sum

def isPrime(n: Int):Boolean=(2 until n)forall(d=>n%d!=0)
isPrime(19)

def primeNumbers(xs: Range)=
  xs filter  (x=>{(isPrime(x))})

primeNumbers(0 to 100).length
