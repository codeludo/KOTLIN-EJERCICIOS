// Clase Operario
class Operario: Empleado() {
    override val valorHora: Int = 10
    override val horasMes: Int = 230
    override val tieneBono: Boolean = true

    override var salario: Int = calcularSalario(tieneBono)
}