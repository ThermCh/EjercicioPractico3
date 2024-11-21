package ejerciciopractico3;

import javax.swing.JOptionPane;

public class EjercicioPractico3 {
   public static void main(String[] args) {

   
   
       Arreglo arreglo1 = new Arreglo();
       
       arreglo1.llenarArreglo(Integer.parseInt(JOptionPane.showInputDialog("Cuantos productos va a agregar")));
       //arreglo1.mostrarArreglo();
       arreglo1.llenarProductos();
       arreglo1.buscarVentas();
       arreglo1.diaMasVentas();
       arreglo1.mostrarMatrix();
       arreglo1.buscarDia();
   }
    
}
