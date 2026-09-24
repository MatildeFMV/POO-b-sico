import java.util.ArrayList;
public class Tienda{
    private ArrayList<Producto> productos;
    private String nombre;
    
    public Tienda(String nombre){
        this.nombre = nombre;
        productos = new ArrayList<Producto>();
    }
    
    public int buscarProducto(String codigo){
        int res = -1;
        for(int i = 0; i < productos.size(); i++){
            Producto aux = productos.get(i);
            if(aux.getCodigo().equals(codigo)){
                res = i;
            }  
        }
        return res;
    }
    
    // cantidad > 0
    public String vender(String codigo, int cantidad){
        String res = "No se puede cubrir la cantidad de la venta";
        int posicion = buscarProducto(codigo);
        
        if(posicion > -1){
            Producto aux = productos.get(posicion);
            if(cantidad <= aux.getCantidad()){
                if(aux instanceof ProductoEnOferta){
                    double monto = cantidad * aux.getPrecioVenta();
                    int nuevaCantidad = aux.getCantidad()-cantidad;
                    productos.get(posicion).setCantidad(nuevaCantidad);
                    ProductoEnOferta oferta = (ProductoEnOferta) aux;
                    res = "Producto vendido, el monto a pagar es: "+oferta.calcularMontoConDescuento(monto);
                 
                }else{
                    res = "Producto vendido, el monto a pagar es: "+(cantidad* aux.getPrecioVenta());
                    int nuevaCantidad = aux.getCantidad()-cantidad;
                    productos.get(posicion).setCantidad(nuevaCantidad);
                }
            }
        }else{
            res = "Este producto no existe";
        }
        return res;
    }
    
    //cantidad > 0
    public String comprar(String codigo, int cantidad){
        String res = "El producto no existe";
        int posicion = buscarProducto(codigo);
        if(posicion > -1 && posicion < productos.size()){
            Producto aux = productos.get(posicion);
            int nuevaCantidad = aux.getCantidad()+cantidad;
            productos.get(posicion).setCantidad(nuevaCantidad);
            double monto = aux.getPrecioCompra()*cantidad;
            res = "Producto comprado, el monto a pagar es: "+ monto;
        }
        return res;
    }
}