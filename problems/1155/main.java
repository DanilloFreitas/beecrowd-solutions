import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //  Scanner leitor = new Scanner(System.in);

        double soma = 0.0 ;
        for(int s = 1; s <= 100; s++){

            soma += 1.0/s;

        }
        System.out.printf("%.2f%n", soma);


    }
}
