import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //C = 5 * ((F-32) / 9).

        var scan = new Scanner(System.in);

        System.out.println("Este algoritmo converse uma temperatura em Fahrenheit em graus Celcius");

        System.out.print("Digite o valor em Fahrenheit: ");
        var fh = scan.nextDouble();
        scan.close();

        var cel = 5 * ((fh - 32) / 9);
        System.out.println("O resultado da conversão é: " + cel);

    }
}
