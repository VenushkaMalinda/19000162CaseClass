object MyApp extends App{
  val p1=Point(0,3)
  val p2=Point(4,0)
  val p3= p1+p2
  val p4 = p1.move(2,2)
  val x = p1.distance(p2)
  println("Addition of p1(0,3) and p2(4,0) is : "+p3)
  println("\nAfter moving p1(0,3) from (2,2) is : "+p4)
  println("\nDistance between p1(0,3) and p2(4,0) is : "+x)
  println("\nThe invert of p1(0,3) is : "+p1.invert())

}
case class Point(x:Int,y:Int){

  def +(that:Point)=Point(this.x+that.x,this.y+that.y)
  def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)
  def distance(that:Point)={
    Math.sqrt(((this.x-that.x)*(this.x-that.x))+((this.y-that.y)*(this.y-that.y)))
  }
  def invert() = Point(y,x)
  override def toString = "("+x+","+y+")"
}
