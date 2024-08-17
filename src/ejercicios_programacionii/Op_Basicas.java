/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_programacionii;

/**
 *
 * @author dazas
 */
public class Op_Basicas {
    private final int n1;
    private final int n2;
    int Tot_Sum,Tot_Res,Tot_Mul;
    
    public Op_Basicas(int n1,int n2){
        this.n1=n1;
        this.n2=n2;
    }
    public void Set_Operaciones(){
        Tot_Sum=n1+n2;
        Tot_Res=n1-n2;
        Tot_Mul=n1*n2;
    }
    public int Get_sum(){
        return Tot_Sum;}
    public int Get_res(){
        return Tot_Res;}
    public int Get_mul(){
        return Tot_Mul;}
}
