import javax.swing.*;

public class ProyectoMenuParte2 {
    public static void main(String[] args) {
        // Declaración de variables
        String menu = "";
        String opcion = "";
        boolean sentinel = true;

        // Creación del menú
        menu = "Menu Principal\n" +
                "6) Conversion de unidades (do while)\n" +
                "7) Cajero automatico (while)\n" +
                "8) Factorial de un numero (while)\n" +
                "9) Primeros 7 numeros primos (for)\n" +
                "10) Tabla de multiplicar (for)\n" +
                "11) Salir\n" +
                "Elegir una opcion";

        do {
            opcion = JOptionPane.showInputDialog(menu);

            switch (opcion) {
                case "6":
                    // Declaración de variables a convertir
                    double numero1 = 0.0;
                    int medida = 0;
                    double respuestaYardas = 0.0;
                    double respuestaPulgada = 0.0;
                    double respuestaLibras = 0.0;

                    do {
                        // Menú de inicio
                        medida = Integer.parseInt(JOptionPane.showInputDialog("Elegir un número de acuerdo a la acción que desea realizar: " +
                                "\n1 = Centimetros a Pulgadas" +
                                "\n2 = Kilogramos a Libras" +
                                "\n3 = Pies a Yardas" +
                                "\n4= Para volver al menu principal"));

                        if (medida > 0 && medida < 4) {
                            // Solicitar al usuario el número a calcular
                            numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el número que desea convertir:"));

                            if (numero1 > 0) {
                                // Condiciones a cumplir
                                if (medida == 1) {
                                    respuestaPulgada = numero1 * 0.3937;
                                    JOptionPane.showMessageDialog(null, numero1 + ": en Pulgadas es: " + String.format("%.2f", respuestaPulgada));
                                } else if (medida == 2) {
                                    respuestaLibras = numero1 * 2.2046;
                                    JOptionPane.showMessageDialog(null, numero1 + ": en Libras es: " + String.format("%.2f", respuestaLibras));
                                } else if (medida == 3) {
                                    respuestaYardas = numero1 / 3;
                                    JOptionPane.showMessageDialog(null, numero1 + ": en Yardas es: " + String.format("%.2f", respuestaYardas));
                                } else {
                                    JOptionPane.showMessageDialog(null, "Escribir un número válido");
                                }
                            }
                        }
                    } while (medida != 4); // Repetir hasta que la condicion se cumpla
                    break;

                case "7":
                    //Declaracion de variables
                    double saldo=0.0, cantidad=0.0, retiro=0.0, transferencia=0.0;
                    int movimiento=0, numCuenta=0;
                    // Menú de inicio
                    movimiento = Integer.parseInt(JOptionPane.showInputDialog("Elegir un número de acuerdo a la acción que desea realizar: " +
                            "\n1 = Consultar Saldo" +
                            "\n2 = Depositar a su cuenta" +
                            "\n3 = Retirar" +
                            "\n4= Transferir" +
                            "\n5= Para volver al menu principal"));
                    while (movimiento !=5){
                        if (movimiento==1){
                            saldo=saldo;
                            JOptionPane.showMessageDialog(null, "Su saldo actual es: " + "\n" + "$" + saldo);
                        } else if (movimiento==2) {
                            cantidad=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad que depositara a su cuenta: "));
                            if (cantidad<0){
                                JOptionPane.showMessageDialog(null, "¡ERROR! Cantidad no valida");
                            }else {
                                saldo = cantidad + saldo;
                                JOptionPane.showMessageDialog(null, "Su nuevo saldo es de: " + saldo);
                            }
                        } else if (movimiento==3) {
                            retiro=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad que desea retirar: "));
                            if (retiro<0) {
                                JOptionPane.showMessageDialog(null, "¡ERROR! Cantidad no valida");
                            }else{
                                saldo=saldo-retiro;
                                JOptionPane.showMessageDialog(null, "¡Operacion Exitosa!" + "\nSu nuevo saldo es de: $" + saldo);
                            }
                        } else if (movimiento==4) {
                            numCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cuenta: "));
                            if (numCuenta < 0) {
                                JOptionPane.showMessageDialog(null, "¡ERROR! Numero de cuenta no valido");
                            } else {
                                transferencia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad que desea transfererir: "));
                                saldo=saldo-transferencia;
                                JOptionPane.showMessageDialog(null, "¡Operacion Exitosa!" + "\nSu nuevo saldo es de: $" + saldo);
                            }
                        }
                        movimiento = Integer.parseInt(JOptionPane.showInputDialog("Elegir un número de acuerdo a la acción que desea realizar: " +
                                "\n1 = Consultar Saldo" +
                                "\n2 = Depositar a su cuenta" +
                                "\n3 = Retirar" +
                                "\n4= Transferir" +
                                "\n5= Para volver al menu principal"));
                    }
                    break;
                case "8":
                    //Declaracion de variables
                    int factorial=0,x=0,numero=0;
                    String fact="";

                    //Entrada de datos
                    numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

                    //Condiciones a cumplir
                    if (numero<0){
                        JOptionPane.showMessageDialog(null, "El numero no se puede calcular");
                    }else{
                        x=1;
                        factorial=1;
                        while (x<=numero){
                            fact+=x + " x " + " "; //Cadena de salida de texto
                            factorial=factorial*x; //Calculo de factorial
                            x++;
                        }
                        //Salida de datos
                        JOptionPane.showMessageDialog(null, fact + "\nEl factorial del numero " + numero +
                                " = " + factorial);
                    }
                    break;
                case "9":
                    //Declaracion de variables
                    int num = 2, contadorPrimos = 0;

                    String resultado = "Los primeros 7 números primos son:\n";

                    while (contadorPrimos < 7) { //Inicia while
                        int divisores = 0;

                        for (int i = 1; i <= num; i++) { //se cuentan los divisores del número actual
                            if (num % i == 0) {
                                divisores++;
                            }
                        }

                        if (divisores == 2) { // Si solo tiene 2 divisores 1 y el mismo es primo
                            resultado += num + " ";
                            contadorPrimos++;
                        }

                        num++; // Pasar al siguiente número
                    }
                    //Salida de datos
                    JOptionPane.showMessageDialog(null, resultado);
                    break;
                case "10":
                    //Declaracion de variables
                    int numeroM=0;
                    int operacion=0;
                    String resultadoMulti="";

                    //Solicitar el numero a multiplicar
                    numeroM=Integer.parseInt(JOptionPane.showInputDialog("Introducel numero del que deseas conocer la tabla de multiplicar: "));
                    for (int i = 1; i <=10 ; i++) { //Inica for
                        operacion= numeroM * i; //Creacion de la tabla
                        resultadoMulti+= i + " x " + numeroM +  " = " + operacion + "\n"; //Cadena de texto que mostrara la tabla del numero introducedo y su resultado
                    }
                    //Salida de datos
                    JOptionPane.showMessageDialog(null, "TABLA DEL " + numeroM +
                            "\n" + resultadoMulti);
                    break;
                case "11":
                    JOptionPane.showMessageDialog(null, "El programa ha terminado");
                    sentinel = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción NO Válida");
            }
        } while (sentinel);
    }
}



