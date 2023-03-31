public class TestaConta {
    public static void main(String[] args) {
        Conta conta = new Conta("1234", 100);
        // conta.nro = "4321";
        // conta.saldo = 200;
        System.out.println("Nro da conta: "+conta.getNumero());
        System.out.println("Saldo Atual: R$"+conta.getSaldo());
    }
}
