package startfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application 
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("startfx.fxml"));
        primaryStage.setTitle("app 0.0.1");
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();
    }

    
    
    public static void main(String[] args) throws Exception 
    {
        launch(args);
    }
}
