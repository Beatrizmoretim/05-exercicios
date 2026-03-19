
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        //Declaração de dados
        Scanner sc = new Scanner(System.in);
        double Salariominimo;
        int quantidadequilowatts;
        double valorquilowatts, conta;

        //Entrada de dados
        System.out.print("O salario minimo é: ");
        Salariominimo = sc.nextDouble();
        System.out.print("Quantidade de quillowatts gasta por uma residencia é: ");
        quantidadequilowatts = sc.nextInt();

        //Processamento
        valorquilowatts = Salariominimo/7/100;
        conta = quantidadequilowatts * valorquilowatts;

        //Saida de dados
        System.out.println("Valor da conta: " + conta);
        System.out.println("Valor do quillowatts: " + valorquilowatts);
        System.out.println("Valor da conta com 10% de desconto: " + conta * 0.90);
    }
}
