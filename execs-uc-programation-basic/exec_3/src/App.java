import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        var n1 = scan.nextDouble();

        System.out.print("Digite um segundo número: ");
        var n2 = scan.nextDouble();

        scan.close();
        var soma = n1 + n2;

        System.out.println("A soma entre " + n1 + " " + n2 + " é: " + soma);
    }
}
