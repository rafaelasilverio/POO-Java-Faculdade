import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3, tamanho = 0;

        Scanner entrada = new Scanner(System.in);
        
        System.out.println();
        System.out.println("------------------------Calculadora da sequência de Fibonacci------------------------");
        System.out.print("Por favor, informe quantos elementos da sequência de Fibonacci você deseja exibir: ");
        tamanho = entrada.nextInt();

        System.out.println();
        System.out.println("--------Sequência de Fibonacci até o "+tamanho+"º elemento--------");
        System.out.println(n1);
        System.out.println(n2);

        for (int i = 2; i < tamanho; ++i) {
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
