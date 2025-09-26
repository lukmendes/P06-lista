package P06;

import java.util.Scanner;

public class Quest03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberC;

        System.out.println("Digite o primeiro número: ");
        int numberA = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        int numberB = scan.nextInt();

        if (numberA == numberB) {
            numberC = numberA + numberB;
            System.out.println("Seu resultado é: " + numberC);
        } else {
            numberC = numberA * numberB;
            System.out.println("Seu resultado é: " + numberC);
        }

        scan.close();
    }
}
