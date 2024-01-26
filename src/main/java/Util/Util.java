package Util;

import javafx.scene.control.Alert;

/**
 * Class Util
 * <p>
 * Classe de méthode utilitaires
 *
 * @author Joannie Chevalier
 * @version 7 juin 2023
 */
public class Util
{
    /**
     * Méthode alerteFonctionnement
     * <p>
     * Affiche une alerte qui explique à l'utlisateur le fonctionnement de l'application
     */
    public static void alerteFonctionnement()
    {
        Alert fonctionnement = new Alert(Alert.AlertType.INFORMATION);

        fonctionnement.setTitle("Boulier de Bingo");
        fonctionnement.setHeaderText("Voici comment fonctionne l'application:");
        fonctionnement.setContentText("Pour avoir la boule de bingo à appeler, appuyez sur le bouton rouler. L'ordinateur " +
                "décidera donc d'une boule à appeler. La boule choisie sera affichée au-dessus du bouton rouler et elle " +
                "sera aussi ajouter dans l'historique à la droite de l'écran. Pour recommencer une partie, vous n'avez " +
                "qu'a appuyer sur le bouton repartir de zéro. L'historique se videra donc et cela vous permettera de " +
                "faire une nouvelle partie. " +
                "Il faut prendre note qu'une boule de bingo ne peut être roulé qu'une seule fois. Une fois roulé, elle " +
                "ne pourra pas être roulé à nouveau. Ainis, lorsque toutes les boules ont été roulé une fois, il nous " +
                "vous sera plus possible de rouler.");

        fonctionnement.showAndWait();
    }

    /**
     * Méthode alerteBoulierFini
     * <p>
     * Affiche une alerte qui informe l'utilisateur que le boulier est fini et que pour continuer de jouer il doit recommencer
     * de zéro
     */
    public static void alerteBoulierFini()
    {
        Alert fini = new Alert(Alert.AlertType.INFORMATION);

        fini.setTitle("Boulier de Bingo");
        fini.setHeaderText("Il n'y a plus de boules dans le boulier.");
        fini.setContentText("Toutes les boules ont été tirées. Le boulier est donc vide. Si vous désirez " +
                "continuer à jouer, vous pouvez repartir de zéro.");

        fini.showAndWait();
    }
}
