import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {

        //Declaração de dados
        Scanner sc = new Scanner(System.in);
        int valor, unidade, dezena, centena, valoraocontrario;

        //Entrada de dados
        System.out.println("O valor de 3 digitos é: ");
        valor = sc.nextInt();

        //Processamento
        unidade = valor % 10;
        dezena = valor / 10 % 10;
        centena = valor / 100;
        valoraocontrario = unidade * 100 + dezena * 10 + centena;

        //Saida de dados
        System.out.println( unidade+""+dezena+""+centena );
        System.out.println("Valor invertido é: " + valoraocontrario);


    }
}
