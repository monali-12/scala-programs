import scala.io.StdIn.{readLine,readInt}
object Array
{
 def main(args:Array[String])
{
  
  var str3=new Array[String](4)
  println("enter the string")
  
for(i<-0 until 4)
{
  println("enter the string",i+1)
  str3[i]=readLine()

}
 
  println("enter the string")
  var str1=readLine()
  var str2=str3[i]:+str1
  for(j<-str2)
  {
    println(j)
}
}
}
 
