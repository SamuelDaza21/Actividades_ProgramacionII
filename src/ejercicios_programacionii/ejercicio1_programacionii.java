/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_programacionii;
import javax.swing.*;
/**
 *Crear un programa que solicite un número y con ese número(multiplicador) realice la
  tabla de multiplicar, debe imprimir el resultado de la multiplicación mostrando el
  multiplicando, el multiplicador y el resultado
 * @author Samuel Arturo Daza Criado
 */
public class ejercicio1_programacionii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Multiplicador;
        Multiplicador=JOptionPane.showInputDialog(null,"¿Que tabla de multiplicar desea conocer?",JOptionPane.QUESTION_MESSAGE);
        int a=Integer.parseInt(Multiplicador);
        int[]Rta = new int[11];
        for (int i=0; i<=10; i++){
            Rta[i]=a*i;
        }
        JOptionPane.showMessageDialog(null,"La tabla de multiplicar del "+a+" es:\n" +a+"*0="+ Rta[0]+"\n" +a+"*1="+ Rta[1]+"\n" +a+"*2="+ Rta[2]+"\n" +a+"*3="+ Rta[3]+"\n" +a+"*4="+ Rta[4]+"\n" +a+"*5="+ Rta[5]+"\n" +a+"*6="+ Rta[6]+"\n" +a+"*7="+ Rta[7]+"\n" +a+"*8="+ Rta[8]+"\n" +a+"*9="+ Rta[9]+"\n" +a+"*10="+ Rta[10],"Tabla de multiplicar del "+a,JOptionPane.INFORMATION_MESSAGE);
    }
    
}
