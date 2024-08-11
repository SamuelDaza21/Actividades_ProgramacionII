/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_programacionii;
import javax.swing.*;
/**
 *La Registraduría Nacional del Estado Civil desea que le construya un programa que
    permita solicitar el año de nacimiento de cada persona y determine si esta persona es
    apta para votar o no. Sugerencia: Cuando ya no desee ingresar más datos se debe digitar
    un valor centinela (buscar un valor apropiado
 * @author dazas
 */
public class ejercicio3_programacionii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name,a,Año,b;
        int año,edad;
        boolean ciclo=false;
        do{
        name=JOptionPane.showInputDialog(null,"Bienvenido a la plataforma de \n"+"La Registraduría Nacional del Estado Civil \n"+"Ingresa tu nombre","Registraduria Nacional del Estado Civil",JOptionPane.QUESTION_MESSAGE);
        a=JOptionPane.showInputDialog(null,name+" Estas a punto de ingresar datos personales, ¿estas seguro que deseas continuar?","Registraduria Nacional del Estado Civil", JOptionPane.QUESTION_MESSAGE);
        switch(a){
            case "si":
                Año=JOptionPane.showInputDialog(null,"Ingresa tu año de nacimiento","Registraduria Nacional del Estado Civil",JOptionPane.QUESTION_MESSAGE);
                año=Integer.parseInt(Año);
                edad=2024-año;
                if (edad<18){
                    JOptionPane.showMessageDialog(null,name+" La Registraduría Nacional del Estado Civil \n"+"No admite que los menores de edad participen del derecho al voto.\n"+" Tu edad es: "+ edad+" años.\n" +" recuerda que debes ser mayo a 18 años","Registraduria Nacional del Estado Civil",JOptionPane.INFORMATION_MESSAGE);
                   boolean conf=false;
                   do{
                    b=JOptionPane.showInputDialog(null,"¿deseas ingresar nuevamente?---si---no---(en minusculas)","Registraduria Nacional del Estado Civil",JOptionPane.QUESTION_MESSAGE);
                    if("si".equals(b)){
                        ciclo=false;
                        conf=true;
                    }else if("no".equals(b)){
                        ciclo=true;
                        conf=true;
                    }else{
                        JOptionPane.showMessageDialog(null, "Opción no válida","Error", JOptionPane.ERROR_MESSAGE);
                    }   
                   }while(conf==false);
                    
                }else{
                    JOptionPane.showMessageDialog(null, name+" La Registraduría Nacional del Estado Civil \n"+"Ha verificado que estas en posicion de votar y ejercer tu derecho \n"+"En las proximas Elecciones.","Registraduria Nacional del Estado Civil",JOptionPane.INFORMATION_MESSAGE);
                     boolean conf=false;
                   do{
                    b=JOptionPane.showInputDialog(null,"¿deseas ingresar nuevamente?---si---no---(en minusculas)","Registraduria Nacional del Estado Civil",JOptionPane.QUESTION_MESSAGE);
                    if("si".equals(b)){
                        ciclo=false;
                        conf=true;
                    }else if("no".equals(b)){
                        ciclo=true;
                        conf=true;
                    }else{
                        JOptionPane.showMessageDialog(null, "Opción no válida","Error", JOptionPane.ERROR_MESSAGE);
                    }   
                   }while(conf==false);
                }
                break;
                case "Si":
                 Año=JOptionPane.showInputDialog(null,"Ingresa tu año de nacimiento","Registraduria Nacional del Estado Civil",JOptionPane.QUESTION_MESSAGE);
                año=Integer.parseInt(Año);
                edad=2024-año;
                if (edad<18){
                    JOptionPane.showMessageDialog(null,name+" La Registraduría Nacional del Estado Civil \n"+"No admite que los menores de edad participen del derecho al voto.\n"+" Tu edad es: "+ edad+" años.\n" +" recuerda que debes ser mayo a 18 años","Registraduria Nacional del Estado Civil",JOptionPane.INFORMATION_MESSAGE);
                   boolean conf=false;
                   do{
                    b=JOptionPane.showInputDialog(null,"¿deseas ingresar nuevamente?---si---no---(en minusculas)","Registraduria Nacional del Estado Civil",JOptionPane.QUESTION_MESSAGE);
                    if("si".equals(b)){
                        ciclo=false;
                        conf=true;
                    }else if("no".equals(b)){
                        ciclo=true;
                        conf=true;
                    }else{
                        JOptionPane.showMessageDialog(null, "Opción no válida","Error", JOptionPane.ERROR_MESSAGE);
                    }   
                   }while(conf==false);
                    
                }else{
                    JOptionPane.showMessageDialog(null, name+" La Registraduría Nacional del Estado Civil \n"+"Ha verificado que estas en posicion de votar y ejercer tu derecho \n"+"En las proximas Elecciones.","Registraduria Nacional del Estado Civil",JOptionPane.INFORMATION_MESSAGE);
                     boolean conf=false;
                   do{
                    b=JOptionPane.showInputDialog(null,"¿deseas ingresar nuevamente?---si---no---(en minusculas)","Registraduria Nacional del Estado Civil",JOptionPane.QUESTION_MESSAGE);
                    if("si".equals(b)){
                        ciclo=false;
                        conf=true;
                    }else if("no".equals(b)){
                        ciclo=true;
                        conf=true;
                    }else{
                        JOptionPane.showMessageDialog(null, "Opción no válida","Error", JOptionPane.ERROR_MESSAGE);
                    }   
                   }while(conf==false);
                }
                break;
                case "sI":
                 Año=JOptionPane.showInputDialog(null,"Ingresa tu año de nacimiento","Registraduria Nacional del Estado Civil",JOptionPane.QUESTION_MESSAGE);
                año=Integer.parseInt(Año);
                edad=2024-año;
                if (edad<18){
                    JOptionPane.showMessageDialog(null,name+" La Registraduría Nacional del Estado Civil \n"+"No admite que los menores de edad participen del derecho al voto.\n"+" Tu edad es: "+ edad+" años.\n" +" recuerda que debes ser mayo a 18 años","Registraduria Nacional del Estado Civil",JOptionPane.INFORMATION_MESSAGE);
                   boolean conf=false;
                   do{
                    b=JOptionPane.showInputDialog(null,"¿deseas ingresar nuevamente?---si---no---(en minusculas)","Registraduria Nacioanl del Estado Civil",JOptionPane.QUESTION_MESSAGE);
                    if("si".equals(b)){
                        ciclo=false;
                        conf=true;
                    }else if("no".equals(b)){
                        ciclo=true;
                        conf=true;
                    }else{
                        JOptionPane.showMessageDialog(null, "Opción no válida","Error", JOptionPane.ERROR_MESSAGE);
                    }   
                   }while(conf==false);
                    
                }else{
                    JOptionPane.showMessageDialog(null, name+" La Registraduría Nacional del Estado Civil \n"+"Ha verificado que estas en posicion de votar y ejercer tu derecho \n"+"En las proximas Elecciones.","Registraduria Nacional del Estado Civil",JOptionPane.INFORMATION_MESSAGE);
                     boolean conf=false;
                   do{
                    b=JOptionPane.showInputDialog(null,"¿deseas ingresar nuevamente?---si---no---(en minusculas)","Registraduria Nacional del Estado Civil",JOptionPane.QUESTION_MESSAGE);
                    if("si".equals(b)){
                        ciclo=false;
                        conf=true;
                    }else if("no".equals(b)){
                        ciclo=true;
                        conf=true;
                    }else{
                        JOptionPane.showMessageDialog(null, "Opción no válida","Error", JOptionPane.ERROR_MESSAGE);
                    }   
                   }while(conf==false);
                }
                break;
                case "SI":
                Año=JOptionPane.showInputDialog(null,"Ingresa tu año de nacimiento","Registraduria Nacional del Estado Civil",JOptionPane.QUESTION_MESSAGE);
                año=Integer.parseInt(Año);
                edad=2024-año;
                if (edad<18){
                    JOptionPane.showMessageDialog(null,name+" La Registraduría Nacional del Estado Civil \n"+"No admite que los menores de edad participen del derecho al voto.\n"+" Tu edad es: "+ edad+" años.\n" +" recuerda que debes ser mayo a 18 años","Registraduria Nacional del Estado Civil",JOptionPane.INFORMATION_MESSAGE);
                   boolean conf=false;
                   do{
                    b=JOptionPane.showInputDialog(null,"¿deseas ingresar nuevamente?---si---no---(en minusculas)","Registraduria Nacional del Estado Civil",JOptionPane.QUESTION_MESSAGE);
                    if("si".equals(b)){
                        ciclo=false;
                        conf=true;
                    }else if("no".equals(b)){
                        ciclo=true;
                        conf=true;
                    }else{
                        JOptionPane.showMessageDialog(null, "Opción no válida","Error", JOptionPane.ERROR_MESSAGE);
                    }   
                   }while(conf==false);
                    
                }else{
                    JOptionPane.showMessageDialog(null, name+" La Registraduría Nacional del Estado Civil \n"+"Ha verificado que estas en posicion de votar y ejercer tu derecho \n"+"En las proximas Elecciones.","Registraduria Nacional del Estado Civil",JOptionPane.INFORMATION_MESSAGE);
                     boolean conf=false;
                   do{
                    b=JOptionPane.showInputDialog(null,"¿deseas ingresar nuevamente?---si---no---(en minusculas)","Registraduria Nacional del Estado Civil",JOptionPane.QUESTION_MESSAGE);
                    if("si".equals(b)){
                        ciclo=false;
                        conf=true;
                    }else if("no".equals(b)){
                        ciclo=true;
                        conf=true;
                    }else{
                        JOptionPane.showMessageDialog(null, "Opción no válida","Error", JOptionPane.ERROR_MESSAGE);
                    }   
                   }while(conf==false);
                }
                break;
                case "no":
                    ciclo=true;
                break;
                case "NO":
                ciclo=true;
                break;
                case "nO":
                ciclo=true;
                break;
                case "No":
                ciclo=true;
                break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida","Error", JOptionPane.ERROR_MESSAGE);
                    break;
        }
        }while(ciclo==false);
    }
}