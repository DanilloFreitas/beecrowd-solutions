import java.util.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args)  throws IOException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        int n1 = 0, n2 = 1;
        int limite = leitor.nextInt();

        System.out.printf("" + n1 + " " + n2);

        for (int i = 2; i < limite; i++) {
            int proximo = n1 + n2;
            System.out.print(" " + proximo);
            n1 = n2;
            n2 = proximo;
        }

        System.out.println();
        
        leitor.close();
        }
    }

