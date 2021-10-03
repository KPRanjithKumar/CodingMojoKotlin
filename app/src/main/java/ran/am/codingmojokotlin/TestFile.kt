package ran.am. codingmojokotlin

fun main() {
   print("Enter your age: ")
    var age : String? = readLine()

    var EgAge : Int = 18

    if (age != null) {
      var j=  age.toInt()

        if (j > EgAge) {
            println("Welcome")
        } else{
            println("Not enough age")
        }

    }

    greet("Fred")

}

fun greet(name: String){
    println("Hello $name")
}
