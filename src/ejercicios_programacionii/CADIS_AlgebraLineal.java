/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_programacionii;
 

/**
 *
 * @author dazas
 */
public class CADIS_AlgebraLineal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] Notas= new double[15];
        double Not_May, Por_Est_Aprob,Prom_Not;
        int Pos_Men_Not;
        for(int i=0;i<Notas.length;i++){Notas[i] = Math.round((1.0 + (Math.random() * 4.0)) * 100.0) / 100.0;}
        Calculo_NotasFinales Examen=new Calculo_NotasFinales(Notas);
        Examen.Set_May_Not();
        Examen.Set_Per_Aprob();
        Examen.Set_Prom();
        Examen.Set_Posi();
        Not_May=Examen.Get_Not_May();
        Por_Est_Aprob=Examen.Get_Por_Est_Aprob();
        Prom_Not=Examen.Get_Prom_Not();
        Pos_Men_Not=Examen.Get_Pos_Men_Not();{
        StringBuilder Output=new StringBuilder();
        Output.append("Los Resultados a las notas finales son:\n");
        for(int a=0; a<Notas.length;a++){Output.append(Notas[a]);
        if(a<Notas.length-1){Output.append("\n");}}
        Output.append("\n");
        Output.append("La nota mayor es: ").append(Not_May);
        Output.append("\n");
        Output.append("El Porcentaje de los estudiantes Aprobados es: ").append(Por_Est_Aprob).append("%");
        Output.append("\n");
        Output.append("El Promedio de Notas es: ").append(Prom_Not);
        Output.append("\n");
        Output.append("La Posicion de la nota mas baja es: ").append(Pos_Men_Not);
        
        System.out.println(Output);
        
    }
    }
    
}
