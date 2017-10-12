import java.util

42*2
val language:String="Scala"
val language1="Scala"

val age=35

var maxHearRate=210-age*.5

def min(x: Int,y:Int):Int={
  if (x<y)
    return x
  else
    return y
}

min(34,3)

def min1(x:Int,y:Int):Int={
if(x<y)
x
else
y
}

min1(10,50)

def min3(x:Int,y:Int)=if(x<y)x else y

val list=List("a","b","c")

val map=Map(1->"a",2->"b")

list.foreach(value=>println(value))

list.foreach(println)

for (value<-list)print(value)
for (value<-list.reverse)print(value)

val list1=new util.ArrayList[String]

list1 add "World"

new String("A").==(new String("A"))

new String("a") eq new String("a")

new String("b")==new String("b")



class Rational(x: Int, y: Int){
    def numer=x
    def denom=y

    def add(that: Rational)=
        new Rational(numer*that.denom+that.numer*denom,
            denom*that.denom)

    override def toString=numer+"/"+denom
}

object rationals{
    val x=new Rational(1,2)
    x.numer

    val y=new Rational(2,3)
    x.add(y)
}

