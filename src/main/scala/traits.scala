trait interfaz {
  def metodo1(x: String, y: String): String
  def metodo2(x:String): Unit = {
    println("Este es el metodo 2")
  }
}

class pruebaDeInterfaz extends interfaz{
  override def metodo1(x: String="a", y: String ="b"): String = {
    x + "_" + y
  }

}

var p = new pruebaDeInterfaz()
p.metodo1("v")
p.metodo2("b")

