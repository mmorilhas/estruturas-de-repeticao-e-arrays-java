package dio.exercicios.loops;

import java.util.Scanner;

public class Par_Impar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros;
        int numero;
        int quantidadePares = 0;
        int quantidadeImpares = 0;
        int count = 0;

        System.out.println("Escolha uma quantidade de numeros pra entrar: ");
        quantidadeNumeros = scan.nextInt();

        do {
            System.out.println("Digite um numero inteiro: ");
            numero = scan.nextInt();

            if (numero % 2 == 0 ) {
                quantidadePares++;
            }else {
                quantidadeImpares++;
            }

            ++count;
        } while (count < quantidadeNumeros);

        System.out.println("Quantidade de numeros Pares: " + quantidadePares);
        System.out.println("Quantidade de numeros Impares: " + quantidadeImpares);
    }
}
