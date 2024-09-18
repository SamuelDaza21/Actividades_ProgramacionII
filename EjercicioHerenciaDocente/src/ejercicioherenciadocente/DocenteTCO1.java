package ejercicioherenciadocente;

public class DocenteTCO1 extends Docente1{
    private double sueldoMensual,valorHorasAsesor,asesoriaDoc,sueldoBasico;
    private int canTrabGrado;

    public DocenteTCO1(double sueldoBasico, int canTrabGrado, String nombreDoc, String facultadDoc, String cadiDoc) {
        super(nombreDoc, facultadDoc, cadiDoc);
        this.sueldoBasico = sueldoBasico;
        this.canTrabGrado = canTrabGrado;
        setSueldoBasico(sueldoBasico);
        setCanTrabGrado(canTrabGrado);
        setAsesoriaDoc();
        setSueldoMensual();
    }

    private void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    private void setCanTrabGrado(int canTrabGrado) {
        this.canTrabGrado = canTrabGrado;
    }
    private void setAsesoriaDoc() {
        valorHorasAsesor =canTrabGrado*2;
        this.asesoriaDoc=(sueldoBasico/240)*valorHorasAsesor;
    }
    private void setSueldoMensual() {
       sueldoMensual = sueldoBasico+asesoriaDoc;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }
    
}
