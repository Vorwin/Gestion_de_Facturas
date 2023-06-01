package infocliente;

public class Cliente {
    //campos
    private String nombre;
    private int nit;
    private String direccion;

    public Cliente(String nombre, int nit, String direccion) {
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
    }

    public  String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "\n\t--------Cliente--------\n" +
                "\nNombre: " + nombre +
                "\nNit: " + nit +
                "\nDireccion: " + direccion ;
    }
}
