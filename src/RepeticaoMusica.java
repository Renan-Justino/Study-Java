import java.util.Scanner;

public class RepeticaoMusica {

    public static void main(String[] args) {
        boolean repeat = true;

        while(repeat) {

            System.out.println("♫ Tocando música... ♫");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Deseja tocar a música novamente? (s/n): ");
            String userInput = scanner.nextLine();

            if(userInput.equalsIgnoreCase("s")) {
                // equalsIgnoreCase ignora maiúsculas e minúsculas
               System.out.print("repetindo a música...\n");
            } else {
                repeat = false;
                System.out.println("...Música encerrada.");
            }
        }
    }
}

// Este código simula a reprodução de uma música em loop até que o usuário decida parar.
// A variável boolean 'repeat' controla o loop while. Enquanto 'repeat' for true,
// a mensagem "♫ Tocando música... ♫" será exibida.
// Após cada reprodução, o programa solicita ao usuário que decida se deseja tocar a música novamente.
// Se o usuário digitar 's' (sim), o loop continua; caso contrário, o loop termina e a mensagem "Música encerrada." é exibida.
// A função equalsIgnoreCase() é usada para comparar a entrada do usuário, ignorando diferenças entre maiúsculas e minúsculas.
