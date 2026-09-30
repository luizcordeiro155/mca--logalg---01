import java.util.Scanner;

public class Exercicio05Pais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da sua mae: ");
        String nomeMae = scanner.nextLine();

        System.out.print("Digite o nome do seu pai: ");
        String nomePai = scanner.nextLine();

        System.out.println("Nome da mae: " + nomeMae);
        System.out.println("Nome do pai: " + nomePai);

        scanner.close();
    }
}
