/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_programacionii;

/**
 *
 * @author dazas
 */
public class Estudiantes_ProgramacionI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double[] Estaturas= new double[25];
    double Esta_MasAlto, Esta_masBaja;
    for(int i=0;i<Estaturas.length;i++){
    Estaturas[i] = Math.round((1.50 + (Math.random() * (1.90-1.50))) * 100.0) / 100.0;}
    
    Estaturas_Estudiantes_ProgramacionI Estudiantes= new Estaturas_Estudiantes_ProgramacionI(Estaturas);
    Estudiantes.Set_MasAlto();
    Estudiantes.Set_masBaja();
    
    Esta_MasAlto=Estudiantes.Get_MasAlto();
    Esta_masBaja=Estudiantes.Get_masBaja();
    
    StringBuilder Output=new StringBuilder();
    Output.append("Las estaturas de los alumnos de Programacion I son:");
    Output.append("\n");
    for(int a=0; a<Estaturas.length;a++){Output.append(Estaturas[a]);
        if(a<Estaturas.length){Output.append("m \n");}}
        Output.append("\n");
        Output.append("La Estatura mayor es: ").append(Esta_MasAlto).append("m");
        Output.append("\n");
        Output.append("La Estatura menor es: ").append(Esta_masBaja).append("m");
          
        System.out.println(Output);
    }}
 