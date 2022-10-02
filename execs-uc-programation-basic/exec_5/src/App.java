import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        var scan = new Scanner(System.in);

        System.out.println("Conversão de medida - Metro para centimetro");

        System.out.print("Digite uma medida em metro: ");
        var metro = scan.nextDouble();

        scan.close();

        var centimetro = metro * 100;

        System.out.println(metro + " metros é equivalênte a " + centimetro + "centimetros");
    }
}
