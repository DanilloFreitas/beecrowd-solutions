import java.util.*;
import java.io.IOException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args)  throws IOException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        int[] vetor = new int[1000];

        int valor = leitor.nextInt();

        for (int i = 0; i < vetor.length; i++) {

            vetor[i] = i % valor;


            System.out.println("N[" + i + "] = " + vetor[i]);
        }


        leitor.close();
        }
    }

