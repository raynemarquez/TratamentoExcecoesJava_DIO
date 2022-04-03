package br.com.dio.exceptions;

import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {

        boolean continueLooping = true;

        do {

            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada invalida, informe um numero inteiro! " + e.getMessage());
                //e.printStackTrace();
            }catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null, "Impossivel realizar a divisão por 0 ");
            }
            finally {
                System.out.println("Chegou no Finally");
            }
        } while(continueLooping);

        System.out.println("O codigo continua...");
    }

    public static int dividir(int a, int b){
        return a/b;
    }
}

