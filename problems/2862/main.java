import java.util.Scanner;
import java.io.IOException;
import java.util.Locale;

public class Main {
    public static void main(String[] args)  throws IOException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        int casos = leitor.nextInt();

        for (int i = 0; i < casos; i++) {
            int nivel = leitor.nextInt();

            if (nivel <= 8000){
                System.out.println("Inseto!");
            } else {
                System.out.println("Mais de 8000!");
            }
        }
    }
    }

