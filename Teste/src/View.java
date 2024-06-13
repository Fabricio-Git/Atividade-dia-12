import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class View extends Application {
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("KitA.fxml"));
        Parent root = fxmlLoader.load();
        Scene tela = new Scene(root);

        stage.setTitle("Teste");
        stage.setScene(tela);
        stage.show();
    }   
}
