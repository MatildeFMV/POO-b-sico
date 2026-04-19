/*Danae es una chica muy distraída y quiere mejorar ese aspecto de ella. Para eso,
recibió un regalo de su amiga Meredith, un pequeño cuaderno digital llamado "librum
memoriae".

Este cuaderno tiene la peculiaridad de que solo puedes escribir una sola cosa en él,
esto para saber en todo momento cuál es tu tarea actual.

El cuaderno tiene una función que te permite indicar si la tarea actual ha sido
concluida.

El cuaderno solo te permitirá escribir una nueva actividad, reemplazando la actual, si la
tarea en curso ha sido marcada como "concluida".

Si escribes una nueva tarea en el cuaderno, debería informártelo mediante un mensaje
que diga "Nueva Tarea Asignada", caso contrario debería indicar "La tarea en curso,
aún no ha sido concluida".

El cuaderno también lleva un contador interno que indica cuantas tareas han sido
ste dato pueo
escritas durante todo el tiempo. Este dato puede ser consultado en cualquier
momento.

La primera vez que se usa el cuaderno, debes indicar cuál es la tarea actual que quieres
anotar.*/
public class LibrumMemoriae{
  boolean conclusion= false;
  String tareaActual="";
  int contadorTarea= 1;
  public LibrumMemoriae (String tareaActual){
    this.tareaActual= tareaActual;
    this.contadorTarea=contadorTarea;
    
    }
  
  public boolean indicarConclusion(){
    conclusion=true;
    return conclusion;
    }

  public int contarTarea(){
    if(conclusion==true){
     contadorTarea= contadorTarea+1;
    }
    return contadorTarea;
    }

  public String AsignarTarea(String NuevaTarea){
    String mensaje="";
    if(conclusion == false){
     mensaje="La tarea aún no ha sido concluida";
    }else{
     mensaje="Nueva tarea asignada";
     tareaActual=NuevaTarea;
     conclusion=false;
      contadorTarea++;
    }
    return mensaje;
    }

  public int getcontadorTarea(){
    return contadorTarea;
    }

 }