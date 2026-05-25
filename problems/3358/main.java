import java.util.Scanner;
import java.io.IOException;
import java.util.Locale;

public class Main {
    public static void main(String[] args)  throws IOException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        int entrada = leitor.nextInt();

        for (int j = 1; j <= entrada; j++) {
            String nome = leitor.next();
            int sequenciaAtual = 0;
            boolean consoantesTres = false;
            String vogais = "aeiouAEIOU";

            for (int i = 0; i < nome.length(); i++) {
                char letra = nome.charAt(i);

                if (Character.isLetter(letra) && vogais.indexOf(letra) == -1) {
                    sequenciaAtual++;
                    if (sequenciaAtual >= 3) {
                        consoantesTres = true;
                    }
                }else {
                        sequenciaAtual = 0;
                    }
                }
                if (consoantesTres) {
                    System.out.println(nome + " nao eh facil");
                } else {
                    System.out.println(nome + " eh facil");
                }
            }


        }
    }

