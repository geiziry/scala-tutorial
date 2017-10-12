package tutor

import java.io.File
import java.nio.CharBuffer

import com.sun.glass.ui.Window.Level

import scala.collection.JavaConverters._
import scala.collection.mutable

class CustomerScala (val name: String, val address: String){
  var id=""

}
object Customer1{
  def main(args: Array[String]) {
    val eric=new CustomerScala("Eric","29 Acacia Road")
    eric.id_=("yy")
  }
}


class DiscountedCustomer(name:String,address:String)extends CustomerScala(name,address){
  override def clone(): AnyRef = super.clone()
}

object Logger{
  def log(level: Level,string:String){
    printf("%s %s%n",level,string)
  }
}

trait Readable{
  def read(buffer: CharBuffer):Int
}

class FileReader(file: File)extends Readable with AutoCloseable{
  override def read(buffer: CharBuffer): Int = ???

  override def close(): Unit = ???
}

trait Sortable[A<: Ordered[A]]extends Iterable[A]{
  def sort: Seq[A]={
    this.toList.sorted
  }
}

class Customers extends Sortable[CustomerScala]{
  private val customers=mutable.Set[CustomerScala]()
def add(customer: CustomerScala): Boolean =customers.add(customer)
  override def iterator: Iterator[CustomerScala] = customers.iterator
}

//class CustomersSortableBySpend extends Customers{
//  override def  sort:List[Customer]= {
//    this.toList.sorted(new ordering[Customer]{
//      def compare(a: Customer, b: Customer)=b.total.compare(a.total)
//    })
//  }
//}