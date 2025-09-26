package P06;

import java.util.Scanner;

public class Quest05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1, result;

        System.out.println("Digite um número inteiro: ");
        int number = scan.nextInt();

        System.out.println("Números de termos de entrada: " + number);
        do {
            result = i * i * i;
            System.out.printf("O número é: %d e o cubo de %d é: %d \n", i, i, result);
            i++;
        } while (number >= i);

        scan.close();
    }
}
