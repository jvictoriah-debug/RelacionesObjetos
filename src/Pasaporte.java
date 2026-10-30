public class Pasaporte {
    //Atributos
    private String numero;
    private String nacionalidad;
    private String fechaEmision;
    private String fechaVencimiento;
    private boolean estaVigente;

    //Constructor completo
    public Pasaporte(String numero, String nacionalidad, String fechaEmision, String fechaVencimiento,
                     boolean estaVigente) {
        this.numero = numero;
        this.nacionalidad = nacionalidad;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.estaVigente = estaVigente;
    }

    //Getter para verificar la vigencia
    public boolean isVigente() {
        return estaVigente;
    }

    //Setters


    //Setter para cambiar la vigencia cuando saca uno nuevo
    public void setEstaVigente(boolean estaVigente) {
        this.estaVigente = estaVigente;
    }

}
