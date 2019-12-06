import scala.io.StdIn.{readLine,readInt}

object Avg
{
    def main(args:Array[String])
     {
     var n1= readInt()
     var n2= readInt()
     var cnt=0
     var sum=0
     for(i<-n1 to n2)
        {
             sum=sum+i
             cnt=cnt+1
         }
     var avg=sum/cnt
     println("the avg is"+avg)
      }
}