import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        
        int A[][] = new int[5][5], B[][] = new int[5][5], C[][] = new int[5][5];

        Scanner entrada = new Scanner(System.in);

        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                System.out.println("Informe a termo da "+i+1+"ª linha e "+j+1+"ª coluna da matriz A>>");
                A[i][j] = entrada.nextInt();
            }
        }

        
        for(int m = 0; m < 5; m++)
        {
            for(int n = 0; n < 5; n++)
            {
                System.out.println("Informe a termo da "+m+1+"ª linha e "+n+1+"ª coluna da matriz B>>");
                B[m][n] = entrada.nextInt();
            }
        }

        for(int s = 0; s < 5; s++)
        {
            for(int t = 0; t < 5; t++)
            {
                C[s][t] = B[s][t] + A[s][t];
            }
        }

        System.out.println("Primeira matriz");
        for(int q = 0; q < 5; q++)
        {
            for(int r = 0; r < 5; r++)
            {
                System.out.println(A[q][r]);
            }
        }

        System.out.println("Segunda matriz");
        for(int c = 0; c < 5; c++)
        {
            for(int d = 0; d < 5; d++)
            {
                System.out.println(B[c][d]);
            }
        }
        System.out.println("Terceira matriz");
        for(int y = 0; y < 5; y++)
        {
            for(int z = 0; z < 5; z++)
            {
                System.out.println(C[y][z]);
            }
        }

        entrada.close();
    }
}
