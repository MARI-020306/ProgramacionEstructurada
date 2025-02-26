import javax.swing.JOptionPane;

public class SumaYMultiplicacion {
    public static void main(String[] args) {
        //Declaracion de variables
        int veces=0;
        int numero=0;
        //Entrada de datos
        veces =Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros a evaluar"));

        //Inicializacion de variables
        int sumaPositivos = 0;
        int multiplicacionNegativos = 1;

        for (int i = 0; i < veces; i++) { //Inicia for
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número " + (i + 1)));

            //Condiciones a cumplir
            if (numero > 0) {
                sumaPositivos += numero;
            }else if (numero < 0) {
                multiplicacionNegativos *= numero;
            }
        }

        //Creacion de cadena de salida y evaluacion de los numero positivos y negativos para asignar su operacion correspondiente
        String resultado = "Suma de los números positivos: " + sumaPositivos + "\n";
        if (multiplicacionNegativos != 1) {
            resultado += "Multiplicación de los números negativos: " + multiplicacionNegativos;
        } else {
            resultado += "No se ingresaron números negativos.";
        }

        //Salida de datos
        JOptionPane.showMessageDialog(null, resultado);
    }
}
