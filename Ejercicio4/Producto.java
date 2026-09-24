public class Producto{
    private String codigo;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int cantidad;
   
    public Producto(String codigo, String descripcion, double precioCompra, double precioVenta,
       int cantidad)
       {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.cantidad = cantidad;
        }
    
    public String getCodigo(){
        return codigo;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public double getPrecioCompra(){
        return precioCompra;
    }
    
    public double getPrecioVenta(){
        return precioVenta;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
}