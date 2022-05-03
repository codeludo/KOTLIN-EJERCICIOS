// Clase Contador
class Contador: Empleado() {
    override val valorHora: Int = 50
    override val horasMes: Int = 200
    override val tieneBono: Boolean = false

    override var salario: Int = calcularSalario()
}