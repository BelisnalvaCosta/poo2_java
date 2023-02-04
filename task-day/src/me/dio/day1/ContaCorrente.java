package me.dio.day1;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("***** Extrato Conta Corrente *****");
        super.imprimirInforsExtrato();
        System.out.println();
    }
}
