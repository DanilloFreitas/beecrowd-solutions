import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner leitor = new Scanner(System.in);

        ArrayList<Integer> entradas = new ArrayList<Integer>();

        int a = leitor.nextInt();
        double soma = 0;

        while(a >= 0){
            entradas.add(a);
            a = leitor.nextInt();
        }
        for (Integer entrada : entradas) {
            soma = soma + entrada;
        }
        double media  = soma / entradas.size();
        System.out.printf("%.2f%n", media);

    }
}
