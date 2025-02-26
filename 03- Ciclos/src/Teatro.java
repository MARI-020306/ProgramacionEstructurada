import javax.swing.*;

public class Teatro {
    public static void main(String[] args) {
        //Declaracion de variables
        int edad=0,respuesta=0;
        double precio=0.0, descuento=0.0,total=0.0;
        double cat1=0.0,cat2=0.0,cat3=0.0,cat4=0.0,cat5=0.0;
        //Entrada de datos
        precio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del boleto: "));
        do { //Inica do while

            //Ingresar edad del cliente
            edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
            //Condiciones a cumplir
            if (edad<5){ //Validar que la edad sea mayor a 5 años
                JOptionPane.showMessageDialog(null, "NO se permiten menores de 5 años");
            } else if (edad<=14) { //Evaluar la edad y calcular descuento
                descuento= precio*.35;
                cat1=cat1 + descuento;
            } else if (edad<=19) { //Evaluar la edad y calcular descuento
                descuento= precio * .25;
                cat2=cat2 + descuento;
            } else if (edad<=45) { //Evaluar la edad y calcular descuento
                descuento=precio * .10;
                cat3=cat3 + descuento;
            } else if (edad<=65) { //Evaluar la edad y calcular descuento
                descuento= precio * 0.25;
                cat4=cat4 + descuento;
            }else{
                descuento=precio * .35;
                cat5=cat5 + descuento;
            }
            //Creacion de cadena de texto para la salida
            JOptionPane.showMessageDialog(null, "El descuento aplicado es: $" + descuento);
            total=total+descuento; //Calcular el total a pagar
            respuesta=Integer.parseInt(JOptionPane.showInputDialog("¿Desea continuar? " +
                    "\nPara salir presione 1" + "\nPara continuar presione cualquier otro numero"));

        }while (respuesta==1); //Repetir hasta que la condicion se cumpla

        //Salida de datos
        JOptionPane.showMessageDialog(null, "El descuento total de la categoria 1 es: $" + cat1 +
                "\nEl descuento total de la categoria 2 es: $" + cat2 +
                "\nEl descuento total de la categoria 3 es: $" + cat3 +
                "\nEl descuento total de la categoria 4 es: $" + cat4 +
                "\nEl descuento total de la categoria 5 es: $" + cat5 +
                "\nEl descuento total es: $" + total);
    }
}
