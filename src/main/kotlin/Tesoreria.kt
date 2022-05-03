class Tesoreria {


    fun pagarSalarios(){
        val lector = Lector()
        val sistema = Sistema()
        while(true){
            println("Ingrese el codigo del empleado:\n1 -> Gerente\n2 -> Operario\n3 -> Contador")
            sistema.pagoSalario(lector.leer().toInt())
            println("Calcular otro empleado? (y/n)")
            if(lector.leer() == "n"){
                lector.cerrarLectura()
                break
            } else println("continuar")
        }
    }
}