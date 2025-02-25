import javax.swing.*;

public class AireNeumaticos {
    public static void main(String[] args) {
        int carro=0,x=0;
        double masa=0.0,presion=0.0,volumen=0.0,temperatura=0.0, suma=0.0;
        do {
            carro++;
            presion = Double.parseDouble(JOptionPane.showInputDialog("Escribe la presion: "));
            volumen = Double.parseDouble(JOptionPane.showInputDialog("Escribe el volumen: "));
            temperatura = Double.parseDouble(JOptionPane.showInputDialog("Escribe la temperatura: "));

            masa = (presion * volumen) / (0.37 * (temperatura + 460));
            JOptionPane.showMessageDialog(null, "La masa de aire del vehiculo " + carro + " es: " + String.format("%.3f",masa));
            suma=suma + masa;
           x=Integer.parseInt(JOptionPane.showInputDialog("Para salir presione 1 - Para continuar presione cualquier otro numero "));
        }while (x!=1);
        JOptionPane.showMessageDialog(null, "El promedio de masa de aire es: " + suma/carro);



    }
}
