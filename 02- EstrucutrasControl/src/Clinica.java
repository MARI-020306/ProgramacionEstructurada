import javax.swing.*;

public class Clinica {
    public static void main(String[] args) {

        //Declaracion de variables
        double edad = 0.0;
        double nivHem = 0.0;
        String sexo = "";

        //Entrada de datos
        edad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la edad del paciente: "));
        nivHem = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nivel de hemoglobina que registro el paciente: "));
        sexo = JOptionPane.showInputDialog("Ingrese el sexo del paciente");

        //Condiciones a cumplir (ciclo anidado)
        if (edad >=0.0) {
            if (edad >=0.0 && edad == 0.1) { //Evaluar edad
                if (nivHem >= 13.0 && nivHem <= 26.0) { //Evaluar niver de hemoglobina
                    JOptionPane.showMessageDialog(null, "El paciente es negativo a la anemia");
                } else {
                    JOptionPane.showMessageDialog(null, "El paciente es positivo a la anemia");
                }
            if (edad > 0.1 && edad <= 0.6) { //Evaluar edad
                    if (nivHem >= 10.0 && nivHem <= 18.0) {//Evaluar niver de hemoglobina
                        JOptionPane.showMessageDialog(null, "El paciente es negativo a la anemia");
                    } else {
                        JOptionPane.showMessageDialog(null, "El paciente es positivo a la anemia");
                    }
            if (edad > 0.6 && edad <= 1.0) { //Evaluar edad
                if (nivHem >= 11.0 && nivHem <= 15.0) { //Evaluar niver de hemoglobina
                    JOptionPane.showMessageDialog(null, "El paciente es negativo a la anemia");
                } else {
                    JOptionPane.showMessageDialog(null, "El paciente es positivo a la anemia");
                }
            if (edad > 1.0 && edad <= 5.0) { //Evaluar edad
                if (nivHem >= 11.5 && nivHem <= 15.0) { //Evaluar niver de hemoglobina
                    JOptionPane.showMessageDialog(null, "El paciente es negativo a la anemia");
                } else {
                    JOptionPane.showMessageDialog(null, "El paciente es positivo a la anemia");
                }
            if (edad > 5.0 && edad <= 10.0) { //Evaluar edad
                if (nivHem >= 12.6 && nivHem <= 15.5) { //Evaluar niver de hemoglobina
                    JOptionPane.showMessageDialog(null, "El paciente es negativo a la anemia");
                } else {
                    JOptionPane.showMessageDialog(null, "El paciente es positivo a la anemia");
                }
            if (edad > 10.0 && edad <=15.0) { //Evaluar edad
                if (nivHem >= 13.0 && nivHem <= 15.5) { //Evaluar niver de hemoglobina
                    JOptionPane.showMessageDialog(null, "El paciente es negativo a la anemia");
                } else {
                    JOptionPane.showMessageDialog(null, "El paciente es positivo a la anemia");
                }
            if (edad>15.0) { //Evaluar edad
                if (sexo.equalsIgnoreCase("M")) { //Evaluar sexo
                if (nivHem >= 12.0 && nivHem <= 16.0) { //Evaluar niver de hemoglobina
                    JOptionPane.showMessageDialog(null, "El paciente es negativo a la anemia");
                } else {
                    JOptionPane.showMessageDialog(null, "El paciente es positivo a la anemia");
                }
            if (edad>15.0) { //Evaluar edad
                if (sexo.equalsIgnoreCase("F")) { //Evaluar sexo
                if (nivHem >= 14.0 && nivHem <= 18.0) { //Evaluar niver de hemoglobina
                    JOptionPane.showMessageDialog(null, "El paciente es negativo a la anemia");
                } else {
                    JOptionPane.showMessageDialog(null, "El paciente es positivo a la anemia");
                }

                }
            }
                }
            }
            }
            }
            }
            }
        } else {
                //Salida de datos
                JOptionPane.showMessageDialog(null, "Proceso no valido");
                }
            }
        }
    }
}
