package Algoritimo;

import java.util.Locale;
import java.util.Scanner;

public class Aula03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero1, numero2, soma;

        System.out.println("Digite o primeiro numero: ");
        numero1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        numero2 = sc.nextInt();

        soma = numero1 + numero2;

        System.out.println("Primeiro numero: " + numero1 + " + " + "Segundo numero: " + numero2);
        System.out.println("Resultado: " + soma);

        sc.close();

    }

}
