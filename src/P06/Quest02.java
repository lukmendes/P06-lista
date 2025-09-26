package P06;

import java.util.Scanner;

public class Quest02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número qualquer: ");
        int number = scan.nextInt();

        if (number % 2 == 0) {
            System.out.println("Este número é par.");
        } else {
            System.out.println("Este número é impar.");
        }
    }
}
