public class ProductoEnOferta extends Producto{
    private int porcentajeDescuento;
    
    public ProductoEnOferta(String codigo, String descripcion, double precioCompra, double precioVenta,
        int cantidad, int porcentajeDescuento)
        {
            super(codigo, descripcion, precioCompra, precioVenta, cantidad);
            this.porcentajeDescuento = porcentajeDescuento;
        }
    
    public int getPorcentajeDescuento(){
        return porcentajeDescuento;
    }
     
    public double calcularMontoConDescuento(double monto){
        double res = monto - ((porcentajeDescuento * monto)/ 100);
        return res;
    }
}