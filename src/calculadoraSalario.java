
import java.util.Scanner;

//Crie um programa que calcule o salarioo de um funcionario, o programa deve conter:
// O numero de horas trabalhadas na semana e o valor da hora trabalhada.

public class calculadoraSalario {
    
    public static void main(String[] args) { 
        int horasTrabalhadas;
        double valorHora;

        System.out.println("Digite o numero de horas trabalhadas na semana: ");
        Scanner scanner = new Scanner(System.in);
        horasTrabalhadas = scanner.nextInt();

        System.out.println("Digite o valor da hora trabalhada: ");
        Scanner scanne = new Scanner(System.in);    
        valorHora = scanne.nextInt();

        

    }

    public class SalarioMetodo {

        public double calculadoraSalario(int horas, double valor) {
            return horas * valor;
        }
    }
}
