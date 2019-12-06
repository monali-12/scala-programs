import scala.io.StdIn.{readLine,readInt}
object SetSum
{ 
   def main(args:Array[String])
{
 var set1=scala.collection.mutable.Set[String]()
 set1+=("mona","sona","pranu")
 var set2=scala.collection.mutable.Set[String]()
 set2+=("mona","dipu","madu")
 var set3 =set1.intersect(set2)
 println("intersection is"+set3)
 set1 -=("mona")
 set2 -=("mona")
 var set4=set1.union(set2)
 println("remove common element after the merge set"+set4)  
}
}