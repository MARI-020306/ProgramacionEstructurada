import javax.swing.*;

public class ProveedorEstereos {
    public static void main(String[] args) {
        double precio=0.0;
        double descuento=0.0;
        double total=0.0;
        double totalIva=0.0;
        double totalFinal=0.0;
        double precioSinIva=0.0;
        String marca="NOSY";

        precio= Double.parseDouble(JOptionPane.showInputDialog("Introducir el precio del estereo: "));
        marca=(JOptionPane.showInputDialog("Introducir el nombre de la marca del estereo "));

         if (precio>= 2000){
             total= precio * 0.10;
             precioSinIva= precio - total;
             totalIva=precioSinIva * 0.16;
             totalFinal=totalIva - total + precio;
         }else{
             precioSinIva= precio - total;
             totalIva=precioSinIva * 0.16;
             totalFinal=totalIva + precio;
         }if (marca=="NOSY"){
             descuento= precio * 0.5;
             totalFinal= precio - descuento;
         }else {
             precioSinIva = precio - total;
             totalIva = precioSinIva * 0.16;
             totalFinal = totalIva + precio;
         }
        System.out.println(totalFinal);
    }
}
