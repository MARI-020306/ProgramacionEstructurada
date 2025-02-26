import javax.swing.*;

public class PromedioDeEdades {
    public static void main(String[] args) {
        //Declaracion de variables
        int i=0;
        int numAlumnos=0,sexo=0,hombres=0,mujeres=0,edad=0;
        int edadMujeres=0,edadHombres=0, promedioM=0, promedioH=0,promFinal=0;

        //Entrada de datos
        numAlumnos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de alumnos totales del grupo: "));
        i=1;
        while (i<=numAlumnos){ //Inicia while

            //Seleccionar el sexo al que el usuario pertenece
            sexo=Integer.parseInt(JOptionPane.showInputDialog("Elegir un numero de acuerdo al sexo del alumno: " +
                    "\n1=Hombre" + "\n2=Mujer"));
            //Ingresar edad
            edad=Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad: "));

            //Condiciones a cumplir
            if (sexo==1){
                hombres++;
                edadHombres=edadHombres + edad; //Contar edad de los hombres
                promedioH=edadHombres/hombres; //Calcular promedio
            } else if (sexo==2) {
                mujeres++;
                edadMujeres=edadMujeres + edad; //Contar edad de las mujeres
                promedioM=edadMujeres/mujeres; //Calcular promedio
            }else{
                //Validar los valores permitidos
                JOptionPane.showMessageDialog(null, "Escribir un numero valido");
                i--; //Decrementar en caso de ingresar un valor incorrecto
            }
            i++;
        }
        //Salida de datos
        promFinal=(edadMujeres + edadHombres)/numAlumnos;
        JOptionPane.showMessageDialog(null, "El promedio de todo el grupo es: " + promFinal + " años " +
                "\nEl promedio de edades de hombres de todo el grupo es es: " + promedioH  + " años " +
                "\nEl promedio de edades de mujeres de todo el grupo es: " + promedioM + " años ");
    }
}
