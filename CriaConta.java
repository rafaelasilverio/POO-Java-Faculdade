class CriaConta 
{
    public static void main(String[] args) 
    {
        Conta conta1 = new Conta("21.342-7", 0);
        conta1.depositar(500.87);
        conta1.sacar(45.00);
        System.out.println(conta1.getNumero());
        System.out.println(conta1.getSaldo());
    }
}
