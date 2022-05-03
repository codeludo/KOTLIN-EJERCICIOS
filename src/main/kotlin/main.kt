import java.util.Scanner
// Clase abstracta empleado
abstract class Empleado(){
    abstract val valorHora: Int
    abstract val horasMes: Int
    abstract var salario: Int
    abstract val tieneBono: Boolean
    val valorBono: Int = 0

    fun calcularBono() = 10 * valorHora

    fun calcularSalario(bono: Boolean = false): Int{

        salario = if(bono) {
            val valorBono = calcularBono()
            valorHora * horasMes + valorBono
        } else{
            valorHora * horasMes + valorBono
        }
        return salario
    }
}

// Clase Gerente
class Gerente: Empleado() {
    override val valorHora: Int = 200
    override val horasMes: Int = 200
    override val tieneBono: Boolean = true

    override var salario: Int = calcularSalario()
}

// Clase Operario
class Operario: Empleado() {
    override val valorHora: Int = 10
    override val horasMes: Int = 230
    override val tieneBono: Boolean = true

    override var salario: Int = calcularSalario(tieneBono)
}

// Clase Contador
class Contador: Empleado() {
    override val valorHora: Int = 50
    override val horasMes: Int = 200
    override val tieneBono: Boolean = false

    override var salario: Int = calcularSalario()
}


/**
 * funcion para pagar el salario al empleado por código
 */
fun pagarSalario(codEmpleado: Int){
    var salario = 0
    when (codEmpleado) {
        1 -> {
            val gerente = Gerente()
            salario = gerente.salario
        }
        2 -> {
            val operario = Operario()
            salario = operario.salario
        }
        3 -> {
            val contador = Contador()
            salario = contador.salario
        }
    }
    println("Cod. empleado: $codEmpleado, Salario: $salario")
}

fun main(){

    while(true){
        println("Ingrese el codigo del empleado:\n1 -> Gerente\n2 -> Operario\n3 -> Contador")
        val reader = Scanner(System.`in`)
        val codigoEmpleado = reader.nextInt()

        pagarSalario(codigoEmpleado)
        println("Calcular otro empleado? (y/n)")
        if(reader.next().equals("n")){
            reader.close()
            break
        }
    }

}
