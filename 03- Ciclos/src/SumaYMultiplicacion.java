import javax.swing.JOptionPane;

public class SumaYMultiplicacion {
    public static void main(String[] args) {
        int veces=0;
        int numero=0;
        veces =Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros a evaluar"));

        int sumaPositivos = 0;
        int multiplicacionNegativos = 1;

        for (int i = 0; i < veces; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número " + (i + 1)));

            if (numero > 0) {
                sumaPositivos += numero;
            }else if (numero < 0) {
                multiplicacionNegativos *= numero;
            }
        }

        String resultado = "Suma de los números positivos: " + sumaPositivos + "\n";
        if (multiplicacionNegativos != 1) {
            resultado += "Multiplicación de los números negativos: " + multiplicacionNegativos;
        } else {
            resultado += "No se ingresaron números negativos.";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}
