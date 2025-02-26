import javax.swing.*;

public class Colegio {
    public static void main(String[] args) {

        //Declaracion de variables
        int materias=0, colegiatura=0, materiasReprobadas=0;
        double promedio=0.0, descuento=0.0, total=0.0;
        String nivelEscolar="";

        //Entrada de datos
        materias=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de materias que cursaras: "));
        promedio=Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu promedio"));
        nivelEscolar=JOptionPane.showInputDialog("Ingrese el nivel educativo en el que se encuentra el alumno: ");
        materiasReprobadas=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de materias que has reprobado: "));

        //Ciclo anidado, evaluacion de datos y nivel escolar para calcular descuento
        if (promedio>=9.5 && nivelEscolar.equalsIgnoreCase("preparatoria")){
            colegiatura= materias*36;
            descuento=(colegiatura*0.30);
            total=colegiatura - descuento;
            JOptionPane.showMessageDialog(null, "El alumno puede cursar 55 unidades y el total a pagar con un 25% de descuento es: $" + total + " pesos.");

        // Evaluacion de datos y nivel escolar para calcular descuento
        } else if (promedio>=9.0 && promedio<9.5 && nivelEscolar.equalsIgnoreCase("preparatoria")){
            colegiatura= materias*36;
            descuento=(colegiatura*0.10);
            total=colegiatura - descuento;
            JOptionPane.showMessageDialog(null, "El alumno puede cursar 50 unidades y el total a pagar con un 10% de descuento es: $" + total + " pesos.");

           // Evaluacion de datos y nivel escolar para calcular descuento
        } else if (promedio>=7.0 && promedio<9.0 && nivelEscolar.equalsIgnoreCase("preparatoria")){
            colegiatura= materias*36;
            total=colegiatura;
            JOptionPane.showMessageDialog(null, "El alumno puede cursar 50 unidades y el total a pagar es: $" + total + " pesos.");

        //Evaluacion de datos y nivel escolar para calcular descuento
        }else if (promedio<=7 && materiasReprobadas>0 && materiasReprobadas<=3 && nivelEscolar.equalsIgnoreCase("preparatoria")){
            colegiatura= materias*36;
            total=colegiatura;
            JOptionPane.showMessageDialog(null, "El alumno puede cursar 45 unidades y el total a pagar es: $" + total + " pesos.");

        //Evaluacion de datos y nivel escolar para calcular descuento
        }else if (promedio<=7 && materiasReprobadas>4 && nivelEscolar.equalsIgnoreCase("preparatoria")) {
            colegiatura= materias*36;
            total = colegiatura;
            JOptionPane.showMessageDialog(null, "El alumno puede cursar 40 unidades y el total a pagar es: $" + total + " pesos.");

        //Evaluacion de datos y nivel escolar para calcular descuento
        }else if (promedio>=9.5 && nivelEscolar.equalsIgnoreCase("profesional")) {
            colegiatura= materias*60;
            descuento = (colegiatura * 0.20);
            total = colegiatura - descuento;
            JOptionPane.showMessageDialog(null, "El alumno puede cursar 55 unidades y el total a pagar con un 20% de descuento es: $" + total + " pesos.");

        //Evaluacion de datos y nivel escolar para calcular descuento
        }else if (promedio<9.5 && nivelEscolar.equalsIgnoreCase("profesional")) {
            colegiatura= materias*60;
            total = colegiatura;
            JOptionPane.showMessageDialog(null, "El alumno puede cursar 55 unidades y el total a pagar es: $" + total + " pesos.");

        //Evaluacion de datos y nivel escolar para calcular descuento
        }else {
            total = colegiatura;
            JOptionPane.showMessageDialog(null, "El alumno no cumple con los requisitos necesarios su total a pagar es: $" + total + "pesos");
        }
    }
}
