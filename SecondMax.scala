import scala.io.StdIn.{readInt,readLine,readBoolean}
object SecondMax
{
 def main(args:Array[String])
  {
   var num=0
   var max1=0
   var max2=0
 for(i<-1 to 5)
{
  print("enter the number")
  num=readInt()

if(num>max1)
{
 max2=max1
 max1=num 
}
}
println("maximum number is"+max1)
println("second maximum numer is"+max2)
}
}