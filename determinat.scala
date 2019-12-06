import scala.io.StdIn.{readInt,readLine,readBoolean}
object Determinat
{
  def main(args:Array[String])
{
 var a=Array(Array(1,2,3),Array(4,5,6),Array(7,8,9))
 var b=Array(Array(1,2),Array(3,4))
 var det1=(b(0)(0)*b(1)(1))-(b(0)(1)*b(1)(0))
 println("determent 1 is"+det1)
 var det2=((a(0)(0)*(a(1)(1)*a(2)(2)-a(1)(2)*a(2)(1)))-(a(0)(1)*(a(1)(0)*a(2)(2)-a(1)(2)*a(2)(0)))+(a(0)(2)*(a(1)(0)*a(2)(1)-a(1)(1)*a(2)(0))))

println("determinat second is"+det2)
}
}