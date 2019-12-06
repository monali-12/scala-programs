import scala.io.StdIn.{readLine,readInt}
object StringUpper
{ 
  def main(args:Array[String])
{
  var str="Scala is Object Orinted Language"
 // var str=readLine("Scala is Object Orinted").toString
  var a=""
  var count=0
    for(i<-str)
{ 
   if(i.isUpper)
{
 count=count+1
}
a =a+i
}

println("oringanal string is"+a)
println("uppercase letter count"+count)
println("string lowercase="+a.toLowerCase())
println("string uppercase="+a.toUpperCase())
}
}