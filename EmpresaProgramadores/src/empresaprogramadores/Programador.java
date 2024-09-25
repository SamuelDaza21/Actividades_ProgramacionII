/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresaprogramadores;

/**
 *
 * @author lexas
 */
public class Programador extends Empleado{
 private double SalarioBase;

    public Programador(double SalarioBase, String Nombre, int CodEmpleado) {
        super(Nombre, CodEmpleado);
        this.SalarioBase=SalarioBase;
    }
 

    @Override
    void CalcSalarioMes() {
     SalarioBase=SalarioBase*1;   
    }

    @Override
    public String toString() {
       return " El Programador "+Nombre+"\n tiene un salario fijo de $"+SalarioBase;
     }
    
}
