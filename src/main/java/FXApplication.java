import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FXApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("mainStage.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("Neural Network");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();

    }
}
