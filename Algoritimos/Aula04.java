package Algoritimos;

import java.util.Locale;
import java.util.Scanner;

public class Aula04 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int hora;
        String nome;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite a Hora Atual: (Apenas a Hora)");
        hora = sc.nextInt();

        if (hora > 0 && hora < 12) {
            System.out.println("Bom Dia");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Boa Tarde");
        } else if (hora > 18 && hora < 24) {
            System.out.println("Boa Noite");
        }

        System.out.println(nome);
    }
}