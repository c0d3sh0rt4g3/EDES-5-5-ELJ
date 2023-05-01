class Cheque(
    val nombre: String,
    val banco: String
) : MetodoPago {
    override fun procesarPago(cantidad: Double) {
        // Lógica para procesar un pago con cheque
    }
}