public class Persona {
    //Atributos
    private String nombrePersona;
    private String apellidosPersona;
    private Pasaporte pasaporte; //Asociacion: Persona "tiene" pasaporte
    private Mascota mascota;

    //Constructor Completo
    public Persona(String nombrePersona, String apellidosPersona){
        this.nombrePersona = nombrePersona;
        this.apellidosPersona = apellidosPersona;
        this.pasaporte = null;  //Inicialmente no se sabe si tiene pasaporte
    }

    //Metodo para sacar pasaporte
    public void sacarPasaporte(String numero, String nacionalidad, String fechaEmision,
                               String fechaVencimiento) {
        //Al sacar un pasaporte nuevo, se crea el objeto y se marca como vigente (true)
        this.pasaporte = new Pasaporte(numero, nacionalidad, fechaEmision, fechaVencimiento, true);
        System.out.println(nombrePersona + " " + apellidosPersona +
                " ha obtenido el papsaporte numero: " + numero + ".");
    }

    //Metodo para tomar un vuelo
    public void tomarVuelo(String paisDestino) {
        //Primero se verifica la existencia de pasaporte y si esta vigente
        if (pasaporte == null || !pasaporte.isVigente()) {
            System.out.println(nombrePersona + " " + apellidosPersona +
                    ", no puede tomar el vuelo. Su pasaporte no esta vigente o no tiene uno.");
        } else {
            System.out.println(this.nombrePersona + " " + this.apellidosPersona + " toma un vuelo a " + paisDestino );
        }
    }

    //Metodo para Mascota
    public void adoptarMascota(Mascota mascota) {this.mascota = mascota;}
    public void jugar() {
        if (mascota != null) {
            System.out.println(nombrePersona + " " + apellidosPersona + " juega con " + mascota.getNombreMascota()
                    + ", su " + mascota.getEspecie() + ".");
        } else {
            System.out.println(nombrePersona + " " + apellidosPersona + " no tiene mascota para jugar.");
        }
    }

    //Dependencia Maquina de Soldar
    public void soldar(MaquinaSoldar maquina, String metal)
    {System.out.println(nombrePersona + " " + apellidosPersona +
            " intenta soldar " + metal + ".");
        maquina.soldar(metal);
    }



}
