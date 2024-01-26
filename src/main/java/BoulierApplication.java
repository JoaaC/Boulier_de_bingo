import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Classe BoulierApplication
 * <p>
 * Permet d'ouvrir la fenêtre de boulier et de commencer l'application
 *
 * @author Joannie Chevalier
 * @version 22 décembre 2022
 */
public class BoulierApplication extends Application
{
    public static void main(String[] args)
    {
        launch();
    }

    /**
     * Méthode start
     * <p>
     * Ouvre et affiche la fenêtre de l'application
     *
     * @param primaryStage the primary stage for this application, onto which
     *                     the application scene can be set.
     *                     Applications may create other stages, if needed, but they will not be
     *                     primary stages.
     * @throws Exception : exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("fxml/boulier.fxml"));
        Parent root = loader.load();

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
