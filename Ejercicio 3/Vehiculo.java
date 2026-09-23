public class Vehiculo{
    protected String placa;
    protected String tipo;
    protected int horaDeEntrada;
    protected boolean estaEnParqueo;
    protected double tarifa;
    
    public Vehiculo(String placa, String tipo, int horaDeEntrada, double tarifa){
        this.placa = placa;
        this.tipo = tipo;
        this.horaDeEntrada = horaDeEntrada;
        this.tarifa = tarifa;
        estaEnParqueo = true;
    }
    
    public String getPlaca(){
        return placa;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public int getHoraDeEntrada(){
        return horaDeEntrada;
    }
    
    public double getTarifa(){
        return tarifa;
    }
    
    public boolean getEstaEnParqueo(){
        return estaEnParqueo;
    }
    
    public void setEstaEnParqueo( boolean estado){
        estaEnParqueo = estado;
    }
    
    public void mostrarInformacion(){
        System.out.println("Tipo: " + tipo + ". Placa: " + placa);
        System.out.println("Hora de entrada: " +  horaDeEntrada + ". Tarifa: "+tarifa);
    }
}