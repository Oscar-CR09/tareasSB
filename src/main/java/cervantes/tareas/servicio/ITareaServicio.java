package cervantes.tareas.servicio;

import cervantes.tareas.modelo.Tarea;

import java.util.List;

public interface ITareaServicio {
    public List<Tarea>listarTareas();
    public Tarea buscarTareaPorId(Integer idTarea);
    public void guardarTarea(Tarea tarea);
    public void elimniarTarea(Tarea tarea);

}
