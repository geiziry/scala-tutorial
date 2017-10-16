package week4

abstract class Nat {
  def isZero: Boolean

  def predecessor: Nat

  def +(that: Nat): Nat

  def -(that: Nat): Nat
  def successor: Nat = new Succ(this)
}

object Zero extends Nat {
  override def isZero: Boolean = true

  override def predecessor: Nat = throw new Error("0.predecessor")


  def + (that: Nat)=that

  def - (thtat: Nat)=if(thtat.isZero)this else throw new Error("negative number")

}

class Succ(n: Nat)extends Nat{
  override def isZero: Boolean = false

  override def predecessor: Nat = n

  def + (that: Nat)=new Succ(n+that)
  def - (that: Nat)=if(that.isZero)this else n-that.predecessor
}
