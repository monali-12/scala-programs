import scala.io.StdIn.{readInt,readLine}
import scala.collection.mutable.ArrayBuffer
import Array._
object Transposematrix
{
  def main(args:Array[String])
{ 
 println("enter row")
var n1=readInt()
 println("enter the coloum")
 var m1=readInt() 
println("emter matrix")
var A = ofDim[Int](n1,m1)
  for(i<-0 until n1;j<- 0 until m1)
{

 
    A(i)(j)=readInt()
 
 
}
for(i<-0 until n1;j<-0 until m1)
{
  print(" "+A(i)(j))
} 
println()
}
}


