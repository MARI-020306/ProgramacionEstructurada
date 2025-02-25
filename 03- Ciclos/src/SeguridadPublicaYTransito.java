import javax.swing.*;

public class SeguridadPublicaYTransito {
    public static void main(String[] args) {
        boolean sentinel = true;
        int numCarros = 0;
        int amarilla = 0;
        int rosa = 0;
        int roja = 0;
        int verde = 0;
        int azul = 0;

        JOptionPane.showMessageDialog(null, "Este programa cuenta el numero de autos que ingresan al DF" + " Y su calcomanida correspondiente segun el ultimo digito de su placa" + "\nPara terminar introduce una calificacion con -1");
        int x = 1;
        while (sentinel) {
            numCarros = Integer.parseInt(JOptionPane.showInputDialog("Introduce el ultimo digito de tu placa, carro No." + x));
            if (numCarros != -1) {
                if (numCarros >= 1 && numCarros <= 2) {
                    amarilla++;
                } else if (numCarros >= 3 && numCarros <= 4) {
                    rosa++;
                } else if (numCarros >= 5 && numCarros <= 6) {
                    roja++;
                } else if (numCarros >= 7 && numCarros <= 8) {
                    verde++;
                } else {
                    azul++;
                }
                x++;
            } else {
                sentinel = false;
            }
        }
        JOptionPane.showMessageDialog(null, "El numero de calcomanias amarillas es: " + amarilla +
                        "\nEl numero de calcomanias rosa es: " + rosa +
                        "\nEl numero de calcomanias roja es: " + roja +
                        "\nEl numero de calcomanias verde es: " + verde +
                        "\nEl numero de calcomanias azul es: " + azul);
        }
    }
