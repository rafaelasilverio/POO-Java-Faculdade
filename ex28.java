import java.util.Scanner;
import java.util.Random; 

public class ex28 {
    public static void main(String[] args) 
    {
        int A[][] = new int[3][5], X, r;

        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                A[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Informe o valor de X: ");
        X = entrada.nextInt();

        if(X % 2 == 0)
        {
            System.out.println(X+" é par");
            r = 0;
        }
        else
        {
            System.out.println(X+" é ímpar");
            r = 1;
        }
        
        for(int m = 0; m < 3; m++)
        {
            for(int n = 0; n < 5; n++)
            {
                if(A[m][n] % 2 == 0 && r == 0)
                {
                    System.out.println("O termo da linha "+m+"e coluna"+n+" é ");
                }
            }
        }


        entrada.close();
    }
}
