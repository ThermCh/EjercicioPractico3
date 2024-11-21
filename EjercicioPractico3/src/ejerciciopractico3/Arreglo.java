package ejerciciopractico3;

import javax.swing.JOptionPane;

public class Arreglo {

    private String nombre[];
    private int productos[][];
    private String diaSemana[]= new String [7];
    public int sumaMayor;

    public void llenarDia() {
        diaSemana[0] = "Lunes";
        diaSemana[1] = "Martes";
        diaSemana[2] = "Miercoles";
        diaSemana[3] = "Juevez";
        diaSemana[4] = "Viernes";
        diaSemana[5] = "Sabado";
        diaSemana[6] = "Domingo";

    }

    public void llenarArreglo(int cantidad) {
        nombre = new String[cantidad];
        for (int i = 0; i < cantidad; i++) {
            nombre[i] = JOptionPane.showInputDialog("Cual es el nombre del producto");

        }

    }

    public void mostrarArreglo() {
        String mensaje = "";
        for (int i = 0; i < this.nombre.length; i++) {
            mensaje += nombre[i] + "\n";

        }
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void llenarProductos() {
        productos = new int[7][nombre.length];
        for (int i = 0; i < nombre.length; i++) {
            for (int j = 0; j < 7; j++) {
                productos[j][i] = Integer.parseInt(JOptionPane.showInputDialog("Cuantos productos de: " + nombre[i] + " vendio"));

            }

        }
    }

    public void buscarVentas() {
        int sumaNombre = 0;
        for (int i = 0; i < nombre.length; i++) {
            for (int j = 0; j < 7; j++) {
                sumaNombre += productos[j][i];

            }
            JOptionPane.showMessageDialog(null, "Para el producto: " + nombre[i] + " Se vendieron: " + sumaNombre);
            sumaNombre = 0;

        }

    }

    public void mostrarMatrix() {
        String mensaje = "";
        for (int i = 0; i < this.nombre.length; i++) {
            for (int j = 0; j < 7; j++) {
                mensaje += diaSemana[j] + " El producto: " + nombre[i] + " vendio " + productos[j][i] + "\n";

            }
            mensaje += "*****************************\n";

        }
        JOptionPane.showMessageDialog(null, mensaje);

    }

    public void diaMasVentas() {
        int sumaMayor = 0;
        int sumaArreglo = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < nombre.length; j++) {
                sumaArreglo += productos[i][j];
                if (sumaArreglo > sumaMayor) {
                    sumaMayor = sumaArreglo;
                    sumaArreglo = 0;

                }
            }

        }
        JOptionPane.showMessageDialog(null, sumaMayor);
        this.sumaMayor = sumaMayor;

    }

    public void buscarDia() {
        int sumaArreglo = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < nombre.length; j++) {
                sumaArreglo += productos[i][j];
                if (sumaMayor == sumaArreglo) {
                    JOptionPane.showMessageDialog(null, "El dia es"+ diaSemana[i]);

                }
                sumaArreglo = 0;

            }

        }

    }

}
