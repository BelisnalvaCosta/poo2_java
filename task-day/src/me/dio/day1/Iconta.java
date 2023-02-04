package me.dio.day1;

public interface Iconta {

    void depositar(double valor);

    void sacar(double valor);

    void transferir(double valor, Iconta contaDestino);

    void imprimirExtrato();
}
