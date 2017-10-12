object rationals {

  val x = new Rational(1, 3)
  val y = new Rational(5, 7)
  val z = new Rational(3, 2)
  new Rational(2)

  class Rational(x: Int, y: Int) {
    require(y != 0, "denom must not be zero")

    val numer = x
    val denom = y

    def this(x: Int) = this(x, 1)

    def -(that: Rational) = this + -that

    def +(that: Rational) =
      new Rational(numer * that.denom + that.numer * denom,
        denom * that.denom)

    def unary_- : Rational = new Rational(-numer, denom)

    def max(that: Rational) = if (this < that) that else this

    def <(that: Rational) = numer * that.denom < that.numer * denom

    override def toString: String = {
      val g = gcd(x, y)
      s"${numer / g}/${denom / g}"
    }

    private def gcd(a: Int, b: Int): Int =
      if (b == 0) a else gcd(b, a % b)

  }

  x - y - z
  y + y
  x < y
}



