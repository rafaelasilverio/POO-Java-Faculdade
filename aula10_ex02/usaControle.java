package aula10_ex02;

public class usaControle 
{
    public static void main(String[] args) 
    {
        Televisao teve = new Televisao();
        ControleRemoto controle = new ControleRemoto(teve);

        System.out.println("------CONSULTANDO VOLUME INICIAL------");
        System.out.println(controle.consultarVolume());
        System.out.println();
        controle.definirVolume(3);
        System.out.println("------CONSULTANDO VOLUME ALTERADO PARA 3------");
        System.out.println(controle.consultarVolume());
        System.out.println();
        controle.diminuirVolume();
        System.out.println("------CONSULTANDO VOLUME DIMINUIDO EM 1------");
        System.out.println(controle.consultarVolume());
        System.out.println();
        controle.aumentarVolume();
        System.out.println("------CONSULTANDO VOLUME AUMENTADO EM 1------");
        System.out.println(controle.consultarVolume());
        System.out.println();
        System.out.println("------CONSULTANDO CANAL INICIAL------");
        System.out.println(controle.consultarCanal());
        System.out.println();
        controle.definirCanal(20);
        System.out.println("------CONSULTANDO CANAL ALTERADO PARA 20------");
        System.out.println(controle.consultarCanal());
        System.out.println();
        controle.diminuirCanal();
        System.out.println("------CONSULTANDO CANAL DIMINUÍDO EM 1------");
        System.out.println(controle.consultarCanal());
        System.out.println();
        controle.aumentarCanal();
        System.out.println("------CONSULTANDO CANAL AUMENTADO EM 1------");
        System.out.println(controle.consultarCanal());
        System.out.println();
    }
}
