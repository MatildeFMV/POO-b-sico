public class Consulta{
    private String codigo;
    private String nombreMascota;
    private double precioBase;
    private boolean pagado;
    
    public Consulta(String codigo, String nombreMascota, double precioBase){
        this.codigo = codigo;
        this.nombreMascota = nombreMascota;
        this.precioBase = precioBase;
        pagado = false;
    }
    
    public void pagar(){
        pagado = true;
    }
    
    public boolean getPagado(){
        return pagado;
    }
    
    public void mostrarInformacion(){
        System.out.println(" '" + codigo +"' ");
        System.out.println(nombreMascota +", "+ precioBase);
        if(pagado == true){
            System.out.println("pagado");
        }else{
            System.out.println("No pagado");
        }
    }
    
    public double getCosto(){
        return precioBase;
    }
    
    public double getPrecioBase(){
        return precioBase;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public String getNombreMascota(){
        return nombreMascota;
    }
}