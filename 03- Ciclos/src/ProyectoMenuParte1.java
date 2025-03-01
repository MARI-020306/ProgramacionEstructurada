import javax.swing.*;
public class ProyectoMenuParte1 {
    public static void main(String[] args) {
        //Declaracion de variables
        String menu = "";
        String opcion = "";
        boolean sentinel= true;

        //Creacion del menu
        menu = "Menu Principal\n" +
                "1) Fruteria (for)\n" +
                "2) Estacion de servicios ( do while)\n" +
                "3) Numeros cuenta regresiva (while)\n" +
                "4) Numeros pares (while)\n" +
                "5) Suma, Producto y Cantidad de N numeros (while)\n" +
                "6) Salir\n" +
                "Elegir una opcion";

        do {
            opcion = JOptionPane.showInputDialog(menu);

            switch (opcion) {
                case "1":
                    //Declaracion de variables
                    int kilos=0,numClientes=0;
                    double precio=0.0,total=0.0,totalFinal=0.0, descuentoA=0.0;

                    //Entrada de datos
                    numClientes=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de clientes que quedan en el local: "));
                    precio= Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio del kilo de la fruta: "));
                    for (int i = 1; i <=numClientes ; i++) { //Inicia for

                        //Inicializacion de variables
                        total=0.0;
                        descuentoA=0.0;
                        kilos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa los kilos de fruta: "));

                        //Condiciones a cumplir
                        if (kilos > 5) {
                            total = precio * kilos;
                            descuentoA = total * .15;
                        } else {
                            total = precio * kilos;
                        }
                        //Cadena de texto y resolucion de operaciones

                        JOptionPane.showMessageDialog(null, "La persona " + i + "compro la cantidad de " + total + " debe pagar $" + (total-descuentoA) + " pesos" +
                                "\nSe aplico un descuento de $" + descuentoA +" pesos " + " por " + kilos + " kilos de fruta comprados");
                        totalFinal=totalFinal + (total-descuentoA);

                    }
                    //Salida de datos
                    JOptionPane.showMessageDialog(null, "Los ingresos de la tienda son $" + totalFinal);
                    break;
                case "2":
                    //Declaracion de variables
                    int dieselVendidos = 0, magnaVendidos = 0, premiumVendidos = 0, tipo=0, litros=0;
                    double totalRecaudado = 0;
                     //Menu para seleccionar el tipo de gasolina
                    tipo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de combustible" +
                            "\n1-Diesel" + "\n2-Magna" + "\n3-Premium" + "\n0 para terminar"));

                    while (tipo != 0) { //Inicia while y pide la cantidad de litros vendidos
                        litros =Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de litros vendidos: "));

                        //Determinar el tipo de combustible y calcular ventas
                        if (tipo == 1) {
                            totalRecaudado += litros * 31;
                            dieselVendidos += litros;
                        } else if (tipo == 2) {
                            totalRecaudado += litros * 24;
                            magnaVendidos += litros;
                        } else if (tipo == 3) {
                            totalRecaudado += litros * 28;
                            premiumVendidos += litros;
                        } else {
                            JOptionPane.showMessageDialog(null, "Tipo de combustible no válido."); //Si la condicion no se cumple envia el mensaje de error
                        }
                        // pedir el tipo de combustible para la siguiente venta.
                        tipo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de combustible" +
                                "\n1-Diesel" + "\n2-Magna" + "\n3-Premium" + "\n0 para terminar"));
                    }

                    String resultado = "Total recaudado: $" + totalRecaudado + "\n"; //Se muestra el total recaudado

                    //Calcular el diesel com mayor ventas
                    int maxVentas = dieselVendidos;
                    if (magnaVendidos > maxVentas) {
                        maxVentas = magnaVendidos;
                    }
                    if (premiumVendidos > maxVentas) {
                        maxVentas = premiumVendidos;
                    }

                    //Calcular el diesel con menor ventas
                    int minVentas = dieselVendidos;
                    if (magnaVendidos < minVentas) {
                        minVentas = magnaVendidos;
                    }
                    if (premiumVendidos < minVentas) {
                        minVentas = premiumVendidos;
                    }

                    //Se agrega al resultado de salida el combustible con mayor venta
                    resultado += "Combustible más vendido: ";
                    if (dieselVendidos == maxVentas) {
                        resultado += "Diesel";
                    } else if (magnaVendidos == maxVentas) {
                        resultado += "Magna";
                    } else {
                        resultado += "Premium";
                    }

                    //Se agrega al resultado de salida el combustible con menor venta
                    resultado += "\nCombustible menos vendido: ";
                    if (dieselVendidos == minVentas) {
                        resultado += "Diesel";
                    } else if (magnaVendidos == minVentas) {
                        resultado += "Magna";
                    } else {
                        resultado += "Premium";
                    }

                    //Salida de resultados
                    JOptionPane.showMessageDialog(null, resultado);

                    break;
                case "3":
                    //Declaracion de variables
                    int num=0;
                    String sucesion="";
                    //Entrada de datos
                    num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numeo: "));
                    while (num>=0) { //Inica while
                        sucesion += num + "\n"; //Cadena de texto que alamcena la sucesion de numeos para poder imprimirla
                        num--; //Decremento en la variable num para realizar la cuneta regresiva
                    } //Termina while

                    //Salida de datos
                    JOptionPane.showMessageDialog(null,  "Sucesion: \n"  + sucesion);

                    break;
                case "4":
                    //Declaracion de variables
                    int contador=1;
                    String sucesionPar="";

                    while (contador<=100){ //Inicia while
                        if (contador%2==0){ //Calcular si el numero es par realizando su division y usando su modulo
                            sucesionPar+=contador + ", "; //Cadena de texto que muestra la sucesion
                        }
                        contador++;
                    } //Cierra while

                    //Salida de datos
                    JOptionPane.showMessageDialog(null,sucesionPar);
                    break;
                case "5":
                    // Declaracion de variables
                    int sumaPares = 0;
                    int multImpares = 1; //1 es el primer numero impar
                    int cantNegativos = 0;

                    // Leer el primer numero
                    int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número: " + "\nO presione (0) para salir"));

                    // Se repite hasta que el numero sea 0
                    while (numero != 0) {
                        if (numero % 2 == 0) {
                            sumaPares += numero; // Sumar si es par
                        } else {
                            multImpares *= numero; // Multiplicar si es impar
                        }

                        if (numero < 0) {
                            cantNegativos++; // Contar si es negativo
                        }

                        // Pedir el siguiente numero
                        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número: " + "\nO presione (0) para salir"));
                    }

                    // Salida de datos
                    JOptionPane.showMessageDialog(null, "Resultados:\n" +
                            "Suma de los números pares: " + sumaPares + "\n" +
                            "Producto de los números impares: " + multImpares + "\n" +
                            "Cantidad de números negativos: " + cantNegativos);
                    break;
                case "6":
                    JOptionPane.showMessageDialog(null, "El programa ha terminado");
                    sentinel = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion NO Valida");

            }
        }while (sentinel);

    }
}
