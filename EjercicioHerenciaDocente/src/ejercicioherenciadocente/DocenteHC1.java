package ejercicioherenciadocente;

public class DocenteHC1 extends Docente1{
    private int horas;
    private double valorHora,sueldoMesHoras;

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

    public void setSueldoMesHoras() {
        sueldoMesHoras = valorHora*horas;
    }

    public double getSueldoMesHoras() {
        return sueldoMesHoras;
    }
    
}
