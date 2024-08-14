/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_programacionii;
import javax.swing.JOptionPane;
/**
 *
 * @author dazas
 */
public class Ejercicio2_Encap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int[] num=new int[10];
     for(int i=0;i<10;i++){
     String Num=JOptionPane.showInputDialog(null,"Ingrese 10 numeros enteros entre negativos, positivos.","Datos",JOptionPane.QUESTION_MESSAGE);
     num[i]=Integer.parseInt(Num);
     }
     Numeros_Enteros Data=new Numeros_Enteros();
     String data= Data.Calcular(num);
     String orden=Data.Establecer(num);
     boolean confirmacion=false;
     JOptionPane.showMessageDialog(null, data,"Resultados",JOptionPane.INFORMATION_MESSAGE);
     do{
     String rta=JOptionPane.showInputDialog(null,"¿Deseas conocer cual es la distribucion de los datos?","Confirmacion",JOptionPane.QUESTION_MESSAGE);
     switch(rta){
         case "Si":
             JOptionPane.showMessageDialog(null, orden,"Resultados",JOptionPane.INFORMATION_MESSAGE);
             confirmacion=true;
             break;
         case "si":
             JOptionPane.showMessageDialog(null, orden,"Resultados",JOptionPane.INFORMATION_MESSAGE);
             confirmacion=true;
             break;
         case "No":
             JOptionPane.showMessageDialog(null, orden,"Resultados",JOptionPane.INFORMATION_MESSAGE);
             confirmacion=true;
             break;
         case "no":
             JOptionPane.showMessageDialog(null, orden,"Resultados",JOptionPane.INFORMATION_MESSAGE);
             confirmacion=true;
             break;
         default:
            JOptionPane.showMessageDialog(null,"No se reconoce caracter, intente de nuevo.","ERROR",JOptionPane.ERROR_MESSAGE);
            break;
     }
    }while(false==confirmacion);
     }
}
