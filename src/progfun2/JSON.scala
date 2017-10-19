package progfun2

abstract class JSON {
}

case class JSeq (elem: List[JSON]) extends JSON
case class JObj(bindings: Map[String,JSON]) extends JSON
case class JNum(num: Double) extends JSON
case class JStr(str: String) extends JSON
case class JBool(b: Boolean) extends JSON
case class JNull() extends JSON

object JSON{
  val data=JObj(Map(
    "firstName"->JStr("John"),
    "lastName"->JStr("Smith")

  ))
}