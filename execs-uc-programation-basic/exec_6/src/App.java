import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        var scan = new Scanner(System.in);
        
        System.out.println("Digite o raio de um circulo para calcular a área!");

        System.out.print("Valor: ");
        var raio = scan.nextDouble();

        scan.close();

        var area = Math.PI * Math.pow(raio, 2);

        System.out.println("O valor da área é: " + area);
    }
}
