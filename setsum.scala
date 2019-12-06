import scala.io.StdIn.{readLine,readInt}
object SetSum
{ 
   def main(args:Array[String])
{
 var set1=scala.collection.mutable.Set[Int]()
 set1+=(1,2,3,4,5)
 var set2=scala.collection.mutable.Set[Int]()
 set2+=(1,2,3,4,5,6,7)
 var set3 =set1.union(set2)
 println("union is"+set3)
 var avg=set3.sum/(set3.size).toFloat
 println(f"average is $avg%.2f")
 var max=set3.max
 println(" the maximum element "+max)
 var min=set3.min
 println("the minimum element "+min)  

 
     
}
}