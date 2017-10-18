object pairs {
  val n = 7

  def isPrime(n: Int): Boolean = (2 until n) forall (d => n % d != 0)

  (1 until n) flatMap (i =>
    (1 until i) map (j => (i, j))) filter (pair => isPrime(pair._1 + pair._2))

  //  for (p<- persons if p.age>20)yield p.name
  for {
    i <- 1 until n
    j <- 1 until i
    if isPrime(i + j)
  } yield (i, j)

  val xs=List(3.0,4.0,6,7)
  val ys=List(2,9.0,45,7)

  def scalarProduct(xs: List[Double], ys: List[Double]):Double=
    (for{
      x<-xs
      y<-ys
    }yield (x*y)).sum
  def scalarProduct2(xs: List[Double], ys: List[Double]):Double=
    (for((x,y)<-xs zip ys)yield (x*y)).sum
  for{
    x<-xs
    y<-ys
  }yield (x*y)
  for((x,y)<-xs zip ys)yield (x*y)
  scalarProduct(xs,ys)
  scalarProduct2(xs,ys)
}
