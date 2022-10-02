import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        var scan = new Scanner(System.in);

        System.out.println("Digite quatro notas para o calbulo da média:");

        System.out.print("1° nota:");
        var n1 = scan.nextDouble();
        System.out.print("2° nota:");
        var n2 = scan.nextDouble();
        System.out.print("3° nota:");
        var n3 = scan.nextDouble();
        System.out.print("4° nota:");
        var n4 = scan.nextDouble();

        scan.close();

        var media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("A média entre as notas é: " + media);
    }
}
