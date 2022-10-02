import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        var scan = new Scanner(System.in);

        System.out.println("Calcula salário baseado em o valor de horas trabalhadas");

        System.out.print("Digite o valor de sua hora de trabalho: ");
        var valorHora = scan.nextDouble();

        System.out.print("Digite quantas horas você trabalha por mês: ");
        var qntHorasMes = scan.nextDouble();

        scan.close();

        var salario = valorHora * qntHorasMes;

        System.out.println("Seu salário referente a esses valores é " + salario);
    }
}
