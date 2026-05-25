import java.util.Scanner;
import java.io.IOException;
import java.util.Locale;

public class Main {
    public static void main(String[] args)  throws IOException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        int entrada = leitor.nextInt();

        for(int i = 0; i < entrada; i++){

            leitor.useDelimiter("[^0-9]+");
            int valor1 = leitor.nextInt();
            int valor2 = leitor.nextInt();
            int valor3 = leitor.nextInt();

            int resultado = valor1 + valor2 + valor3;
            System.out.println(resultado);
            
           }

        }
    }

