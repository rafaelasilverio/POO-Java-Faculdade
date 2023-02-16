import java.util.Scanner;

public class ex06 
{
    public static void main(String[] args)
    {
        float nota1 = 0;
        float nota2 = 0;
        float media = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        nota1 = entrada.nextFloat();
        System.out.println("Informe a segunda nota: ");
        nota2 = entrada.nextFloat();

        media = (nota1 + nota2) / 2;
        System.out.println("A média é: "+media);
        entrada.close();
    }
}
