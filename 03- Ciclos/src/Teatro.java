import javax.swing.*;

public class Teatro {
    public static void main(String[] args) {
        int edad=0,respuesta=0;
        double precio=0.0, descuento=0.0,total=0.0;
        double cat1=0.0,cat2=0.0,cat3=0.0,cat4=0.0,cat5=0.0;
        precio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del boleto: "));
        do {
            edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
            if (edad<5){
                JOptionPane.showMessageDialog(null, "NO se permiten menores de 5 años");
            } else if (edad<=14) {
                descuento= precio*.35;
                cat1=cat1 + descuento;
            } else if (edad<=19) {
                descuento= precio * .25;
                cat2=cat2 + descuento;
            } else if (edad<=45) {
                descuento=precio * .10;
                cat3=cat3 + descuento;
            } else if (edad<=65) {
                descuento= precio * 0.25;
                cat4=cat4 + descuento;
            }else{
                descuento=precio * .35;
                cat5=cat5 + descuento;
            }
            JOptionPane.showMessageDialog(null, "El descuento aplicado es: $" + descuento);
            total=total+descuento;
            respuesta=Integer.parseInt(JOptionPane.showInputDialog("¿Desea continuar? " +
                    "\nPara salir presione 1" + "\nPara continuar presione cualquier otro numero"));

        }while (respuesta==1);
        JOptionPane.showMessageDialog(null, "El descuento total de la categoria 1 es: $" + cat1 +
                "\nEl descuento total de la categoria 2 es: $" + cat2 +
                "\nEl descuento total de la categoria 3 es: $" + cat3 +
                "\nEl descuento total de la categoria 4 es: $" + cat4 +
                "\nEl descuento total de la categoria 5 es: $" + cat5 +
                "\nEl descuento total es: $" + total);
    }
}
