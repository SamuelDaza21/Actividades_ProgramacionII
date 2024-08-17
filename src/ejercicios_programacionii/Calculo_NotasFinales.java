/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_programacionii;

/**
 *
 * @author dazas
 */
public class Calculo_NotasFinales {
    double Not_May, Por_Est_Aprob,Prom_Not;
    int Pos_Men_Not;
    double[] Notas= new double[15];
    public Calculo_NotasFinales(double [] Notas){this.Notas=Notas;}
    
    public void Set_May_Not(){Not_May=Notas[0];
    for(int a=0; a<Notas.length;a++){
        if(Notas[a]>Not_May){
            Not_May=Notas[a];}}}
    
    public double Get_Not_May(){return Not_May;}
    
    public void Set_Per_Aprob(){int a=0;
        for(int b=0;b<Notas.length;b++){
            if(Notas[b]>=3.0){a++;}}
        Por_Est_Aprob= (a*100)/Notas.length;}
    
    public double Get_Por_Est_Aprob(){return Por_Est_Aprob;}
    
    public void Set_Prom(){
        for(int c=0;c<Notas.length;c++){Prom_Not+=Notas[c];}
        Prom_Not=Prom_Not/Notas.length;}
    
    public double Get_Prom_Not(){return Prom_Not;}
    
    public void Set_Posi(){double a=Notas[0];Pos_Men_Not=0;
        for(int d=0; d<Notas.length;d++){
            if(Notas[d]<a){a=Notas[d];Pos_Men_Not=d;}}}
    
    public int Get_Pos_Men_Not(){return Pos_Men_Not;}
}
