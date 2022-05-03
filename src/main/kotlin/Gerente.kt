// Clase Gerente
class Gerente(valorHora: Int = 200, horasTrabajadas: Int = 200) : Empleado(valorHora, horasTrabajadas) {

    override val tieneBono: Boolean = true
    override var salario: Int = calcularSalario()
}