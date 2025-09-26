package P06;

import java.util.Scanner;

public class Quest04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a sua altura: ");
        double height = scan.nextDouble();
        System.out.println("Digite o seu gênero: ");
        String gender = scan.next();

        if (gender.equals("M")) {
            System.out.println("Seu peso ideal é: " + ((72.7 * height) - 58));
        } else {
            System.out.println("Seu peso ideal é: " + ((62.1 * height) - 44.7));
        }

        scan.close();
    }
}
