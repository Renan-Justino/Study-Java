import java.util.Scanner;

public class EstudanteApp {

    public static void main(String[] args) {

        System.out.println("Bem-vindo ao sistema de estudantes!");

        int idade;
        double media;
        boolean aprovado;
        String nome;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do estudante: ");
        idade = scanner.nextInt();

        System.out.print("Digite o nome do estudante: ");
        nome = scanner.next();

        System.out.print("Digite a média do estudante: ");

        media = scanner.nextDouble();

        String mensagem; // Variável para armazenar a mensagem final

        aprovado = media >= 7; // Forma simples de comparação

        System.out.print("O estudante " + nome + " tem " + idade + " anos e sua média é " + media + ". ");

        if (aprovado) {
            mensagem = "Parabéns, você foi aprovado!";
        } else {
            mensagem = "Infelizmente, você não foi aprovado.";
        }

        System.out.println(mensagem); // Exibe a mensagem final
    }
}

// Scanner é uma classe em Java usada para ler a entrada do usuário a partir do console ou de outras fontes de entrada.
// Neste código, usamos Scanner para capturar a idade, o nome e a média do estudante digitados pelo usuário.
// O método nextInt() lê um número inteiro, next() lê uma string (palavra) e nextDouble() lê um número decimal.
// Após capturar os dados, o programa verifica se a média é maior ou igual a 7 para determinar se o estudante foi
// aprovado ou não, e exibe uma mensagem apropriada.
