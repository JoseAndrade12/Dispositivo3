public class Dispositivo {
    // Atributos de instancia: pertenecen a cada objeto
    private String nombre;
    private String tipo;
    private boolean activo;
    private int id;

    // Paso 5: contador compartido por toda la clase
    private static int contador = 0;

    // Pasos 2 y 3: constructor con parámetros y uso de this
    public Dispositivo(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.activo = false;

        // Paso 6: incrementar el contador al crear cada objeto
        contador++;

        // Desafío adicional: ID automático usando el contador
        this.id = contador;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isActivo() {
        return activo;
    }

    public int getId() {
        return id;
    }

    // Setters (solo los necesarios; el id no se puede modificar)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // Método de instancia para mostrar los datos del objeto
    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Activo: " + activo);
    }

    // Paso 7: método static, se llama con el nombre de la clase
    public static int getTotalCreados() {
        return contador;
    }
}
}
