/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresaprogramadores;

/**
 *
 * @author lexas
 */
public class Analista extends Empleado {
 private double SalarioBase, Salario;
 private int CantProy;

    public Analista(double SalarioBase, int CantProy, String Nombre, int CodEmpleado) {
        super(Nombre, CodEmpleado);
        this.SalarioBase = SalarioBase;
        this.CantProy = CantProy;
    }
 
    @Override
    void CalcSalarioMes() {
       double temp=(SalarioBase*CantProy)*0.04;
       Salario=SalarioBase-temp;
    }

    @Override
    public String toString() {
       return " El Analista "+Nombre+"\n Realizo el analisis de "+CantProy+" proyectos\n con un salario Base de $"+SalarioBase+" menos el 4% de retencion"+"\nSu Salario es: $"+Salario;
     }
    
    
}
