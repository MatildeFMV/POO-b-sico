public class Curso{
    private String codigo;
    private String idioma;
    private int cupo;
    private Alumno[] alumnos;
    
    public Curso(String codigo, String idioma, int cupo){
        this.codigo = codigo;
        this.idioma = idioma;
        this.cupo = cupo;
        alumnos = new Alumno [cupo];
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public String getIdioma(){
        return idioma;
    }
    
    public int getCupo(){
        return cupo;
    }
    
    public String añadirAlumnoAClase(Alumno alumno){
        String reporte = "";
        int contador = 0;
        if(contador < cupo && alumno.getRegistro() == false){
            alumnos[contador] = alumno;
            contador++;
            alumno.setRegistro(true);
        }else if(alumno.getRegistro() == true){
            reporte = "Este alumno ya está inscrito en otro curso";
        }else{
            reporte = "Ya no hay cupos en este curso";
        }
        return reporte;
    }
}