import java.util.ArrayList;
public class Instituto{
    private ArrayList<Curso> cursos;
    
    public Instituto(){
        cursos = new ArrayList<Curso>();
    }
    
    public void añadirCursos(Curso curso){
        cursos.add(curso);
    }
    
    public int buscarCurso(String codigo){
        int posicion = -1;
        for(int i = 0; i < cursos.size();i++){
            Curso aux = cursos.get(i);
            if(aux.getCodigo().equals(codigo)){
                posicion = i;
            }
        }
        return posicion;
    }
    
    public String inscribirAlumno(Alumno alumno, String codigoCurso){
        String resul = "";
        int posicionCurso = buscarCurso(codigoCurso);
        if(posicionCurso == -1){
            resul = "El curso no existe"; 
        }else{
            resul = cursos.get(posicionCurso).añadirAlumnoAClase(alumno);
        }
        return resul;
    }
}