package ejerciciopolimorfismo;

public class DocenteTCO1 extends Docente {
    private double sueldoMensual, valorHorasAsesor, asesoriaDoc, sueldoBasico;
    private int canTrabGrado;

    public DocenteTCO1(double sueldoBasico, int canTrabGrado, String nombreDoc, String facultadDoc, String cadiDoc) {
        super(nombreDoc, facultadDoc, cadiDoc);
        this.sueldoBasico = sueldoBasico;
        this.canTrabGrado = canTrabGrado;
        setSueldoBasico(sueldoBasico);
        setCanTrabGrado(canTrabGrado);
        setAsesoriaDoc();
    }

    private void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    private void setCanTrabGrado(int canTrabGrado) {
        this.canTrabGrado = canTrabGrado;
    }

    private void setAsesoriaDoc() {
        valorHorasAsesor = canTrabGrado * 2;
        this.asesoriaDoc = (sueldoBasico / 240) * valorHorasAsesor;
    }

    @Override
    void SalarioMensual() {
        sueldoMensual = sueldoBasico + asesoriaDoc;
    }

    @Override
    public double getSalario() {
        return sueldoMensual;
    }

    @Override
    public String toString() {
        return """
               Sus datos son:
               1. Nombre: """ + nombreDoc + "\n" +
               "2. Docente Titular de la Facultad de: " + facultadDoc + "\n" +
               "3. Docente del área de: " + cadiDoc + "\n" +
               "Encargado de " + canTrabGrado + " trabajos de grado.\n" +
               "Salario de este mes: $" + sueldoMensual;
    }
}
