class Conta
{
    String numero;
    double saldo;

    public Conta(String nro, double saldoInicial)
    {
        numero = nro;
        saldo = saldoInicial;
    }

    void credito(double valor)
    {
        saldo = saldo + valor;
    }

    void debito(double valor)
    {
        saldo = saldo - valor;
    }
}