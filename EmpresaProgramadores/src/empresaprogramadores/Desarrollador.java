/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresaprogramadores;
/**
 *
 * @author lexas
 */
public class Desarrollador extends Empleado{
 private double SalarioBase, valorLin, salario;
 private int CantLines;

    public Desarrollador(int CantLines, double valorLin, String Nombre, int CodEmpleado) {
        super(Nombre, CodEmpleado);
        this.CantLines = CantLines;
        this.valorLin=valorLin;
    }
    

    @Override
    void CalcSalarioMes() {
        salario=(valorLin*CantLines)*0.05;
        salario=(salario+SalarioBase);
        SalarioBase=valorLin*CantLines;
        
    }
    public String Salario(){
        return " El Desarrollador "+Nombre+"\n Realizo un codigo de "+CantLines+" Lineas \n cobrando $"+valorLin+" mas el 5% poe el uso de POO"+"\nSu Salario es: $"+salario;
    }
    public String SalarioBase(){
        return " El Desarrollador "+Nombre+"\n Realizo un codigo de "+CantLines+" Lineas \n cobrando $"+valorLin+"\nSu Salario es: $"+SalarioBase;
    }
}
