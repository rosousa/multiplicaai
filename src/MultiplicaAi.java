import java.util.Scanner;

public class MultiplicaAi {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Digite um número e aperte enter!");

        int number = userInput.nextInt();

        System.out.println("Tabela de multiplicação de " + number);

        final int MAX = 10;

        for(int i = 1; i <= MAX; i++) {
            System.out.println(i + " * " + number + " = " + (i * number));
        }
    }
}
