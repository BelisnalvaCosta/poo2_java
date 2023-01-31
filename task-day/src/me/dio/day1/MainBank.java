package me.dio.day1;

import java.util.Scanner;

public class MainBank  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cliente paulaSilva = new Cliente("Paula Silva");
        paulaSilva.setNome("Paula Silva");

        Conta cc = new ContaCorrente(paulaSilva);
        Conta poupanca = new Conta() {
            @Override
            public void saldo(double valor, Iconta contaCorrente) {

            }

            @Override
            public void getSaldo(double saldo, Conta contaCorrente) {
                saldo(saldo);
            }
        };
        System.out.println("Cliente: ");

        System.out.print("Qual o valor de depósito? ");
        double deposito = sc.nextDouble();
        cc.depositar(deposito);

        System.out.print("Qual valor deseja transferir para a poupança? ");
        double transferir = sc.nextDouble();
        cc.transferir(transferir, poupanca);
        System.out.println();

        System.out.print("Saldo atual: ");
        double saldo = sc.nextDouble();
        cc.saldo(saldo);
        System.out.println();

        cc.imprimirInforsExtrato();
        poupanca.imprimirInforsExtrato();
        ContaCorrente contaCorrenteSaldo;
        cc.imprimirInforsExtrato();
    }

        public void saldo(double valor, Iconta contaCorrente) {

    }

        public void getSaldo(double saldo, Conta contaCorrente) {
    }

}
