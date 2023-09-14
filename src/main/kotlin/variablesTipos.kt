fun main(){
    //variables y tipos de datos kotlin
    //val para constantes
    // var para variables

    val name = "Mariel Báez"
    var age = 20

    print("Hola, soy " +name+ "y tengo ")
    println(""+age+" años")

    // name = "Mari" las viables val no cambian (inmutables)
    age = 19
    age += 1

   // age = "once" variables var que cambian de valor (lo demas ya no lo veo)

    //Especificar type de date en declaration

    //Declaration
    val cars: Int = 0
    val city: String
    //inicializacion
    city ="San Andres Ahuashuatepec"

    //Declaration e inicializacion
    val isMarried: Boolean =false

    val children: Int = 0
    val height: Double = 1.58

    println(isMarried)
    println(height)
    // Strings Templates
    // $ para imprimir valor de variables
    //${} para procesos antes de imprimir
    println("Hola, soy $name y tengo $age años")
    println("Vivo en $city, tengo $children hijos")

    println("En 2030 tendre ${ children + 4 } hijos")
    println("Tengo $cars carros")

}