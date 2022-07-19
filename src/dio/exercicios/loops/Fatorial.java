package dio.exercicios.loops;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int fatorial = 1;

        System.out.println("Digite um número para descobrir seu fatorial: ");
        numero = scan.nextInt();

        System.out.println("Fatorial de " + numero + "! = ");

        for(int i = numero; i >= 1; --i){
            fatorial = fatorial * i;

        }
        System.out.println(fatorial);
    }
}
