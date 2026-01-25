import java.util.Scanner;

public class AreaTriangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da base.");
        int base = scanner.nextInt();

        System.out.println("Digite o valor da altura.");
        int altura = scanner.nextInt();

        double area = (base * altura) / 2.0;
        // nesse caso foi utilizado o double porque, se ambos os valores forem inteiros,
        // o resultado da divisão também será inteiro, o que pode levar à perda de precisão.

        System.out.println("A área de um triangulo são: " + area + " unidades quadradas.");
    }
    // testando atualizações do git
}
