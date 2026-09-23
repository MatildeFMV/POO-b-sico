public class VehiculoConAbono extends Vehiculo{
    private double abono;
    
    public VehiculoConAbono(String placa, String tipo, int horaDeEntrada,
    double abono)
    {
        super(placa, tipo, horaDeEntrada, -1);
        this.abono = abono;
    }
    
    public double getAbono(){
        return abono;
    }
    
    public void mostrarInformacion(){
        System.out.println("Tipo: " + tipo + ". Placa: " + placa);
        System.out.println("Hora de entrada: " + horaDeEntrada + ". Abono: " + abono);
    }
}