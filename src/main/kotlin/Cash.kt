class Cash(
    val tipoMoneda: String
) : MetodoPago {
    override fun procesarPago(cantidad: Double) {
        // Lógica para procesar un pago en efectivo
    }
}