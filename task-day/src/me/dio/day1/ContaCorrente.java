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
    public void saldo(double valor, Iconta contaCorrente) {

    }

    @Override
    public void imprimirInforsExtrato() {

    }

    @Override
    public void getSaldo(double saldo, Conta contaCorrente) {

    }

    public void saldo(double saldo, Conta contaCorrente) {

    }
}
