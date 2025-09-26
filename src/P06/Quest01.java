package P06;

import java.util.Scanner;

public class Quest01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message;

        System.out.println("Digite o seu nome: ");
        String name = scan.nextLine();
        System.out.println("Digite o seu gênero: ");
        String gender = scan.next();
        System.out.println("Digite o seu estado civil: ");
        String status = scan.next();

        if (gender.equals("F") && status.equals("Casada")) {
            System.out.println("Digite o tempo de casamento em anos: ");
            int years = scan.nextInt();
            message = """
                    Seu nome é: %s;
                    Seu gênero é: %s;
                    Seu estado estado civil é: %s;
                    O tempo do seu casamento é: %d anos;
                    """.formatted(name, gender, status, years);
        } else {
            message = """
                    Seu nome é: %s;
                    Seu gênero é: %s;
                    Seu estado estado civil é: %s;
                    """.formatted(name, gender, status);
        }
        System.out.println(message);

        scan.close();
    }
}
