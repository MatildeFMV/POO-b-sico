import java.util.ArrayList;
public class Veterinaria{
    private ArrayList<Consulta> consultas;
    private double totalFacturado;
    
    public Veterinaria(){
        consultas = new ArrayList<Consulta>();
        totalFacturado = 0;
    }
    
    public void añadirConsultas(Consulta consulta){
        consultas.add(consulta);
    }
    
    public double totalFacturado(){
        for(int i = 0; i < consultas.size(); i++){
            Consulta aux = consultas.get(i);
            totalFacturado += aux.getCosto();
        }
        return totalFacturado;
    }
    
    public void reporte(){
        for(int i = 0; i < consultas.size(); i++){
            Consulta aux = consultas.get(i);
            
            aux.mostrarInformacion();
        }   
    }
}