import java.util.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args)  throws IOException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        int[] array = new int[10]; // declarei um vetor de 10 elementos


        for (int i = 0; i < array.length; i++) { // um loop para percorrer todo o vetor usando o .length
            array[i] = leitor.nextInt();  // um scanner para ler os elementos dos vetores q tem um maximo de 10
            if(array[i] <= 0){  // if nosso vetor na posiçao i for <= 0 ele vai pegar o vetor na posiçao i e tranformar o valor dele em 1
                array[i] = 1;
                System.out.printf("X[%d] = %d\n", i, array[i]);
            } else {  // se o vetor tiver valor maior q 0 ele pega o vetor na posiçao i e printa somente
                System.out.printf("X[%d] = %d\n", i, array[i]);
            }
        }

        leitor.close();
        }
    }

