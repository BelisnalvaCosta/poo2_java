package me.dio.day2;

import java.util.*;

public class CodigoNota {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Código para ajudar debugging
        System.out.println("Favor digite uma nota: ");
        int nota = input.nextInt();

        if (nota == 0) {
            System.out.println('E');
        } else if (nota >=1 && nota <=33) {
            System.out.println('D');
        } else if (nota >=34 && nota <=59) {
            System.out.println('C');
        } else if (nota >=60 && nota <=84) {
            System.out.println('B');
        } else if (nota >=85 && nota <=100) {
            System.out.println('A');
        } else if (nota >=101 && nota <=150) {
            System.out.println("QI acima da média");
        } else {
            //Debug meu
            System.out.println("Essa não é uma nota válida. Favor inserir uma nota de 0 a 150.");
        }
        input.close();
    }
}