class Tarjeta(
    val numero: String,
    val fechaCaducidad: String,
    val tipo: String
) : MetodoPago {
    override fun procesarPago(cantidad: Double) {
        // Lógica para procesar un pago con tarjeta
    }
}