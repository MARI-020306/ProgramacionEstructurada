import javax.swing.*;

public class VerificacionPuntos {
    public static void main(String[] args) {
        //Declaracion de variables
        double puntos=0.0,numMayor=0.0,numeMenor=0.0,suma=0.0;
        for (int i = 1; i <=25 ; i++) { //Inicia for

            //Entrada de datos
            puntos=Double.parseDouble(JOptionPane.showInputDialog("Ingrese los puntos contaminantes: "));
            suma=suma + puntos; //Calculo de la suma

            //Condiciones a cumplir
            if (i==1){
                numMayor=puntos;
                numeMenor=puntos;
            } else if (numMayor>=puntos) { //Evaluacion de datos
                if (numeMenor>puntos){
                    numeMenor=puntos;
                }
            }else {
                numMayor = puntos;             //Evaluacion de datos
                if (numeMenor>puntos){
                    numeMenor=puntos;
                }
            }

        }
        if (numMayor==numeMenor){ //Notificar que si los valores swr repiten los puntos de contamonacion son iguales
            JOptionPane.showMessageDialog(null, "Los puntos de contaminacion son iguales");
        }else {
            //De lo contrario mostrar cuales son los puntos mayores y los menores
            JOptionPane.showMessageDialog(null, "Los puntos de mayor contaminacion son: " + numMayor +
                    "\nLos puntos de menor contaminacion son: " + numeMenor);
        }
        //Salida de datos
        JOptionPane.showMessageDialog(null, "El promedio de puntos de contaminacion es: " + (suma / 25));
    }
}
