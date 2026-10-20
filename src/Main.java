public class Main {

    public static void main(String[] args) {

        // Pruebas: antes de crear objetos
        System.out.println("Total: " + Dispositivo.getTotalCreados());

        // Paso 4: crear objetos con el constructor
        Dispositivo dispositivo1 = new Dispositivo("Laptop", "Computadora");

        // Después de crear uno
        System.out.println("Total: " + Dispositivo.getTotalCreados());

        Dispositivo dispositivo2 = new Dispositivo("Router", "Red");
        Dispositivo dispositivo3 = new Dispositivo("Servidor", "Almacenamiento");

        // Después de crear tres
        System.out.println("Total: " + Dispositivo.getTotalCreados());

        // Cada objeto conserva sus propios datos (y su propio ID)
        System.out.println();
        System.out.println("--- Dispositivo 1 ---");
        dispositivo1.mostrarInformacion();

        System.out.println();
        System.out.println("--- Dispositivo 2 ---");
        dispositivo2.mostrarInformacion();

        System.out.println();
        System.out.println("--- Dispositivo 3 ---");
        dispositivo3.mostrarInformacion();

        // Los setters siguen funcionando para cambiar datos de un solo objeto
        dispositivo2.setActivo(true);
        System.out.println();
        System.out.println("Router activo: " + dispositivo2.isActivo());
        System.out.println("Laptop activo: " + dispositivo1.isActivo());
    }
}
 