import scala .collection.mutable.ListBuffer
object list1
{
  def main(args:Array[String])
{
  var l1= List.range(1,100)
  var l2:ListBuffer[Int]= ListBuffer()
  for(i<-l1)
{
  for(j<- 1 to i)
{
  if(i==j*j)

 l2+=i
}
}
println(l2)
}
} 