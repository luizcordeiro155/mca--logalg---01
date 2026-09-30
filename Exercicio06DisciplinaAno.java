import java.util.Scanner;

public class Exercicio06DisciplinaAno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a disciplina que esta cursando: ");
        String disciplina = scanner.nextLine();

        System.out.print("Digite o ano que esta cursando na universidade: ");
        int ano = scanner.nextInt();

        System.out.println("Disciplina: " + disciplina);
        System.out.println("Ano cursado: " + ano);

        scanner.close();
    }
}
