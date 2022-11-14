public class Main {
    public static void main(String[] args){

        Cliente Priscila = new Cliente();
        Priscila.setNome("Priscila");

        conta cc = new ContaCorrente(Priscila);
        conta poupanca = new ContaPoupanca(Priscila);

        cc.depositar(100);
        cc.transferir(100,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}