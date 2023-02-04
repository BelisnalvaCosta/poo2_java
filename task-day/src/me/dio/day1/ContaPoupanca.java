package me.dio.day1;

@Contract(pure = true)
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("***** Extrato Conta Poupança *****");
        System.out.println();
    }
}
