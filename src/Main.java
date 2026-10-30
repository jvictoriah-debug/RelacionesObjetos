//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //crear a la persona
        Persona viajero = new Persona("Romario", "Salas Cerdas");
        Persona viajero1 = new Persona("Jaime", "Victoria");

        //1. Intentar tomar un vuelo sin haber sacado pasaporte
        System.out.println("--- Prueba 1: Sin pasaporte ---");
        viajero.tomarVuelo("España");

        //2. Sacar pasaporte (se crea vigente por defecto)
        System.out.println("\n--- Tramitando pasaporte ---");
        viajero.sacarPasaporte("A123456", "Costarricense",
                "01/10/2026", "01/10/2036");

        //3. Intentar tomar el vuelo con pasaporte vigente
        System.out.println("\n---Prueba 2: Con pasaporte vigente ---");
        viajero.tomarVuelo("España");

        //4. Jugar con la Mascota
        System.out.println("\n---Prueba de jugar con mascota---");
        Mascota perro = new Mascota("Firulais", "Rotweiller", 5);
        viajero.adoptarMascota(perro);
        viajero.jugar();
        viajero1.adoptarMascota(perro);
        viajero1.jugar();

        //5. Maquina de Soldar
        System.out.println("\n---Prueba de maquina de soldar---");
        String[] Metales = new String [5];
        Metales [0] = "Hierro";
        Metales [1] = "Acero";
        Metales [2] = "Aluminio";
        Metales [3] = "Oro";
        Metales [4] = "Platino";
        MaquinaSoldar maquina = new MaquinaSoldar("Miller", "ModSCM01", 600, Metales);
        viajero1.soldar(maquina, "Plomo");
        viajero.soldar(maquina, "Hierro");
}
}