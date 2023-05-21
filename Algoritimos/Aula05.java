package Algoritimos;

import java.util.Locale;
import java.util.Scanner;

public class Aula05 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int soma, numero;

        soma = 0;
        for (int i = 0; soma < 100; i++) {
            System.out.println("Digite um numero: ");
            numero = sc.nextInt();
            soma = soma + numero;

        }
        System.out.println("Soma = " + soma);
        sc.close();
    }
}
