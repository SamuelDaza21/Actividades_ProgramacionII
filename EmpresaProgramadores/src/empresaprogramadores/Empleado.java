/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresaprogramadores;

/**
 *
 * @author lexas
 */
abstract class Empleado {
    protected String Nombre;
    protected int CodEmpleado;
    abstract void CalcSalarioMes();

    public Empleado(String Nombre, int CodEmpleado) {
        this.Nombre = Nombre;
        this.CodEmpleado = CodEmpleado;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCodEmpleado(int CodEmpleado) {
        this.CodEmpleado = CodEmpleado;
    }
    public String getNombre() {
        return Nombre;
    }
       public int getCodEmpleado() {
        return CodEmpleado;
    }
            
}
