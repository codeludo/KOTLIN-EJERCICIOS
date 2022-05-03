// Clase Contador
class Contador(valorHora: Int = 50, horasMes: Int = 200) : Empleado(valorHora, horasMes) {
    override val tieneBono: Boolean = false
    override var salario: Int = calcularSalario()
}