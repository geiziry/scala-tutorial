object week5 {
  val fruit = List("oranges", "apples", "pears")
  val diag3 = List(List(1, 0, 0), List(0, 1, 0), List(0, 0, 1))
  val empty = List()
  val nums = List(2, -4, 5, 7, 1)

  def removeAt(n: Int, xs: List[Int]) = (xs take n) ::: (xs drop n + 1)

  msort(fruit)

  def msort[T](xs: List[T])(implicit ord: Ordering[T]): List[T] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {
      def merge(xs: List[T], ys: List[T]): List[T] = (xs, ys) match {
        case (Nil, ys) => ys
        case (xs, Nil) => xs
        case (x :: xs1, y :: ys1) =>
          if (ord.lt(x, y)) x :: merge(xs1, ys)
          else y :: merge(xs, ys1)
      }


      val (fst, snd) = xs splitAt n
      merge(msort(fst), msort(snd))
    }
  }
  msort(nums)

  def squareList(xs: List[Int]):List[Int]=xs match {
    case Nil => xs
    case y :: ys => y*y :: squareList(ys)
  }

  def squareListMap(xs: List[Int]):List[Int]=
    xs map(x=>x*x)
}