public class Conta2 {
    private double saldo;
    public Conta2()
    {
        
    }
    public Conta2(double saldo)
    {
        this.saldo = saldo;
    }

    public static void main(String[] args)
    {
        Conta2 c1 = new Conta2();
        Conta2 c2 = new Conta2(100);
    }
}
