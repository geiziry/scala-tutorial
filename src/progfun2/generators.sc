import sun.nio.cs.Surrogate.Generator

object generators{
  val integers=new Generator[Int]{
    def  generate=scala.util.Random.nextInt()
  }
}