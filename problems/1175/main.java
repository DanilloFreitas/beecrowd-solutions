import java.util.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args)  throws IOException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);


        int [] vetor = new int[20];
        int[] trocar = new int[vetor.length];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = leitor.nextInt();
        }

        for(int i = 0; i < vetor.length; i++){
            trocar[i] = vetor [ ( vetor.length - i) - 1 ];
            System.out.printf("N[%d] = %d\n", i, trocar[i]);
        }

        leitor.close();
        }
    }

