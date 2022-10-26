import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("\n\n=====================================\n\n");

        System.out.print("Digite o nome do funcionário: ");
        var nomeFuncionario = scan.next();

        System.out.print("Digite o peso atual em KG: ");
        double peso = scan.nextDouble();

        System.out.print("Digite a quantidade de água já ingerida hoje em litros: ");
        var totalAguaIngerida = scan.nextDouble();

        System.out.println("\n\n==========================================\n");

        var quantidadeIdeal = calculaQuantidadeDeAguaIdeial(peso);

        var quantidadeRemanecente = calculaQuantidadeAguaFaltando(quantidadeIdeal, totalAguaIngerida);

        System.out.println(nomeFuncionario);
        System.out.println(peso);
        System.out.println(Math.round(totalAguaIngerida));
        System.out.println("Quantidade de água ingerida: " + Math.round(totalAguaIngerida) + " litros");
        System.out.println("Quantidade ideia de água a ingerir: " + quantidadeIdeal + " litros");

        if(quantidadeRemanecente <= 0){
            System.out.println("Parabéns, você atingiu a meta de hidratação diária");
        }
        else if(quantidadeRemanecente == 1){
            System.out.println("Continue focado em se hidratar por hoje, ainda falta " +  Math.round(quantidadeRemanecente) + " litros! Você consegue!");
        }
        else{
            System.out.println("Continue focado em se hidratar por hoje, ainda faltam " + Math.round(quantidadeRemanecente) + " litros! Você consegue!");
        }
    }


    //Metodos e funções
    public static double calculaQuantidadeDeAguaIdeial(double peso){
        
        // Calcula quantidade de água ideal a ser ingerida
        var quatidadeAguaIdeal = (peso * 35) / 1000;

        //Retorna o valor arredondado
        return Math.round(quatidadeAguaIdeal);
    }

    public static double calculaQuantidadeAguaFaltando(double quantidadeIdeal, double quantidadeIngerida){
        
        var quantidadeRestante = quantidadeIdeal - quantidadeIngerida;

        return Math.round(quantidadeRestante);
    }
}
