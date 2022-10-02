import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        var scan = new Scanner(System.in);

        System.out.println("Calculo de área de quadrado, digite a largura ou altura do mesmo para calcular");
        System.out.print("Valor:");

        var valor = scan.nextDouble();
        scan.close();

        var area = Math.pow(valor, 2);

        System.out.println("A área do quadrado é: " + area + " e o quadrado deste valor é " + Math.pow(area, 2));
    }
}
