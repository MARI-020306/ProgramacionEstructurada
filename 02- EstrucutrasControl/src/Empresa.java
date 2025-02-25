import javax.swing.*;

public class Empresa {
    public static void main(String[] args) {
        int saldo=0, prestamo=0,saldoNuevo=0, equipCom=0, moviliario=0, total=0;
        String salida="";

        saldo=Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu saldo: "));
        if (saldo<=0){
            prestamo= 10000 - saldo;
            saldoNuevo=prestamo + saldo;

        }else if (saldo<2000){
            prestamo=20000 - saldo;
            saldoNuevo= prestamo + saldo;
        }else{
            saldoNuevo=saldo;
        }
        equipCom=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad destinada para el equipo de computo: "));
        moviliario=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad destinada para el moviliario de la empresa: "));
        total= equipCom + moviliario;
        saldoNuevo-=total;
        JOptionPane.showMessageDialog(null, "El presupuesto se repartira de la siguiente manera:\n" +
                "Para el equipo de computo: "+ equipCom + "\n" +
                "Para el moviliario: " + moviliario + "\n" +
                "Para la compra de insumos: " + saldoNuevo/2 + "\n" +
                "Para incentivos: " + saldoNuevo/2 + "\n" +
                "El prestamo solicitado al banco fue de: " + prestamo + " pesos.");
    }
}
