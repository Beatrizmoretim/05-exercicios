import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {


        //Declaração de dados
        Scanner sc = new Scanner(System.in);
        int valor, dezena;

        //Entrada de dados
        System.out.println("Informe um valor com 3 digitos (100-199): ");
        valor = sc.nextInt();

        //Processamento
        dezena = valor % 100/10;

        //Saida de dados
        System.out.println("Dezena = " + dezena);
    }
}
