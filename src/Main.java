public class Main {
    public static void main(String[] args) {
        Banco santander = new Banco();
        santander.setNome("Santander");

        //instanciando clientes
        Cliente eduardo = new Cliente();
        eduardo.setNome("Eduardo");

        Cliente maria = new Cliente();
        maria.setNome("Maria");

        Cliente ricardo = new Cliente();
        ricardo.setNome("Ricardo");

        Cliente mariana = new Cliente();
        mariana.setNome("Mariana");

        Cliente peter = new Cliente();
        peter.setNome("Peter");

        //instanciando contas
        Conta correnteEduardo = new ContaCorrente(eduardo);
        correnteEduardo.depositar(100);

        Conta correnteMaria = new ContaCorrente(maria);
        correnteMaria.depositar(100);

        Conta correnteRicardo = new ContaCorrente(ricardo);
        correnteRicardo.depositar(100);

        Conta correnteMariana = new ContaCorrente(mariana);
        correnteMariana.depositar(100);

        Conta correntePeter = new ContaCorrente(peter);
        correntePeter.depositar(100);

        correnteEduardo.imprimirExtrato();
        correnteMaria.imprimirExtrato();

        System.out.println(santander.getContas());
    }
}
