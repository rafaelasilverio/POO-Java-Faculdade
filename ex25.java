//igual o ex anterior, porém utilizando numeros aleatorios
import java.util.Scanner;
import java.util.Random;

public class ex25 
{
    public static void main(String[] args) 
    {
        int X, B[] = new int[10], A[] = new int[10];
        
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Informe o valor de X: ");
        X = entrada.nextInt();

        for(int h = 0; h < 10; h++)
        {
            A[h] = random.nextInt(100);
        }

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
