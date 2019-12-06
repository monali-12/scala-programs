object Perfect
{
 def main (args:Array[String])
{ 
  var ps=0
  var p=""
  for(j<-1 to 100)
{ 
   
  var sum=0
  for(i<-1 to j/2)
{
  if(j%i==0)
  sum+=i
  
}
 if(j==sum)
{ 
println(j+",")
 
  ps=ps+j
}

}


println(ps)
}
}