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
