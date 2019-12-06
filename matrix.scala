import scala.io.StdIn.{readInt,readLine,readBoolean}
import scala.collection.mutable.ArrayBuffer
import Array._
object Matrix
{
  def main(args:Array[String])
{
val m1=readInt()
val n1=readInt()
val m2=readInt()
val n2=readInt()
//var m1=readLine("enter the number of row:").toInt
//var n1=readLine("enter the number of coloum:").toInt
//var m2=readLine("enter the number of row 2:").toInt
//var n2=readLine("enter the number of coloum 2:").toInt
if(n1==m2)
{
println("enter element matrix first")
var matrix= ofDim[Int](m1,n1)
for(i<- 0 until m1;j<- 0 until n1)
{
   matrix(i)(j) = readInt()
}
println("enter matrix element second")
var matrix2= ofDim[Int](m2,n2)
for(i<- 0 until m2;j<- 0 until n2)
{
  matrix2(i)(j) = readInt()
}

println("given matrix first")
for(i<-0 until m1)
{
 for(j<-0 until n1)
{
  print(""+matrix(i)(j))
}
println()
}

println("given matrix second")
for(i<-0 until m2)
{
 for(j<-0 until n2)
{
  print(""+matrix(i)(j))
}
println()
}

println("the resulant matrix is")
var matrix3= ofDim[Int](m1,n2)
for(i<- 0 until m1)
{
 for(j<- 0 until n2)
{
 for(k<- 0 until n1)
{
 matrix3(i)(j)+=matrix(i)(k)*matrix(k)(j)
}
}
}
println("final result")
for(i<- 0 until m1)
{
 for(j<- 0 until n2)
{
 print(""+matrix3(i)(j))
}
println()
}
}
else println("multification is not found")
}
}

 





 