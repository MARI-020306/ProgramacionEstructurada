import javax.swing.*;

public class Empresa {
    public static void main(String[] args) {
        //Declaracion de variables
        int saldo=0, prestamo=0,saldoNuevo=0, equipCom=0, moviliario=0, total=0;
        String salida="";

        //Entrada de datos
        saldo=Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu saldo: "));

        //Condiciones a cumplir (ciclo anidado)
        if (saldo<=0){
            prestamo= 10000 - saldo;
            saldoNuevo=prestamo + saldo;

        }else if (saldo<2000){
            prestamo=20000 - saldo;
            saldoNuevo= prestamo + saldo;
        }else{
            saldoNuevo=saldo;
        }
        //Ingreso de datos segun el prestamos
        equipCom=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad destinada para el equipo de computo: "));
        moviliario=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad destinada para el moviliario de la empresa: "));
        total= equipCom + moviliario;
        saldoNuevo-=total;

        //Salida de datos
        JOptionPane.showMessageDialog(null, "El presupuesto se repartira de la siguiente manera:\n" +
                "Para el equipo de computo: "+ equipCom + "\n" +
                "Para el moviliario: " + moviliario + "\n" +
                "Para la compra de insumos: " + saldoNuevo/2 + "\n" +
                "Para incentivos: " + saldoNuevo/2 + "\n" +
                "El prestamo solicitado al banco fue de: " + prestamo + " pesos.");
    }
}
