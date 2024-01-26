import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cartes
{
    private static final List<Character> lettresOk = List.of('B', 'I', 'N', 'G', 'O');
    private static final List<Integer> numerosB = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
    private static final List<Integer> numerosI = List.of(16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30);
    private static final List<Integer> numerosN = List.of(31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45);
    private static final List<Integer> numerosG = List.of(46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60);
    private static final List<Integer> numerosO1 = List.of(61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75);
    private static final List<Integer> numerosO2 = List.of(61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75);

    public static void main(String[] args)
    {
        createCarte();
    }

    public static void createCarte()
    {
        List<List<Integer>> carte = new ArrayList<>();
        List<List<Integer>> numeros = new ArrayList<>();
        List<Integer> O1 = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        List<Integer> I = new ArrayList<>();
        List<Integer> N = new ArrayList<>();
        List<Integer> G = new ArrayList<>();
        List<Integer> O2 = new ArrayList<>();

        carte.add(O1);
        carte.add(B);
        carte.add(I);
        carte.add(N);
        carte.add(G);
        carte.add(O2);

        numeros.add(numerosO1);
        numeros.add(numerosB);
        numeros.add(numerosI);
        numeros.add(numerosN);
        numeros.add(numerosG);
        numeros.add(numerosO2);

        for (List<Integer> list : carte)
        {
            for (int i = 0; i < 7; i++)
            {
                Random random = new Random();
                int idx = random.nextInt(15);

                if (!list.contains(numeros.get(carte.indexOf(list)).get(idx)))
                {
                    list.add(numeros.get(carte.indexOf(list)).get(idx));
                }
            }
        }

        System.out.println(carte);
    }
}
