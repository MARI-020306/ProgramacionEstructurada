import javax.swing.*;

public class TresNumerosDiferentes {
    public static void main(String[] args) {
        int num1=0,num2=0,num3=0;
        num1=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero 1:"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero 2:"));
        num3=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero 3:"));

        if (num1!=num2 && num1!=num3 && num2!=num3 ) {
            if (num1 > num2 && num1 < num3 && num1 < num2 && num1 > num3){
                JOptionPane.showMessageDialog(null, "El numero medio es: " + num1);
            } else if (num2 > num1 && num2 < num3 && num2 < num1 && num2 > num3){
                JOptionPane.showMessageDialog(null, "El numero medio es: " + num2);
            } else if (num3 > num1 && num3 < num2 && num3 < num1 && num3 > num2){
                JOptionPane.showMessageDialog(null, "El numero medio es: " + num3);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Los numero deben ser diferentes");
        }
    }
}
