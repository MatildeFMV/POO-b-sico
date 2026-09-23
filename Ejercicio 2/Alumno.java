public class Alumno{
    private String nombre;
    private boolean registro;
    
    public Alumno(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public boolean getRegistro(){
        return registro;
    }
    
    public void setRegistro(boolean nuevoRegistro){
        registro = nuevoRegistro;
    }
}