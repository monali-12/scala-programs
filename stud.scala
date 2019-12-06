object Student
{
  def main (args:Array[String]):Unit=
{
  var student=Map("monaloi"->88.0f,"pranali"->90.0f,"dipali"->67.35f)
   print(student)
 var max=0.0f
 var stud:String="";
 println("student\tmarks")
 for((k,v)<-student)
{
  if(v > max)
   {
    max=v
   stud=k
   }
    println(k+ "\t"+v)

   
}
println("topper"+stud+"\t"+max)
}
} 