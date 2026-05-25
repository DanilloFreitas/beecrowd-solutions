import java.util.Scanner;
import java.io.IOException;
import java.util.Locale;

public class Main {
    public static void main(String[] args)  throws IOException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        String entrada1 = leitor.nextLine();
        String entrada2;
        String entrada3;

        if (entrada1.equals("vertebrado")) {
            entrada2 = leitor.nextLine();
            if(entrada2.equals("ave")) {
                entrada3 = leitor.nextLine();
                if(entrada3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else if(entrada3.equals("onivoro")) {
                    System.out.println("pomba");
                }
            } else if(entrada2.equals("mamifero")) {
                entrada3 = leitor.nextLine();
                if(entrada3.equals("onivoro")) {
                    System.out.println("homem");
                } else if(entrada3.equals("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        }
        else if  (entrada1.equals("invertebrado")) {
            entrada2 = leitor.nextLine();
            if(entrada2.equals("inseto")) {
                entrada3 = leitor.nextLine();
                if(entrada3.equals("hematofago")) {
                    System.out.println("pulga");
                } else if(entrada3.equals("herbivoro")) {
                    System.out.println("lagarta");
                }
            } else if(entrada2.equals("anelideo")) {
                entrada3 = leitor.nextLine();
                if(entrada3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else if(entrada3.equals("onivoro")) {
                    System.out.println("minhoca");
                }
            }
        }
        leitor.close();

      }
    }

