// imprimir a sequencia de Fibonacci ate o 20º elemento e informar se é par ou impar
public class ex19 {
    public static void main(String[] args) 
    {
        int n1 = 0, n2 = 1, n3, i, tamanho = 20;

        System.out.println(n1+" - Par");
        System.out.println(n2+" - Ímpar");

        for (i = 2; i < tamanho; ++i)
        {
            n3 = n1 + n2;
            System.out.print(n3);
            if(n3 % 2 == 0)
            {
                System.out.println(" - Par");
            }
            else
            {
                System.out.println(" - Ímpar");
            }
            n1 = n2;
            n2 = n3;
        }

    }

}

