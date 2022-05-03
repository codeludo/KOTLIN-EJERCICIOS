import java.util.*

// Clase Usuario
// la clase usuario lee la información de entrada

class Lector {

    private val reader = Scanner(System.`in`)
    fun leer(): String{
        val respuestaCliente: String = reader.next()
        return respuestaCliente
    }
    fun cerrarLectura(){
        reader.close()
    }
}