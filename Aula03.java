import java.util.Locale;
import java.util.Scanner;

public class Aula03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero1, numero2, soma;

        System.out.println("Digite o 1º Valor: ");
        numero1 = sc.nextInt();
        System.out.println("Digite o 2º Valor: ");
        numero2 = sc.nextInt();

        soma = numero1 + numero2;

        System.out.println("Valor1: " + numero1 + " + " + "Valor2: " + numero2 + " Resultado: " + soma);

        sc.close();

    }

}
