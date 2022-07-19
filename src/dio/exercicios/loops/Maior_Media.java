package dio.exercicios.loops;

import java.util.Scanner;

public class Maior_Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        double soma = 0;

        int count = 0;

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma = soma + numero;
            if (numero > maior) {
                maior = numero;
            }

            ++count;
        } while (count < 5);

        System.out.println("Maior numero: " + maior);
        System.out.println("Media " + (soma/5));

    }
}
