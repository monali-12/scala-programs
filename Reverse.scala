import scala.io.StdIn.{readLine,readInt}
object RS
{
  def reverse(ch:Char):Char=
{
  if(ch.isLower)

    ch.toUpper

  else
    ch.toLower
}
def main(args:Array[String])
{
  println("enter the string")
var str=readLine()
 var str1=str.map(reverse)
 println(str1)
} 
 }  