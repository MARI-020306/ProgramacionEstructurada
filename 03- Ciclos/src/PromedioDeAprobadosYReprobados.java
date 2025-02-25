import javax.swing.*;

public class PromedioDeAprobadosYReprobados {
    public static void main(String[] args) {
        boolean sentinel= true;
        double calif= 0.0;
        int numAprobados=0;
        int numReprobados=0;
        double promedioA=0.0, promR=0.0;

        JOptionPane.showMessageDialog(null, "Este programa cuenta el numero de calificaciones" + " aprobatorias y reprobatorias" + "\nPara terminar introduce una calificacion con -1");
        int x=1;
        while (sentinel){
            calif= Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion " + x));

            if (calif!=-1) {
                if (calif >= 7.0) {
                    numAprobados++;
                    promedioA=(numAprobados/calif) * 100;
                } else {
                    numReprobados++;
                    promR=(numReprobados/calif) * 100;
                }
            }else{
                sentinel=false;
            }
            x++;
        }
        JOptionPane.showMessageDialog(null, "El porcentaje de aprobados: " + promedioA + " %" + "\nEl porcentaje de reprobados es: " + promR + " %");
    }
}
