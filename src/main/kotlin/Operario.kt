// Clase Operario
class Operario(valorHora: Int = 10, horasMes: Int = 230) : Empleado(valorHora, horasMes) {

    override val tieneBono: Boolean = true
    override var salario: Int = calcularSalario(tieneBono)
}