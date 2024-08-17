/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_programacionii;
import java.util.Scanner;

/**
 *
 * @author dazas
 */
public class Op {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1,n2,Tot_Sum,Tot_Res,Tot_Mul;
        Scanner Input=new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        n1=Input.nextInt();
        n2=Input.nextInt();
        Op_Basicas operacion=new Op_Basicas(n1,n2);
        operacion.Set_Operaciones();
        boolean centinela=false;
        while(centinela==false){
        System.out.println("""
                           Que Operacion deseas realizar.
                           Suma.
                           Resta.
                           Multiplicacion.""");
        String Rta=Input.next();
        switch(Rta){
            case "suma":
                Tot_Sum=operacion.Get_sum();
                System.out.println("El resultado de la suma es: \n"+n1+"+"+n2+"="+Tot_Sum);
                centinela=true;
                break;
            case "resta":
                Tot_Res=operacion.Get_res();
                System.out.println("El resultado de la resta es: \n"+n1+"-"+n2+"="+Tot_Res);
                centinela=true;
                break;
            case "multiplicacion":
                Tot_Mul=operacion.Get_mul();
                System.out.println("El resultado de la multiplicacion es: \n"+n1+"*"+n2+"="+Tot_Mul);
                centinela=true;
                break;
            default:
                System.out.println("No entendi tu peticion, Ingresa de nuevo.");
                break;}}}}
        
           