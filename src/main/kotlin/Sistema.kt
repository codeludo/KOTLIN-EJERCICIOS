class Sistema {

    /**
     * funcion para pagar el salario al empleado por código
     */
    fun pagoSalario(codEmpleado: Int){
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
            } else -> println("Eleccion no soportada")
        }
        if(salario > 0){
            println("Cod. empleado: $codEmpleado, Salario: $salario")
        }
    }
}