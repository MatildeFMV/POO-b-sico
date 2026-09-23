import java.util.ArrayList;
public class Parqueo{
    private ArrayList<Vehiculo> vehiculos;
    private String nombre;
    public Parqueo(String nombre){
        vehiculos = new ArrayList<Vehiculo>();
        this.nombre = nombre;
    }
    
    public String registrarSalida(String placa, int horaDeSalida){
        String reporte = "";
        for(int i = 0; i < vehiculos.size(); i++){
            Vehiculo auxiliar = vehiculos.get(i);
            if(placa.equals(auxiliar.getPlaca()) && auxiliar.getEstaEnParqueo() == true &&
                    auxiliar.getTarifa() >= 0)
            {
                    double monto = calcularCosto(auxiliar.getTarifa(), auxiliar.getHoraDeEntrada(),
                    horaDeSalida);
                    reporte = "Vehículo encontrado, el monto a pagar es:  " + monto;
                    vehiculos.get(i).setEstaEnParqueo(false);
                    vehiculos.remove(i);
            } else if(placa.equals(auxiliar.getPlaca()) && auxiliar.getEstaEnParqueo() == true &&
                    auxiliar.getTarifa() == -1){
                    reporte = "Vehículo encontrado, el monto a pagar es: 0.0";
                    vehiculos.get(i).setEstaEnParqueo(false);
                    vehiculos.remove(i);
            }else{
                reporte = "No se encontró ningún vehículo con la placa.";
            }
        }
        return reporte;
    }
    
    public double calcularCosto(double tarifa, int horaDeEntrada, int horaDeSalida){
        double monto = 0;
        monto = (horaDeSalida - horaDeEntrada) * tarifa;
        return monto; 
    }
    
    public void mostrarInfo(){
        System.out.println("El parqueo " + nombre + "Tiene los vehículos: ");
        for(int i = 0; i < vehiculos.size(); i++){
            vehiculos.get(i).mostrarInformacion();
        }
    }
    
    public void añadirVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }
}