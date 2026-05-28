import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

    public class Main {

        public static void main(String[] args) throws IOException {
            Locale.setDefault(Locale.US);
            Scanner leitor = new Scanner(System.in);

            int primeiro = leitor.nextInt();
            int segundo = leitor.nextInt();
            int terceiro = leitor.nextInt();

            if (( primeiro >= segundo && primeiro <= terceiro) || ( primeiro <= segundo && primeiro >= terceiro)) {
                System.out.println("huguinho");
            } else if ((segundo >= primeiro && segundo <= terceiro)  || (segundo <= primeiro && segundo >= terceiro)){
                System.out.println("zezinho");
            } else {
                System.out.println("luisinho");
            }


            leitor.close();
        }

    }




