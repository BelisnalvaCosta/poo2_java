package me.dio.day1;

public interface Iconta {
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Iconta contaDestino);

    void saldo(double valor, Iconta contaCorrente);

    void imprimirInforsExtrato();
}
