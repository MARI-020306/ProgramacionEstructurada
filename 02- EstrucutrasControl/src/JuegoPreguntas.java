import javax.swing.JOptionPane;

public class JuegoPreguntas {
    public static void main(String[] args) {
        // Pregunta 1
        String respuesta1 = JOptionPane.showInputDialog("1. ¿Colón descubrió América? (Si/No)");

        if (respuesta1=="si") {
            // Pregunta 2
            String respuesta2 = JOptionPane.showInputDialog("2. ¿La independencia de México fue en el año 1810? (Si/No)");

            if (respuesta2=="si") {
                // Pregunta 3
                String respuesta3 = JOptionPane.showInputDialog("3. ¿The Doors fue un grupo de rock americano? (Si/No)");

                if (respuesta3=="si") {
                    JOptionPane.showMessageDialog(null, "¡Felicidades! Respondiste correctamente todas las preguntas.");
                } else {
                    JOptionPane.showMessageDialog(null, "Respuesta incorrecta. Fin del juego.");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Respuesta incorrecta. Fin del juego.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Respuesta incorrecta. Fin del juego.");
        }
    }
}