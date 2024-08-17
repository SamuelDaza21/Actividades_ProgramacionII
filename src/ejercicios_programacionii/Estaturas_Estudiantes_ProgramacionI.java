/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_programacionii;

/**
 *
 * @author dazas
 */
public class Estaturas_Estudiantes_ProgramacionI {
    double[] Estaturas= new double[25];
    double Esta_MasAlto, Esta_masBaja;
    public Estaturas_Estudiantes_ProgramacionI(double[] Estaturas){
        this.Estaturas=Estaturas;
    }
    public void Set_MasAlto(){
        Esta_MasAlto=Estaturas[0];
        for(int a=0;a<Estaturas.length;a++){
            if(Estaturas[a]>Esta_MasAlto){
                Esta_MasAlto=Estaturas[a];
            }}}
    public double Get_MasAlto(){
        return Esta_MasAlto;
    }
     public void Set_masBaja(){
        Esta_masBaja=Estaturas[0];
        for(int b=0;b<Estaturas.length;b++){
            if(Estaturas[b]<Esta_masBaja){
                Esta_masBaja=Estaturas[b];
            }}}
    
    public double Get_masBaja(){
        return Esta_masBaja;
    }
}
