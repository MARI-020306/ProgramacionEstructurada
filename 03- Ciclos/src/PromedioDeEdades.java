import javax.swing.*;

public class PromedioDeEdades {
    public static void main(String[] args) {
        int i=0;
        int numAlumnos=0,sexo=0,hombres=0,mujeres=0,edad=0;
        int edadMujeres=0,edadHombres=0, promedioM=0, promedioH=0,promFinal=0;

        numAlumnos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de alumnos totales del grupo: "));
        i=1;
        while (i<=numAlumnos){
            sexo=Integer.parseInt(JOptionPane.showInputDialog("Elegir un numero de acuerdo al sexo del alumno: " +
                    "\n1=Hombre" + "\n2=Mujer"));
            edad=Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad: "));

            if (sexo==1){
                hombres++;
                edadHombres=edadHombres + edad;
                promedioH=edadHombres/hombres;
            } else if (sexo==2) {
                mujeres++;
                edadMujeres=edadMujeres + edad;
                promedioM=edadMujeres/mujeres;
            }else{
                JOptionPane.showMessageDialog(null, "Escribir un numero valido");
                i--;
            }
            i++;
        }
        promFinal=(edadMujeres + edadHombres)/numAlumnos;
        JOptionPane.showMessageDialog(null, "El promedio de todo el grupo es: " + promFinal + " años " +
                "\nEl promedio de edades de hombres de todo el grupo es es: " + promedioH  + " años " +
                "\nEl promedio de edades de mujeres de todo el grupo es: " + promedioM + " años ");
    }
}
