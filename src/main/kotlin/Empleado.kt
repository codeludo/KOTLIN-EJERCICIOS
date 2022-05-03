// Clase abstracta empleado
abstract class Empleado(val valorHora: Int, val horasMes: Int){

    abstract var salario: Int
    abstract val tieneBono: Boolean
    var valorBono: Int = 0

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
