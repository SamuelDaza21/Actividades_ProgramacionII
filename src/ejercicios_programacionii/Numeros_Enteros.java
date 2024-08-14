/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_programacionii;

/**
 *
 * @author dazas
 */
public class Numeros_Enteros {
        int pos=0;
        int neg=0;
        int cero=0;
        
    public String Calcular(int[]num){
       
        for(int i=0;i<10;i++){
            if(num[i]>0){
                pos++;
            } else if(num[i]<0){
                neg++;
            }else{
                cero++;
            }
        }
      String resultados="Hay "+pos+" numeros positivos. \n"+"Hay "+neg+" numeros Negativos. \n"+"Hay "+cero+" que son cero.";  
      
        return resultados;
    }
    public String Establecer(int[]num){
        int[] npos=new int[pos];
        int[] nneg=new int[neg];
        int[] ncer=new int[cero];
        int indp=0;
        int indn=0;
        int indc=0;
        for(int j=0;j<10;j++){
            if(num[j]>0){
                npos[indp++]=num[j];
            } else if(num[j]<0){
                nneg[indn++]=num[j];
            }else{
                ncer[indc++]=num[j];
            }   
        }
        StringBuilder data=new StringBuilder();
        data.append("Los numeros positivos que diste son: ");
        for(int a=0;a<npos.length;a++){
            data.append(npos[a]).append(", ");
        }
        data.append("\n");
        data.append("Los numeros negativos que diste son: ");
        for(int a=0;a<nneg.length;a++){
            data.append(nneg[a]).append(", ");
        }
    data.append("\n");
    data.append("La cantidad de ceros dados son: ").append(cero);
    return data.toString();
    
}
    
}
