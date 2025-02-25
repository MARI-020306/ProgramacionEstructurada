import javax.swing.*;

public class DeMilACero {
    public static void main(String[] args) {
        int x=0;
        String sucesion="";
        x=1000;
        while (x>=0) {
            sucesion += x + "\n";
            x--;
        }
        JOptionPane.showMessageDialog(null,  "Sucesion: \n"  + sucesion);
    }
}
