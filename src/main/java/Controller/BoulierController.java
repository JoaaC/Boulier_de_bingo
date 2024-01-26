package Controller;

import Boules.Boule;
import Util.Util;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.*;

/**
 * Classe BoulierController
 * <p>
 * Assure le fonctionnement du boulier
 *
 * @author Joannie Chevalier
 * @version 7 juin 2023
 */
public class BoulierController implements Initializable
{
    /**
     * Label labelBoule
     * <p>
     * Label qui affiche la boule roulé
     */
    @FXML
    private Label labelBoule;

    /**
     * TableView tableHistorique
     * <p>
     * TableView qui affiche l'historique des boules roulées
     */
    @FXML
    private TableView<Boule> tableHistorique;

    /**
     * TableColumn colonne Lettre
     * <p>
     * Colonne du tableau de l'historique qui affichera la lettre sur la boule
     */
    private static final TableColumn<Boule, Character> colonneLettre = new TableColumn<>("Lettre");

    /**
     * TableColumn colonneNombre
     * <p>
     * Colonne du tableau de l'historique qui affichera le nombre sur la boule
     */
    private static final TableColumn<Boule, Integer> colonneNombre = new TableColumn<>("Numéro");

    /**
     * ArrayList boules
     * <p>
     * Liste des boules se trouvant dans le boulier
     */
    private final ArrayList<Boule> boules = new ArrayList<>(75);

    /**
     * List lettresOk
     * <p>
     * Liste des lettres qui peuvent composé une boule de bingo
     */
    private final List<Character> lettresOk = List.of('B', 'I', 'N', 'G', 'O');

    /**
     * List numerosB
     * <p>
     * Liste des nombres qui peuvent se trouver sur une boule ayant la lettre B
     */
    private final List<Integer> numerosB = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

    /**
     * List numerosI
     * <p>
     * Liste des nombres qui peuvent se trouver sur une boule ayant la lettre I
     */
    private final List<Integer> numerosI = List.of(16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30);

    /**
     * List numerosN
     * <p>
     * Liste des nombres qui peuvent se trouver sur une boule ayant la lettre N
     */
    private final List<Integer> numerosN = List.of(31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45);

    /**
     * List numerosG
     * <p>
     * Liste des nombres qui peuvent se trouver sur une boules ayant le lettre G
     */
    private final List<Integer> numerosG = List.of(46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60);

    /**
     * List numerosO
     * <p>
     * Liste des nombres qui peuvent se trouver sur une boule ayant la lettre O
     */
    private final List<Integer> numerosO = List.of(61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75);

    /**
     * Méthode deZero
     * <p>
     * Appelé lorsque le bouton Repartir de zéro est appuyé
     * Vide le label du boulier
     * Vide l'historique du boulier
     */
    @FXML
    void deZero()
    {
        labelBoule.setText("");
        tableHistorique.getItems().clear();
    }

    /**
     * Méthode rouler
     * <p>
     * Appelé lorsque le bouton Rouler est appuyé
     * Sélectionne une boule dans la liste de boules et l'affiche dans le label du boulier
     * Retire la boule de la liste des boules qui se trouve dans le boulier
     */
    @FXML
    void rouler()
    {
        Random idx = new Random();
        Boule boule = boules.get(idx.nextInt(boules.size()));

        if (!tableHistorique.getItems().contains(boule))
        {
            labelBoule.setText(boule.toString());
            tableHistorique.getItems().add(boule);
            boules.remove(boule);

            if (boules.size() == 0)
            {
                Util.alerteBoulierFini();
            }
        }
    }

    /**
     * Méthode initialize
     * <p>
     * Affiche une alerte pour expliquer le fonctionnement du boulier
     * Appel la méthode qui crée l'historique du boulier
     * Appel la méthode qui crée la liste des boules qui se trouvent dans le boulier
     *
     * @param location  The location used to resolve relative paths for the root object, or
     *                  {@code null} if the location is not known.
     * @param resources The resources used to localize the root object, or {@code null} if
     *                  the root object was not localized.
     */
    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        Util.alerteFonctionnement();
        createTableHistorique();
        createBoules();
    }

    /**
     * Méthode createBoules
     * <p>
     * Crée la liste des boules qui se trouve dans le boulier
     */
    public void createBoules()
    {
        List<List<Integer>> numbers = List.of(numerosB, numerosI, numerosN, numerosG, numerosO);
        int idx = 0;

        for (Character lettre : lettresOk)
        {
            List<Integer> numeros = numbers.get(idx);

            for (Integer nb : numeros)
            {
                boules.add(new Boule(lettre, nb));
            }

            idx++;
        }
    }

    /**
     * Méthode createTableHistorique
     * <p>
     * Crée la tableView qui conserve l'historique des boules roulées dans la partie
     */
    private void createTableHistorique()
    {
        tableHistorique.getColumns().clear();

        tableHistorique.getColumns().add(colonneLettre);
        colonneLettre.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue().getLettre()));
        colonneLettre.setMinWidth(150);

        tableHistorique.getColumns().add(colonneNombre);
        colonneNombre.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue().getNombre()));
        colonneNombre.setMinWidth(150);

        tableHistorique.setStyle("-fx-font-size: 25pt");
    }
}
