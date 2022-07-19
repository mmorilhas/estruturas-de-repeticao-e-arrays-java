package dio.exercicios.arrays;

import java.util.Random;

public class Numeros_Aleatorios {
    public static void main(String[] args) {

        Random random = new Random();

        int[] vetor = new int[20];

        for(int i =0; i < vetor.length; i++) {
            int numero = random.nextInt(100);
            vetor[i] = numero;
        }

        System.out.println("Numeros Aleátorios: ");
        for(int numero : vetor){
            System.out.println(numero + "  ");
        }

        System.out.println("Seus antecessores: ");
        for(int numero : vetor) {
            System.out.println(numero-1 + "  ");
        }

        System.out.println("Seus sucessores: ");
        for (int numero : vetor) {
            System.out.println(numero + 1 + "  ");
        }
    }
}
