import java.util.Scanner;

public class ex24 
{
    public static void main(String[] args) 
    {
        int X, B[] = new int[10], A[] = {7, 8, 5, 9, 2, 3, 12, 30, 17, 25};

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor de X: ");
        X = entrada.nextInt();

        for(int i = 0; i < 10; i++)
        {
            B[i] = A[i] + X;
        }

        System.out.println("-----Vetor A-----");
        for(int j = 0; j < 10; j++)
        {
            System.out.println(A[j]);
        }

        System.out.println("-----Vetor B-----");
        for(int k = 0; k < 10; k++)
        {
            System.out.println(B[k]);
        }

        entrada.close();
    }
}
