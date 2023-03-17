//igual o ex anterior, porém utilizando numeros aleatorios
import java.util.Random;

public class ex27 {
    public static void main(String[] args) {
        
        int A[][] = new int[5][5], B[][] = new int[5][5], C[][] = new int[5][5];

        Random random = new Random();

        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                A[i][j] = random.nextInt(100);
            }
        }

        
        for(int m = 0; m < 5; m++)
        {
            for(int n = 0; n < 5; n++)
            {
                B[m][n] = random.nextInt(100);
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

    }
}
