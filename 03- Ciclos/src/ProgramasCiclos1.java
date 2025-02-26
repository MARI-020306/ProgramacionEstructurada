import javax.swing.*;

public class ProgramasCiclos1 {
    public static void main(String[] args) {
        //Declaracion de variables
        String menu = "";
        String opcion = "";
        boolean sentinel= true;

        //Creacion del menu
         menu = "Menu Principal\n" +
                "1) Promedio Calificaciones (for)\n" +
                "2) Vendedores (while)\n" +
                "3) Tienda (do while)\n" +
                "4) Salir\n" +
                "Elegir una opcion";

         do {
             opcion = JOptionPane.showInputDialog(menu);

             switch (opcion) {
                 case "1":
                     //Declaracion de variables
                     int numCalif=0;
                     double calif=0.0;
                     double promedio=0.0;
                     //Solicitar el numero de calificaciones
                     numCalif=Integer.parseInt(JOptionPane.showInputDialog("Introducel numero de calificaciones: "));
                     for (int i = 1; i <=numCalif; i++) {
                         //Solicitar calificacion
                         calif=Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion " + i));
                         //Acumular calificaciones
                         promedio+=calif;
                     }
                     //Calcular promedio y salida de datos
                     promedio/=numCalif;
                     JOptionPane.showMessageDialog(null, "El promedio del alumno es: " + promedio);
                     break;
                 case "2":
                     //Declaracion de variables
                     String nombre="";
                     String salida="";
                     int numVendedores=0;
                     double sueldoBase=0.0;
                     double comision=0.0;
                     double sueldoTotal=0.0;
                     double v1=0.0, v2=0.0, v3=0.0;

                     //Entrada de datos
                     numVendedores=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de vendedores: "));
                     sueldoBase=Double.parseDouble(JOptionPane.showInputDialog("Introduce el sueldo base"));

                     //Manera en la que se imprimira la salida
                     salida="Nombre       Comision        Sueldo total\n";

                     int i=1;
                     while(i<=numVendedores){ //Inicia while
                         //Entrada de datos del vendedor
                        nombre=JOptionPane.showInputDialog("Introduce el nombre del vendedor " + i);
                        v1=Double.parseDouble(JOptionPane.showInputDialog("Introduce la venta 1"));
                        v2=Double.parseDouble(JOptionPane.showInputDialog("Introduce la venta 2"));
                        v3=Double.parseDouble(JOptionPane.showInputDialog("Introduce la venta 3"));

                        comision= (v1+v2+v3) * 0.10; //Resolucion de operaciones

                        sueldoTotal= sueldoBase + comision; //Calculo de sueldo total

                        salida+= nombre + "                 "+ comision + "                 " + sueldoTotal + "\n";
                        i++;
                     }
                     //Salida de datos
                     JOptionPane.showMessageDialog(null, salida);
                     break;
                 case "3":
                      //Tienda de bolitas
                     //Declaracion de variables
                     String respuesta="", resultado="";
                     String tipoBolita="";
                     boolean sentinel2= true;
                     double totalCompra=0.0;
                     double descuento=0.0, importe=0.0, total=0.0;
                     //Menu interactivo
                     String menuBolitas= "Tombola\n" +
                             "a) Bolita Roja\n" +
                             "b) Bolita Amarilla\n" +
                             "c) Bolita Blanca\n" +
                             "Elegir Opcion";
                     //Manera en que se vera la impresion final
                     resultado="Total de ventas\n" +
                             "Total a pagar                     " + "Descuento                  " + "Importe     s       \n";
                     do { //Abre do while
                         //Entrada de datos
                         totalCompra = Double.parseDouble(JOptionPane.showInputDialog("Introduce el total de la compra"));
                         tipoBolita = JOptionPane.showInputDialog(menuBolitas);

                         //Condiciones a cumplir para conocer el descuento
                       if (tipoBolita.equalsIgnoreCase("a" )|| tipoBolita.equalsIgnoreCase("b") || tipoBolita.equalsIgnoreCase("c")) {
                           if (tipoBolita.equalsIgnoreCase("a")) {
                               descuento = totalCompra * 0.40;
                           } else if (tipoBolita.equalsIgnoreCase("b")) {
                               descuento = totalCompra * 0.25;
                           } else {
                               descuento = 0.0;
                           }

                           //Realizacion de operaciones
                           importe= totalCompra-descuento;
                           total+=importe;

                           resultado+=totalCompra + "            " + descuento + "                 " + importe + "\n";

                       }else{ //Validacion de datos permitidos
                           JOptionPane.showMessageDialog(null,"Bolita NO valida");
                       }
                       //Preguntar si el usuario desea salir o continuar comprando
                       salida=JOptionPane.showInputDialog(null, "Deseas cerrar la caja si/no");
                       if (salida.equalsIgnoreCase("si")){
                           sentinel2=false;
                       }
                     }while (sentinel2);

                     resultado+="Total: " + total; //Calculo de la compra

                     //Salida de datos
                     JOptionPane.showMessageDialog(null, resultado);
                     break;
                 case "4":
                     JOptionPane.showMessageDialog(null, "El programa ha terminado");
                     sentinel = false;
                     break;
                 default:
                     JOptionPane.showMessageDialog(null, "Opcion NO Valida");

             }
         }while (sentinel);

    }
}
