package week4
package week3._

trait List[+T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
  def prepend[U>:T](elem: U):List[U]=new Cons(elem,this)


}

class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  override def isEmpty = false
}

object Nil extends List[Nothing] {
  override def isEmpty: Boolean = true
  override def head: Nothing = throw new NoSuchElementException("Nil .head")
  override def tail: Nothing = throw new NoSuchElementException("Nil .tail")
}


object List{
  def apply[T](x1: T, x2: T): List[T] = new Cons(x1, new Cons(x2,  Nil))
  def apply[T](): Nil.type = Nil
}

object test{
  val x: List[String]= Nil
  def f(xs: List[NonEmpty])
}
