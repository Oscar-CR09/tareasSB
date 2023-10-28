package cervantes.tareas.servicio;

import cervantes.tareas.modelo.Tarea;
import cervantes.tareas.repositorio.TareaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaServicio implements ITareaServicio{

    @Autowired
    private TareaRepositorio tareaRepositorio;

    @Override
    public List<Tarea> listarTareas() {

        return tareaRepositorio.findAll();
    }

    @Override
    public Tarea buscarTareaPorId(Integer idTarea) {
        Tarea tarea =tareaRepositorio.findById(idTarea).orElse(null);
        return tarea;


    }

    @Override
    public void guardarTarea(Tarea tarea) {

        tareaRepositorio.save(tarea);

    }

    @Override
    public void elimniarTarea(Tarea tarea) {

        tareaRepositorio.delete(tarea);
    }
}
