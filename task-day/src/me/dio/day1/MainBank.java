package me.dio.day1;

import java.util.Scanner;

public class MainBank  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cliente paulaSilva = new Cliente();
        paulaSilva.setNome("Paula Silva");

        Conta cc = new ContaCorrente(paulaSilva);
        Conta poupanca = new ContaPoupanca(paulaSilva);
        System.out.println("Cliente: ");

        System.out.print("Qual o valor de depósito? ");
        double deposito = sc.nextDouble();
        cc.depositar(deposito);

        System.out.print("Qual valor deseja transferir para a poupança? ");
        double transferir = sc.nextDouble();
        cc.transferir(transferir, poupanca);
        System.out.println();

        cc.imprimirExtrato();
        poupanca.imprimirInforsExtrato();
    }
        protected void ImprimirInfosComum() {
    }
}
