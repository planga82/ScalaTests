
//Functions
val add = (x: Int, y:Int) => x + y
add(2,3)
val getTheAnswer = () => 42
println(getTheAnswer())

//Methods
def addV2(x:Int,y:Int): Int = x + y
println(addV2(1,2))

def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier
val am = addThenMultiply(1, 2)(_)
println(am(2))

val listaPrueba:List[String] = List("a","b","c")

val lista2 = listaPrueba.map(x => x + "_")

lista2.foreach(x => println(x))


def urlBuilder(ssl: Boolean, domainName: String): (String, String) => String = {
  val schema = if (ssl) "https://" else "http://"
  (endpoint: String, query: String) => s"$schema$domainName/$endpoint?$query"
}

val domainName = "www.example.com"
def getURL = urlBuilder(ssl=true, domainName)
val endpoint = "users"
val query = "id=1"
val url = getURL(endpoint, query)

def factorial(x: Int): Int = {
  def fact(x: Int, accumulator: Int): Int = {
    if (x <= 1) accumulator
    else fact(x - 1, x * accumulator)
  }
  fact(x, 1)
}

println("Factorial of 2: " + factorial(2))
println("Factorial of 3: " + factorial(3))


val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val a = numbers.foldLeft(5)(_)
val res = a((m, n) => m + n)
print(res)
