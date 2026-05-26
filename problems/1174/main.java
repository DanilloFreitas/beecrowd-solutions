import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.util.Locale;

public class Main {
    public static void main(String[] args)  throws IOException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);



        double[] vetor = new double[100];


        for (int i = 0; i < vetor.length; i++) {
          vetor[i] = leitor.nextDouble();

        }
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] <= 10.0){
                System.out.printf("A[%d] = %.1f\n", i, vetor[i]);
            }
        }
        leitor.close();
        }
    }

