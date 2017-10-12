object intsets {
new InSet

  override def incl(x: Int): InSet =
}
  abstract class InSet {
    def incl(x: Int): InSet

    def contains(x: Int): Boolean
  }

}

