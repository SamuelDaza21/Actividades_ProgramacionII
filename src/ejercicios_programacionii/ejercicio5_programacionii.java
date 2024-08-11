/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_programacionii;
import javax.swing.*;

/**
 *En un vector multidimensional de 5 filas(alumnos)y 4 columnas(notas) se guardan las
notas de 5 alumnos de programación con su respectivo promedio. En las tres primeras
posiciones van las notas y en la última posición va el promedio de cada uno. Finalizado
los cálculos se debe mostrar las notas por fila y el promedio correspondiente.

 * @author dazas
 */
public class ejercicio5_programacionii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int filas = 5, columnas = 4;
        double sum;
        String notas;
        double[][] matriz = new double[filas][columnas];
        for (int a = 0; a < filas; a++) {
            sum = 0; 
            for (int b = 0; b < columnas - 1; b++) {
                notas = JOptionPane.showInputDialog(null, "Ingrese el valor para la posición [" + a + "][" + b + "]:");
                matriz[a][b] = Double.parseDouble(notas);  
                sum += matriz[a][b];
            }
            matriz[a][columnas - 1] = sum / (columnas - 1);
        }
        StringBuilder definitivas=new StringBuilder("Las notas y promedio son:\n");
        for(int c=0;c<filas;c++){
            for(int d=0;d<columnas;d++){
                definitivas.append(String.format("%.1f",matriz[c][d])).append(" ");

            }
            definitivas.append("\n");
        }
        JOptionPane.showMessageDialog(null, definitivas.toString(), "Notas", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
