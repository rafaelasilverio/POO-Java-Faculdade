/*
Faça um programa que receba valores inteiros, armazenando esses valores em uma matriz 5x5 de nome A, receba 
separadamente um valor inteiro, armazenando ela em uma variável de nome X, verifique se o valor de X é par ou impar 
e crie uma nova matriz de nome B, usando os valores da matriz A de 2 formas:
1 - multiplicando o valor da matriz A pelo valor de X, caso o valor de A seja semelhante ao valor da variável X 
    (par ou impar).
2 - copiando o valor da matriz A para a matriz B, caso o valor de A seja diferente do valor de X (par ou impar)
*/
import java.util.Scanner;

public class avaliacao01 
{
    public static void main(String[] args) 
    {
        int A[][] = new int[5][5], B[][] = new int[5][5], X, parOuImpar;

        Scanner entrada = new Scanner(System.in);

        //Preenche matriz A
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                System.out.println("Informe a termo da "+(i+1)+"ª linha e "+(j+1)+"ª coluna da matriz A >>");
                A[i][j] = entrada.nextInt();
            }
        }

        //Imprime a matriz A
        System.out.println();
        System.out.println("----Matriz A----");
        for(int p = 0; p < 5; p++)
        {
            for(int q = 0; q < 5; q++)
            {
             System.out.print(A[p][q]+" ");
             if(q == 4)
             {
                System.out.println();
             }
            }
        }

        //Recebe X
        System.out.println();
        System.out.println("Informe o valor de X: ");
        X = entrada.nextInt();

        //Verifica se X é par ou ímpar
        if(X % 2 == 0)
        {
            System.out.println(X+" é par");
            parOuImpar = 0;
        }
        else
        {
            System.out.println(X+" é ímpar");
            parOuImpar = 1;
        }

        //Compara X com os valores da matriz A para preencher B
        for(int m = 0; m < 5; m++)
        {
            for(int n = 0; n < 5; n++)
            {
                if(((A[m][n] % 2 == 0) && (parOuImpar == 0)) || ((A[m][n] % 2 != 0) && (parOuImpar != 0)))
                {
                   B[m][n] = A[m][n] * X;
                }
                else
                {
                    B[m][n] = A[m][n];
                }
            }
        }

        //Imprime a matriz B
        System.out.println();
        System.out.println("----Matriz B----");
        for(int s = 0; s < 5; s++)
        {
            for(int t = 0; t < 5; t++)
            {
             System.out.print(B[s][t]+" ");
             if(t == 4)
             {
                System.out.println();
             }
            }
        }
        entrada.close();
    }
}
