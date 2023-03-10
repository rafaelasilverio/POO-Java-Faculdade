import java.util.Scanner;
public class ex20 
{
        public static void main(String[] args) 
        {
            String nome = "", telefone = "", rua = "", numero = "";

            Scanner entrada = new Scanner(System.in);
            
            System.out.println();
            System.out.print("Informe seu nome: ");
            nome = entrada.nextLine();
            System.out.print("Informe seu telefone: ");
            telefone = entrada.nextLine();
            System.out.print("Informe sua rua: ");
            rua = entrada.nextLine();
            System.out.print("Informe o nº: ");
            numero = entrada.nextLine();

            System.out.println();
            System.out.println("---------Confirme seus dados---------");
            System.out.println(nome);
            System.out.println(telefone);
            System.out.println(rua+", "+numero);

            entrada.close();
        }
}
