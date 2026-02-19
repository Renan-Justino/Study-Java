
import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        
        int opcao;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma opção (1,2 ou 3): ");
        opcao = scanner.nextInt();

        String resultado = switch (opcao) {
            case 1 -> "Opção 1 selecionada";
            case 2 -> "Opção 2 selecionada";
            case 3 -> "Opção 3 selecionada";
            default -> "Opção inválida";
        };

        System.out.println(resultado);
    }
}
