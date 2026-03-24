import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        //Declaração de dados
        Scanner sc = new Scanner(System.in);
        double Valorsalariomin, descontoinss;
        int numerodehorastrabalhadas;
        double horaaula;
        double porcentagemdedescontodoinss, salariobruto, salarioliquido;

        //Entrada de dados
        System.out.println("Informe o valor da hora aula: ");
        horaaula = sc.nextDouble();
        System.out.println("A quantidade de horas trabalhadas no mes é de: ");
        numerodehorastrabalhadas = sc.nextInt();
        System.out.println("A porcentagem de desconto do INSS é: ");
        porcentagemdedescontodoinss = sc.nextDouble();

        //Processamento
        salariobruto = horaaula * numerodehorastrabalhadas;
        descontoinss = salariobruto * porcentagemdedescontodoinss /100;
        salarioliquido = salariobruto - descontoinss;

        //Saida de dados
        System.out.println("O salario bruto é: " + salariobruto);
        System.out.println("O valor de desconto do INSS é: " + descontoinss);
        System.out.println("O salario liquido é: " + String.format("%.2f", salarioliquido) );

    }
}
