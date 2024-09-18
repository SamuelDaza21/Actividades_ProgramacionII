
package ejerciciopolimorfismo;

public class DocenteHC1 extends Docente {
    private int horas;
    private double valorHora, sueldoMesHoras;

    public DocenteHC1(int horas, double valorHora, String nombreDoc, String facultadDoc, String cadiDoc) {
        super(nombreDoc, facultadDoc, cadiDoc);
        this.horas = horas;
        this.valorHora = valorHora;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    void SalarioMensual() {
        sueldoMesHoras = valorHora * horas;
    }

    @Override
    public double getSalario() {
        return sueldoMesHoras;
    }

    @Override
    public String toString() {
        return "Sus datos son:\n 1. Nombre: " + nombreDoc + "\n 2. Docente Catedratico de la Facultad de: " + facultadDoc +
                          "\n 3. Docente del area de: " + cadiDoc + "\n Trabajo " + horas + " horas a $" + valorHora +
                          "\n Salario de este mes: $" + sueldoMesHoras;
    }
}
