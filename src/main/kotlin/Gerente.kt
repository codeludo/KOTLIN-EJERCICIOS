// Clase Gerente
class Gerente: Empleado() {
    override val valorHora: Int = 200
    override val horasMes: Int = 200
    override val tieneBono: Boolean = true

    override var salario: Int = calcularSalario()
}