package ejerciciopolimorfismo;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejerciciopolimorfismo {
    public static void main(String[] args) {
        //instancia datos para las entradas
        Scanner entrada = new Scanner(System.in);
        ArrayList<Docente> docentes = new ArrayList<>();
        boolean continuar = true;
        double salarioTotal = 0; 

        do {
            // Solicitar datos del usuario
            System.out.println("Ingresa Tus datos.\n 1. Nombre ");
            String name = entrada.nextLine();  
            System.out.println("2. Facultad");
            String facu = entrada.nextLine();
            System.out.println("3. CADI");
            String cadi = entrada.nextLine();

            System.out.println("Bienvenido " + name + ". Ingrese su puesto\n 1. Docente Catedrático\n 2. Docente Titular");
            int a = entrada.nextInt();

            Docente docente;

            if (a == 1) {
                // Docente de Cátedra
                System.out.println("Ingrese los siguientes datos:\n 1. Horas trabajadas\n 2. Valor por Hora");
                int horas = entrada.nextInt();
                double valorHora = entrada.nextDouble();
                entrada.nextLine();

                // Crear una instancia de DocenteHC1
                docente = new DocenteHC1(horas, valorHora, name, facu, cadi);
                docente.SalarioMensual(); 
                salarioTotal += docente.getSalario(); 

            } else if (a == 2) {
                // Docente de Planta
                System.out.println("Ingrese los siguientes datos:\n 1. Cantidad de trabajos de grado\n 2. Sueldo Básico Mensual");
                int trab = entrada.nextInt();
                double sueldo = entrada.nextDouble();
                entrada.nextLine(); 

                // Crear una instancia de DocenteTCO1
                docente = new DocenteTCO1(sueldo, trab, name, facu, cadi);
                docente.SalarioMensual(); 
                salarioTotal += docente.getSalario(); 

            } else {
                System.out.println("Opción inválida. Inténtalo de nuevo.");
                continue;
            }

            docentes.add(docente);

            System.out.println("¿Deseas ingresar otro docente? (sí/no en minúsculas)");
            String respuesta = entrada.nextLine().toLowerCase();
            if (respuesta.equals("no")) {
                continuar = false;
            }

        } while (continuar);
        if (!docentes.isEmpty()) {
            System.out.println("¿Qué deseas hacer?\n1. Ver todos los docentes\n2. Ver un docente específico");
            int opcion = entrada.nextInt();

            if (opcion == 1) {
                // Mostrar todos los docentes
                for (int i = 0; i < docentes.size(); i++) {
                    Docente d = docentes.get(i);
                    System.out.println("Docente " + (i + 1) + ":");
                    System.out.println(d);
                    System.out.println();
                }
                System.out.println("El salario total de todos los docentes es: " + salarioTotal);
            } else if (opcion == 2) {
                // Mostrar un docente específico
                System.out.println("Ingrese el número del docente (1 a " + docentes.size() + "):");
                int indice = entrada.nextInt() - 1;

                if (indice >= 0 && indice < docentes.size()) {
                    Docente d = docentes.get(indice);
                    System.out.println("Docente seleccionado:");
                    System.out.println(d);
                } else {
                    System.out.println("Índice inválido.");
                }
            } else {
                System.out.println("Opción inválida.");
            }
        } else {
            System.out.println("No se han ingresado docentes.");
        }

        entrada.close();
    }
}
