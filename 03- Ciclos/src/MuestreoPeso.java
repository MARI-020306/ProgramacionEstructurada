import javax.swing.*;

public class MuestreoPeso {
    public static void main(String[] args) {
        //Declaracion de variables
        int edad=0,peque=0,joven=0,adulto=0,viejo=0, numPob=0;
        double peso=0.0,pesoP=0.0,pesoJ=0.0,pesoA=0.0,pesoV=0.0;
        double promP=0.0,promJ=0.0,promA=0.0,promV=0.0;

        //Entrada de datos
        numPob=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de personas que proporcionaran sus datos: "));
        for (int i = 1; i <=numPob ; i++) { //Inicia for
            edad=Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad, persona " + i));
            peso=Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu peso, persona " + i ));

            //Condiciones a cumplir
            if (edad<0){
                JOptionPane.showMessageDialog(null, "¡Error!, la edad ingresada NO es valida");
            }else if (edad<=12){ //Evaluacion de edad
                pesoP=pesoP + peso;
                peque=peque + 1;
                promP=pesoP/peque;
            } else if (edad<=29) { //Evaluacion de edad
                pesoJ=pesoJ + peso;
                joven=joven + 1;
                promJ=pesoJ/joven;
            }else if (edad<=59){ //Evaluacion de edad
                pesoA=pesoA + peso;
                adulto=adulto + 1;
                promA=pesoA/adulto;
            }else{
                pesoV=pesoV + peso;
                viejo=viejo + 1;
                promV=pesoV/viejo;
            }

        }
        //Salida de datos
        JOptionPane.showMessageDialog(null, "El promedio de peso de los niños es: " + promP +
                "\nEl primedio de peso de los jovenes es: " + promJ +
                "\nEl primedio de peso de los adultos es: " + promA +
                "\nEl primedio de peso de los adultos mayores es: " + promV);

    }
}
