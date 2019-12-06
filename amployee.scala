class Employee(var ename:String,var dept:String)
{
  def display()
{
  println("Name"+ename)
  println("department"+dept)
}
}
object ED
{
  def main(args:Array[String])
{
 var e1=new Employee("monali","cs")
 var e2=new Employee("pranali","cs")
 var e3=new Employee("dipali","ms")
 var e4=new Employee("sonali","mr")
 var e5=new Employee("pragati","cs")
 var m1:Map[Int,Employee]=Map(1->e1,2->e2,3->e3,4->e4,5->e5)
 var value = new Employee("monali")
 for((k,v)<-m1)
{
 if(v==value)
 v.display()
}
}
}