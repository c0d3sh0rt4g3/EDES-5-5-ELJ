class Pedido(
    var numPedido: Int,
    var fechaPedido: String,
    var estado: Estado
) {
    fun calculaPrecio(pedido:List<Producto>): Float{
        var costeTotal = 0.00
        for (producto in pedido) {
            costeTotal += producto.precio * producto.stock * (1 + producto.impuestos)
        }
        return costeTotal.toFloat()
    }
}