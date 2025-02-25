import javax.swing.*;

public class HombresYMujeres {
    public static void main(String[] args) {
       int i=0;
       int numAlumnos=0,sexo=0,hombres=0,mujeres=0;

       numAlumnos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de alumnos totales del grupo: "));
       i=1;
       while (i<=numAlumnos){
           sexo=Integer.parseInt(JOptionPane.showInputDialog("Elegir un numero de acuerdo al sexo del alumno: " +
                   "\n1=Hombre" + "\n2=Mujer"));

           if (sexo==1){
               hombres++;
           } else if (sexo==2) {
               mujeres++;
           }else{
               JOptionPane.showMessageDialog(null, "Escribir un numero valido");
               i--;
           }
           i++;
       }
       JOptionPane.showMessageDialog(null, "El numero de hombres es: " + hombres +
               "\nEl numero de mujeres es: " + mujeres);
    }
}