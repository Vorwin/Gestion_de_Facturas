package factura; 

import infoProducto.Producto;
import infocliente.Cliente;

public class Factura {
    //campos
    private int numeroFact;
    private Cliente cliente;
    private Producto producto; 
    private String metodoDepago;
    private String fechaEmision;

    public Factura(int numeroFact, String nombre, int nit, String direccion , String metodoDepago, String fechaemision, int playera, int tenis, int pans, int pantaloneta, int gorra){

        this.numeroFact = numeroFact; 
        this.cliente = new Cliente(nombre, nit, direccion); 
        this.producto = new Producto(playera, tenis, pans, pantaloneta, gorra);  
        this.metodoDepago = metodoDepago; 
        this.fechaEmision = fechaemision; 
    }

    public int getnumFac() {
        return numeroFact;
    }

    public String getMetodo(){
        return metodoDepago; 
    }

    public String getFecha(){
        return fechaEmision; 
    }

    public String Nom(){
        String n1 = cliente.getNombre(); 
        return n1; 
    }

    public int Nit(){
        int nit1 = cliente.getNit(); 
        return nit1; 
    }

    public String Dire(){
        String direccion = cliente.getDireccion(); 
        return direccion; 
    }

    public int Mont(){
        int montT = producto.getMontoTotal(); 
        return montT; 
    }

    public int Play(){
        int playera = producto.getPlayera(); 
        return playera; 
    }

    public int teni(){
        int tenis = producto.getTenis(); 
        return tenis; 
    }

    public int pan(){
        int pans = producto.getPans(); 
        return pans; 
    }

    public int pant(){
        int pantaloneta = producto.getPantaloneta(); 
        return pantaloneta; 
    }

    public int gor(){
        int gorra = producto.getGorra(); 
        return gorra; 
    }

    @Override
    public String toString() {
        return "\n\n\t--------Factura--------\n" +
                "\nNúmero de Factura: " + this.numeroFact +
                "\n" + this.cliente +
                "\n" + this.producto + 
                "\n\nMetodo de pago: " + this.metodoDepago +
                "\nFecha de emision: " + this.fechaEmision ;
    }

}