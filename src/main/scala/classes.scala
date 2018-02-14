//Classes
class concatenacion(inicio:String, fin:String){
  def concatena(palabra: String): Unit =
    println(inicio + palabra + fin)
}

val clasePrueba = new concatenacion("antes_","_despues")
clasePrueba.concatena("x")

//case classes
case class Point(x:Int, y:Int,z:Int)
val point = Point(1,2,3)
val point2 = Point(1,2,3)
if(point==point2){
  println("Iguales")
}else{
  println("Distintos")
}
