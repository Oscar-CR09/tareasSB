package cervantes.tareas;

import cervantes.tareas.presentacion.SistemaTareaFx;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TareasApplication {

	public static void main(String[] args) {
		//SpringApplication.run(TareasApplication.class, args);

		Application.launch(SistemaTareaFx.class,args);


	}

}
