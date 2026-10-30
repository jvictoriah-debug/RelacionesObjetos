import java.util.ArrayList;
import java.util.Arrays;

public class MaquinaSoldar {
    //Atributos
    private String marca;
    private String modelo;
    private int potencia;
    private ArrayList<String> metalesPermitidos;

    //Constructor
    public MaquinaSoldar(String marca, String modelo, int potencia, String[] metalesPermitidos) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.metalesPermitidos = new ArrayList<>(Arrays.asList(metalesPermitidos));
    }

    //Setters
    public void soldar(String metal) {
        if (metal == null) throw new IllegalArgumentException("Argumento nulo.");
        if (metalesPermitidos.contains(metal)){
            System.out.println("La maquina de soldar marca: " + marca + ", modelo: " + modelo +
                    " puede soldar " + metal + ".");
        } else{
            System.out.println("La maquina de soldar marca: " + marca + ", modelo: " + modelo +
                    " no puede soldar " + metal + ".");
        }
    }

//    public void soldar(String metal) {
//        if (metal == null) throw new IllegalArgumentException("Argumento nulo.");
//        for (int i = 0; i < metalesPermitidos.size(); i++) {
//            if (metalesPermitidos[i].equals(metal)) {
//                System.out.println("La " + marca + " " +modelo + " solda el " + metal + ".\n");
//                return;
//            }
//        }
//        System.out.println("la " + marca + " " + modelo + " no puede soldar " + metal + ".\n");
//    }


}
