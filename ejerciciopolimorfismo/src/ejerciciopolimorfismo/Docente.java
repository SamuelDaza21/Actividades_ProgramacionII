package ejerciciopolimorfismo;


abstract class Docente {
    protected String nombreDoc, facultadDoc, cadiDoc;

    // Constructor debe asignar los valores a los atributos
    public Docente(String nombreDoc, String facultadDoc, String cadiDoc) {
        this.nombreDoc = nombreDoc;
        this.facultadDoc = facultadDoc;
        this.cadiDoc = cadiDoc;
    }

    // Métodos abstracto
    abstract void SalarioMensual();
    public abstract double getSalario(); 

    // Métodos getter y setter
    public void setNombreDoc(String nombreDoc) {
        this.nombreDoc = nombreDoc;
    }

    public void setFacultadDoc(String facultadDoc) {
        this.facultadDoc = facultadDoc;
    }

    public void setCadiDoc(String cadiDoc) {
        this.cadiDoc = cadiDoc;
    }

    public String getNombreDoc() {
        return nombreDoc;
    }

    public String getFacultadDoc() {
        return facultadDoc;
    }

    public String getCadiDoc() {
        return cadiDoc;
    }
}
