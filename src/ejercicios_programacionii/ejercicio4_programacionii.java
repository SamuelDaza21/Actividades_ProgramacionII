/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_programacionii;
import javax.swing.*;

/**
 *Realizar un programa que permita ingresar 10 números en un vector, el programa debe
    informar cuantas veces se ingresó un número determinado. Ejemplo el 5 se ingresó 4
    veces. Además, se debe calcular el promedio.
 * @author dazas
 */
public class ejercicio4_programacionii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String numb, qst;
        int sum = 0,q,cont=0;
        double prom;
        int[]number=new int[10];
        for (int j=0;j<10;j++){
        numb=JOptionPane.showInputDialog(null,"ingrese diez numeros",JOptionPane.QUESTION_MESSAGE);
        number[j]=Integer.parseInt(numb);
        sum+=number[j];
        }
        qst=JOptionPane.showInputDialog(null,"ingrese un numero el cual hayas ingresado recientemente",JOptionPane.QUESTION_MESSAGE);
        q=Integer.parseInt(qst);
        for(int j=0;j<10;j++){
            if (number[j]==q){
                cont++;        
            }
        }
        prom=(double)sum/number.length;
        JOptionPane.showMessageDialog(null,"el numero "+q+" esta repetido "+cont+" veces.\n"+"el promedio de los numeros ingresados es: "+prom,"Resultados",JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
