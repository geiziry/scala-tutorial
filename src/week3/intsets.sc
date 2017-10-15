object intsets {
new InSet

  override def incl(x: Int): InSet =
}
  abstract class InSet {
    def incl(x: Int): InSet

    def contains(x: Int): Boolean
  }

}

class Empty extends InSet{
  def contains(x:Int):Boolean=false
  def incl(x:Int):InSet=new NonEmpty(x,new Empty,new Empty)
}

class NonEmpty(elem: Int, left: InSet, right: InSet)extends InSet{
  def contains(x:Int):Boolean=
    if(x<elem)left contains x
    else if (x>elem)right contains x
    else true

  def incl(x: Int):InSet=
    if(x<elem) new NonEmpty(elem,left incl x ,right)
    else if (x>elem) new NonEmpty(elem, left,right incl x)
    else this
}