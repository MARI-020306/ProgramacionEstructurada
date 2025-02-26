import javax.swing.*;

public class ExamenTipoDos {
        public static void main (String[]args){
            String menu = "";
            String opcion = "";
            boolean sentinel = true;

            menu = "Menu Principal\n" +
                    "1) Multiplicar un par de numeros (while)\n" +
                    "2) Suma de numeros pares (while)\n" +
                    "3) Salir\n" +
                    "Elegir una opcion";

            do {
                opcion = JOptionPane.showInputDialog(menu);

                switch (opcion) {
                    case "1":
                        int num1 = 0, num2 = 0;
                        int x=0,suma=0;
                        String resultado="", respuesta="";

                        do {
                            num1=0;
                            num2=0;
                            num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero 1 "));
                            num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero 2  "));
                            if (num1>0 && num2>0) {
                                while (num1>= 1) {

                                    if (num1% 2 != 0) {
                                        suma += num2;
                                    }
                                    num1 /= 2;
                                    num2 *= 2;

                                }

                            resultado = "La suma de los numeros impares es: " + suma;
                            JOptionPane.showMessageDialog(null, resultado );
                            }else{
                                JOptionPane.showMessageDialog(null, "Los numeros deben ser positivos");
                            }
                            respuesta=JOptionPane.showInputDialog("¿Desea salir? ");
                        }while (!respuesta.equalsIgnoreCase("si"));

                        break;
                    case "2":
                        //Declaracion de variables
                        int contador=1, rangoInicio=0, rangoFinal=0, sumatoria=0;
                        String sucesion="", resp="";

                            rangoInicio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el rango de donde se iniciara la sucesion: "));
                            rangoFinal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el rango de donde se terminara la sucesion: "));
                            while (contador <= rangoFinal) {
                                if (rangoFinal > rangoInicio) {
                                    if (contador % 2 == 0) {
                                        sumatoria += contador;
                                    }

                                    contador++;
                                }
                            }
                        JOptionPane.showMessageDialog(null, "La suma de los numeros pares es " + sumatoria);



                    case "3":
                        JOptionPane.showMessageDialog(null, "El programa ha terminado");
                        sentinel = false;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion NO Valida");

                }
            } while (sentinel);
        }
    }
