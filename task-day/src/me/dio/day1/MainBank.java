package me.dio.day1;

import java.util.Scanner;

public class MainBank  {

    private static Conta ContaCorrente;
    private static Iconta ContaPoupanca;
    private static Object Cliente;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cliente eliezer = new Cliente("Eliezer");
        eliezer.setNome("Eliezer");

        Conta cc = new ContaCorrente(eliezer);
        ContaPoupanca contaPoupanca = new ContaPoupanca(" ");

        System.out.print("Qual o valor de depósito? ");
        double deposito = sc.nextDouble();
        cc.depositar(deposito);

        System.out.print("Qual valor deseja transferir para a poupança? ");
        double transferir = sc.nextDouble();
        cc.transferir(transferir, ContaPoupanca);
        System.out.println();

        double saldo = sc.nextDouble();
        cc.getSaldo(saldo, ContaCorrente);
        System.out.println();

        cc.imprimirInforsExtrato();
        contaPoupanca.imprimirInforsExtrato();
    }
}