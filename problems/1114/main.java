import java.util.Scanner;
import java.io.IOException;
import java.util.Locale;

public class Main {
    public static void main(String[] args)  throws IOException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        int senha = leitor.nextInt();

        int valida = 2002;

        while(senha != 2002){
            System.out.println("Senha Invalida");
             senha = leitor.nextInt();
        }
            System.out.println("Acesso Permitido");


      }
    }

