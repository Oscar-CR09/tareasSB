package cervantes.tareas.presentacion;

import cervantes.tareas.TareasApplication;
import ch.qos.logback.core.util.Loader;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

public class SistemaTareaFx extends Application {

    private ConfigurableApplicationContext applicationContext;

   // public static void main(String[] args) {
     //   launch(args);
   // }

    @Override
    public void init(){
        this.applicationContext = new SpringApplicationBuilder(TareasApplication.class).run();

    }

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(TareasApplication.class.getResource("/templates/index.fxml"));
        loader.setControllerFactory(applicationContext::getBean);
        Scene esena = new Scene(loader.load());
        stage.setScene(esena);

        stage.show();


    }

    @Override
    public void stop(){
        applicationContext.close();
        Platform.exit();

    }
}
