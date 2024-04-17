package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!!!");

        int[] valor = new int[5];

        for (int i = 0; i < valor.length; i++) {
            Scanner leitor = new Scanner(System.in);
            try {
                valor[i] = leitor.nextInt();    
            } catch (InputMismatchException error) {
                System.out.println("Tipo invalido, definido no vetor" + error);
                i--;
            }
        }

        for (int i : valor) {
            System.out.println(i);
        }

    }
}

