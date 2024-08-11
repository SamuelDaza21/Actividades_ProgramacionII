/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_programacionii;
import javax.swing.*;
/**
 * Programa Java que guarda en un array X (tamaña que desee) números enteros que se
    leen por teclado. A continuación, se recorre el array y calcula cuántos números son
    positivos, cuántos negativos y cuántos ceros, Realizar fase de Análisis de acuerdo a la
    Solución dada.
    Indique otra forma de dar solución al ejercicio
 * @author dazas
 */
public class ejercicio2_programacionii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[]enteros=new int[10];
        for (int j=0; j<10; j++){
            
        String datos=JOptionPane.showInputDialog(null,"Ingrese diez numeros enteros entre negativos (-5) y positivos (8).",JOptionPane.QUESTION_MESSAGE);
        enteros[j]=Integer.parseInt(datos);
        }
        int pos=0;
        int neg=0;
        int cero=0;
        for(int j=0;j<10;j++){
            if (enteros[j]>0){
                pos++;
            }else if(enteros[j]<0){
                neg++;
            }else{
                cero++;
            }
        }
        String contador="resultados.\n"+"Hay "+pos+" números positivos. \n"+"Hay "+neg+" números negativos. \n"+"Hay "+cero+" números que son cero.";
        JOptionPane.showMessageDialog(null, contador);
    }
    
}
