package Boules;

/**
 * Classe Boule
 * <p>
 * Crée une boule de bingo qui contient une lettre et un nombre
 *
 * @author Joannie Chevalier
 * @version 22 décembre 2022
 */
public class Boule
{
    /**
     * char lettre
     * <p>
     * lettre qui sera inscrite sur la boule
     */
    private char lettre;

    /**
     * int nombre
     * <p>
     * nombre qui sera inscrite sur la boule
     */
    private int nombre;

    /**
     * Méthode boule
     * <p>
     * Permet de créer une boule de bingo
     *
     * @param lettre : la lettre qui correspond à la colonne de la carte de bingo
     * @param nombre : le numéro dans la colonne de la carte de bingo
     */
    public Boule(Character lettre, Integer nombre)
    {
        setLettre(lettre);
        setNombre(nombre);
    }

    /**
     * Méthode getLettre
     * <p>
     * Permet d'aller chercher la lettre de la boule de bingo
     *
     * @return la caractère qui corresspond à la lettre de la boule de bingo
     */
    public char getLettre()
    {
        return lettre;
    }

    /**
     * Méthode setLettre
     * <p>
     * Permet de donner à la boule de bingo sa lettre
     *
     * @param lettre : la lettre de la boule de bingo
     */
    public void setLettre(char lettre)
    {
        this.lettre = lettre;
    }

    /**
     * Méthode getNombre
     * <p>
     * Permet d'aller chercher le nombre de la boule de bingo
     *
     * @return l'entier qui correspond au numéro de la boule de bingo
     */
    public int getNombre()
    {
        return nombre;
    }

    /**
     * Méthode setNombre
     * <p>
     * Permet de donner à la boule de bingo son nombre
     *
     * @param nombre : le numéro de la boule de bingo
     */
    public void setNombre(int nombre)
    {
        this.nombre = nombre;
    }

    /**
     * Méthode toString
     * <p>
     * Permet de voir les composantes d'une boule de bingo
     *
     * @return la chaîne qui correspond à la boule de bingo
     */
    @Override
    public String toString()
    {
        return lettre + " " + nombre;
    }

    /**
     * Méthode equals
     * <p>
     * Vérifie si deux boules sont équivalentes ou non
     *
     * @param o : la boule avec qui il faut comparer
     * @return vrai si les deux boules sont équivalentes, faux si elles ne sont pas équivalentes
     */
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Boule boule = (Boule) o;
        return lettre == boule.lettre && nombre == boule.nombre;
    }
}
