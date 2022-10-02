import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Creating a scanner instance to input values in variables
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");

        var num = scan.nextDouble();
        scan.close();
        
        System.out.println("O número informado foi: " + num);
    }
}
