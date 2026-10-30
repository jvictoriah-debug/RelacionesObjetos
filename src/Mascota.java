public class Mascota {
    //Atributos
    private String nombreMascota;
    private String especie;
    private int edadMascota;

    //Constructor
    public Mascota(String nombreMascota, String especie, int edadMascota) {
        this.nombreMascota = nombreMascota;
        this.especie = especie;
        this.edadMascota = edadMascota;
    }

    //Getter
    public String getNombreMascota() {return nombreMascota;}
    public String getEspecie() {return especie;}


}
