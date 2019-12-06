import scala.io.StdIn.{readLine,readInt}
object DBO
{
  def binary(num:Int)=
 {
  var b:Int=0
  var i=1
  var r=0
  
  var n=num
  
 while(n!=0)
{
   r=n%2
   n=n/2
   b=b+r*i
   i=i*10
}
println(b)
}
def octal(num:Int)=
{
 var r=0
var o:Int=0
var i=1
var dec=num

while(dec!=0)
{
  r=dec%8
  dec=dec/8
  o=o+r*i
  i=i*10
}
println(o) 
}
def main(args:Array[String])
{
  val r1=new scala .util.Random
  binary(r1.nextInt(11))
  octal(r1.nextInt(11))
//var b1:Int=0
//var o1:Int=0
//var no:Int=readInt()

//b1=binary(no)
//println(b1)
//o1=octal(no)
//println(o1)
}
} 