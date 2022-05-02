import java.util.Scanner

/**
 * funcion para pagar el salario al empleado por código
 */
fun pagarSalario(codEmpleado: Int){
    var salario: Double = 0.0
    when (codEmpleado) {
        1 -> salario =  calcularSalario(200, 200, false)
        2 -> salario = calcularSalario(230, 10, true)
        3 -> salario = calcularSalario(200, 50, false)
    }
    println("Cod. empleado: $codEmpleado, Salario: $salario")
}

/**
 * calcula el salario por los datos
 * hora mes
 * valor hora
 * bono
 */
fun calcularSalario(horasMes: Int, valorHora: Int, tieneBono: Boolean): Double {
    var valorBono = 0.0
    if(tieneBono){
        valorBono = 10 * valorHora.toDouble()
    }
    return (horasMes*valorHora)+valorBono
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
