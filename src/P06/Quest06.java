package P06;

import java.util.Scanner;

public class Quest06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1, result;

        System.out.println("Digite um número inteiro: ");
        int number = scan.nextInt();

        System.out.println("A tabuada de " + number + " é igual a: ");
        while (10 >= i) {
            result = number * i;
            System.out.printf("%d x %d = %d \n", number, i, result);
            i++;
        }

        scan.close();
    }
}
