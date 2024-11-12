package es.joel.ejerciciop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Clase principal de la aplicación.
 * Esta clase extiende {@link javafx.application.Application} y es responsable de lanzar la
 * aplicación JavaFX. Carga la vista FXML y muestra la ventana principal al usuario.
 */
public class HelloApplication extends Application {

    /**
     * Metodo principal de inicio de la aplicación.
     * Este metodo carga el archivo FXML y configura la escena principal para ser mostrada
     * en el escenario de la aplicación. Establece el título de la ventana y muestra el escenario.
     *
     * @param stage El escenario principal de la aplicación, en el que se mostrará la escena.
     * @throws IOException Si ocurre un error al cargar el archivo FXML.
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("EjercicioP!");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Metodo principal para ejecutar la aplicación.
     * Llama al metodo  de la clase {@link Application}, que inicia el ciclo de vida
     * de la aplicación JavaFX.
     *
     * @param args Argumentos de la línea de comandos, que no son utilizados en este caso.
     */
    public static void main(String[] args) {
        launch();
    }
}
