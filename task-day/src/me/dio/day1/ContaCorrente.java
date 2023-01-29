package me.dio.day1;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super();
    }

    public void imprimirExtrato(Object imprimirInforsComuns) {
        System.out.println("=== Extrato Conta Corrente ===");
        System.out.println();
    }

    @Override
    public void imprimirInforsExtrato() {

    }

    @Override
    public void getSaldo(double saldo, Conta contaCorrente) {

    }
}
