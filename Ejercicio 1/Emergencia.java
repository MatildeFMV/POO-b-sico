public class Emergencia extends Consulta{
    private int porcentaje;
    private double recargo;
    
    public Emergencia(String codigo, String nombreMascota, double precioBase, int porcentaje){
        super(codigo, nombreMascota, precioBase);
        this.porcentaje = porcentaje;
        recargo = calcularRecargo(porcentaje);
    }
    
    public double calcularRecargo(int porcentaje){
        return (porcentaje*getPrecioBase())/100;
    }
    
    public double getCosto(){
        return getPrecioBase()+recargo;
    }
    
    public void mostrarInformacion(){
        System.out.println("'"+getCodigo()+"'");
        System.out.println(getNombreMascota()+", "+getCosto());
        if(getPagado()== true){
            System.out.println("Pagado");
        }else{
            System.out.println("No pagado");
        }
    }
}