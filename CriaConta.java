class CriaConta 
{
    public static void main(String[] args) 
    {
        Conta conta1 = new Conta("21.342-7", 0);
        // conta1.numero = "21.342-7";
        // conta1.saldo = 0;
        conta1.credito(500.87);
        conta1.debito(45.00);
        System.out.println(conta1.saldo);
    }
}
