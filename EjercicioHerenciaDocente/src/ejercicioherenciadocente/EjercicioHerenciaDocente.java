package ejercicioherenciadocente;
import java.util.Scanner;

public class EjercicioHerenciaDocente {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa Tus datos.\n 1.Nombre \n 2.Facultad \n 3.CADI");
        String name=entrada.next();
        String Facu=entrada.next();
        String cadi=entrada.next();
        System.out.println("Bienvenido "+name+" Ingrese su puesto\n 1.  Docente Catedratico\n 2. Docente Titular");
        int a=entrada.nextInt();
        if(a==1){
            System.out.println("ingrese los siguientes datos \n 1.Horas trabajadas\n 2.Valor por Hora");
            int horas=entrada.nextInt();
            double valorHora=entrada.nextDouble();
            DocenteHC1 obj=new DocenteHC1(horas, valorHora, name, Facu, cadi);
            obj.setSueldoMesHoras();
            String data="Sus datos son: \n 1. Nombre: "+name+"\n 2. Docente Catedratico de la Facultad de: "+Facu+"\n 3. Docente del area de: "+cadi+"\n Trabajo "+horas+" a $"+valorHora+"\n Salario de este mes: "+obj.getSueldoMesHoras();
            System.out.println(data);
            
        }else if(a==2){
            System.out.println("ingrese los siguientes datos \n 1.Cantidad de trabajos de grado\n 2.Sueldo Basico Mensual");
            int trab= entrada.nextInt();
            double sueldo=entrada.nextDouble();
           DocenteTCO1 obj=new DocenteTCO1(sueldo, trab, name, Facu, cadi);
          String data="Sus datos son: \n 1. Nombre: "+name+"\n 2. Docente Titular de la Facultad de: "+Facu+"\n 3. Docente del area de: "+cadi+"\n encargado  de "+trab+" trabajos de grado. \n Salario de este mes: "+obj.getSueldoMensual();
            System.out.println(data); 
        }else{
            System.out.println("Ingrese un valor verficable");
        }
    }
    
}
