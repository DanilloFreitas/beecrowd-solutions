import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.util.Locale;

public class Main {
    public static void main(String[] args)  throws IOException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);



        int[] vetor = new int[10];
        int inicio = leitor.nextInt();

        vetor[0] = inicio;

        for(int i = 1; i < vetor.length; i++) {
            vetor[i] = vetor[i - 1] * 2;
        }

        for(int i = 0; i < vetor.length; i++) {
            System.out.printf("N[%d] = %d\n", i, vetor[i]);
        }
        leitor.close();
        }
    }

