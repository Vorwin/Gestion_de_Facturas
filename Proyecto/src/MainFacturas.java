import factura.Factura;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import infoProducto.Producto;
import infocliente.Cliente;

public class MainFacturas {
    public static  void main (String []args)throws Exception {
        Scanner input = new Scanner(System.in);
        Factura[] array = new Factura[15];

        array[0] = new Factura(3000, "Andres Solorzano", 1000000, "Guatemala", "efectivo", "30/08/2021", 2, 0, 0, 0, 1); 
        array[1] = new Factura(1111, "Takemichi", 9999999, "Japon", "efectivo", "12/08/2021", 1, 1, 0, 1, 0); 
        array[2] = new Factura(2222, "Carlos Garcia", 1111111, "España", "efectivo", "03/01/2020", 2, 2, 0, 0, 0); 
        array[3] = new Factura(3333, "Madison Beer", 2222222, "Estados Unidos", "efectivo", "10/02/2020", 0, 4, 2, 0, 1); 
        array[4] = new Factura(4444, "Andrea Guerra", 3333333, "España", "efectivo", "18/09/2022", 0, 1, 0, 1, 0); 
        array[5] = new Factura(5555, "Mikey", 4444444, "Japon", "tarjeta", "22/10/2022", 1, 1, 1, 1, 1); 
        array[6] = new Factura(6666, "Kayn", 5555555, "Ionia", "tarjeta", "09/11/2022", 0, 0, 3, 0, 0); 
        array[7] = new Factura(7777, "Akali", 6666666, "Ionia", "tarjeta", "11/12/2021", 1, 0, 0, 0, 3); 
        array[8] = new Factura(8888, "Jorge Gonzales", 7777777, "Guatemala", "tarjeta", "07/01/2020", 2, 0, 5, 0, 0); 
        array[9] = new Factura(9999, "Diego Milla", 8888888, "Estados Unidos", "tarjeta", "17/02/2020", 3, 1, 0, 3, 1); 
        //(x.nextInt(9999))

        boolean flag = true;

        System.out.println("-------------( Proyecto )-------------");

        while(flag){
            int opc;
            Menu();

            System.out.print("-> Ingrese una opción: ");
            opc = input.nextInt();

            switch (opc){
                case 1 -> IngresarFact(array); 
                case 2 -> ImprimirFact(array);
                case 3 -> ImprimirVentas(array);
                case 4 -> {
                    System.out.println("Saliendo del programa...");
                    flag = false;
                    System.out.println("\n\nNos vemos...(*^_^*)");
                }
                default -> System.out.println("Opción no válida");
            }
        }
    }

    // Procedimientos del menu principal 
    public static void IngresarFact(Factura [] aux){
        Scanner input = new Scanner(System.in); 
        input.useDelimiter("\n");

        Scanner inputNum = new Scanner(System.in);  


        Random x = new Random();

        for (int i = 0; i < aux.length; i++) {
            
            if(aux[i] != null){

            }else{
                System.out.println("\n-> Número de factura generado automáticamente");
                
                System.out.println("\n---Cliente---");
                
                System.out.print("-> Nombre del cliente: ");
                String nombre = input.next();  

                System.out.print("-> Nit: ");
                int nit = inputNum.nextInt(); 

                System.out.print("-> Dirección: ");
                String dire = input.next(); 

                System.out.println("\n---Productos---");

                System.out.print("-> Cantidad de playeras xU (Q.70): ");
                int pla = inputNum.nextInt(); 

                System.out.print("-> Cantidad de tenis xU (Q.100): ");
                int ten = inputNum.nextInt(); 

                System.out.print("-> Cantidad de pans xU (Q.80): ");
                int pans = inputNum.nextInt(); 

                System.out.print("-> Cantidad de pantalonetas xU (Q.50): ");
                int pant = inputNum.nextInt(); 

                System.out.print("-> Cantidad de Gorras xU (Q.65): ");
                int go = inputNum.nextInt();

                System.out.print("-> Metdodo de pago (efectivo/tarjeta):  ");
                String metodoDepago = input.next();

                System.out.print("-> Fecha de emision (dd/mm/aaaa): ");
                String fechaemision = input.next();
                
                
                aux[i] = new Factura((x.nextInt(9999)), nombre, nit, dire, metodoDepago, fechaemision, pla, ten, pans, pant, go); 

                System.out.println(aux[i]);
                System.out.println("Factura ingresada correctamente...");
                
                System.out.println("\nDesea continuar (s/n)");
                String opc = inputNum.next(); 
                
                if (opc.equals("s") || opc.equals("S")) {

                }else if (opc.equals("n")|| opc.equals("N")){
                    System.out.println("\nRegresando..."); 
                    break; 
                }

            }
        }
 
    }

    public static void ImprimirFact(Factura [] aux){
        Scanner input = new Scanner(System.in);
        int opc;
        boolean flag = true; 

        
        while(flag){
            menu2();

            System.out.print("-> Ingrese una opción: ");
            opc = input.nextInt(); 
            
            switch (opc) {
                case 1 -> ImpXNumF(aux);
                case 2 -> ImpXNombre(aux);
                case 3 -> ImpXNit(aux);
                case 4 -> ImpXDireccion(aux);
                case 5 -> ImpXMonto(aux);
                case 6 -> ImpXmes(aux);
                case 7 -> ImpXAño(aux);
                case 8 -> ImpXTipoP(aux);
                case 9 -> {
                    System.out.println("Regresando al menú principal...");
                    flag = false;
                }
                default -> System.out.println("Opción no válida");
            }
        }
        
    }

    public static void ImprimirVentas(Factura [] aux){
        Scanner input = new Scanner(System.in);
        int opc;
        boolean flag = true;

        while(flag){
            menu3();

            System.out.print("-> Ingrese una opción: ");
            opc = input.nextInt(); 

            switch(opc){
                case 1 -> VentaXMes(aux);
                case 2 -> VentaXAño(aux);
                case 3 -> VentaXProducto(aux);
                case 4 ->{
                    System.out.println("Regresando al menú principal...");
                    flag = false; 
                }
                default -> System.out.println("Opción no válida");
            }
            

        }

    }

    // Menus
    public static void Menu(){
        System.out.println("\n---------- Menú Principal ----------");
        System.out.println("""
                1.Ingresar factura
                2.Imprimir factura
                3.Imprimir ingresos de venta
                4.Salir""");
    }

    public static void menu2() {
        System.out.println("""
                \n\n---------Imprimir factura por---------
                
                1.Número de factura
                2.Nombre
                3.Nit
                4.Direccion
                5.Monto total
                6.Mes
                7.Año
                8.Tipo de pago
                9.Salir""");
        
    }

    public static void menu3() {
        System.out.println("""
                \n\n---------Imprimir ingresos por Venta---------
                
                1.Mes
                2.Año
                3.Producto 
                4.Salir""");
        
        
    }

    public static void menu4() {
        System.out.println("""
                \n\n--------- Productos ---------
                
                1.Playera
                2.Tenis
                3.Pans 
                4.Pantaloneta
                5.Gorra
                6.Salir""");
        
        
    }

    //Procedimientos para imprimir facturas 
    public static void ImpXNumF(Factura [] aux) {
        Scanner input = new Scanner(System.in);
        int numFact;

        System.out.print("\n-> Ingrese el núemro de factura: ");
        numFact = input.nextInt();
        
        for (int i = 0; i < aux.length; i++) {
            if(aux[i] != null){
                if(aux[i].getnumFac() == numFact) {
                    System.out.println(aux[i]);
                }
            }

        }
        
    }

    public static void ImpXNombre(Factura [] aux){
        Scanner input = new Scanner(System.in); 
        input.useDelimiter("\n");

        System.out.print("\n-> Ingrese el nombre: ");
        String nombre = input.next(); 
        
        for (int i = 0; i < aux.length; i++) {
            if(aux[i] != null){
                if(aux[i].Nom().equals(nombre)) {
                    System.out.println(aux[i]);
                }
            }
        }       
    }

    public static void ImpXNit(Factura [] aux) {
        Scanner input = new Scanner(System.in);

        System.out.print("\n-> Ingresar el nit: ");
        int nit1 = input.nextInt(); 

        for (int i = 0; i < aux.length; i++) {
            if(aux[i] != null){
                if(aux[i].Nit() == nit1) {
                    System.out.println(aux[i]);
                }
            }
        }    
    }

    public static void ImpXDireccion(Factura [] aux){
        Scanner input = new Scanner(System.in); 
        input.useDelimiter("\n");

        System.out.print("\n-> Ingrese la dirección: ");
        String direccion = input.next(); 

        for (int i = 0; i < aux.length; i++) {
            if(aux[i] != null){
                if(aux[i].Dire().equals(direccion)) {
                    System.out.println(aux[i]);
                }
            }
        }
    }

    public static void ImpXMonto(Factura [] aux) {
        Scanner input = new Scanner(System.in);

        System.out.print("\n-> Ingresar el monto total: ");
        int mon = input.nextInt(); 


        for (int i = 0; i < aux.length; i++) {
            if(aux[i] != null){
                if(aux[i].Mont() == mon) {
                    System.out.println(aux[i]);
                }
            }
        } 
    }

    public static void ImpXmes(Factura [] aux) {
        Scanner input = new Scanner(System.in);
        String mes;
        String Y; 
        String Subm; 

        System.out.print("\n-> Ingrese el mes (mm): ");
        mes = input.next();
        
        for (int i = 0; i < aux.length; i++) {
            
            if(aux[i] != null){
                Y = aux[i].getFecha(); 
                Subm = Y.substring(3,5);
                if( Subm.equals(mes)) {
                    System.out.println(aux[i]);
                }
            }

        }
    }

    public static void ImpXAño(Factura [] aux) {
        Scanner input = new Scanner(System.in);
        String year;
        String Y;
        String Suby;  

        System.out.print("\n-> Ingrese el año (aaaa): ");
        year = input.next();
        
        for (int i = 0; i < aux.length; i++) {
            
            if(aux[i] != null){
                Y = aux[i].getFecha(); 
                Suby = Y.substring(6,10); 
                if( Suby.equals(year)) {
                    System.out.println(aux[i]);
                }
            }

        }
    }

    public static void ImpXTipoP(Factura [] aux) {
        Scanner input = new Scanner(System.in);
        String metodo;

        System.out.print("\n-> Ingrese el tipo de pago: ");
        metodo = input.next();
        
        for (int i = 0; i < aux.length; i++) {
            if(aux[i] != null){
                if(aux[i].getMetodo().equals(metodo)) {
                    System.out.println(aux[i]);
                }
            }

        }
    }

    //Procedimientos imprimir ventas 

    private static void VentaXMes(Factura[] aux) {
        Scanner input = new Scanner(System.in);
        String mes;
        String Y; 
        String Subm; 
        int total = 0; 

        System.out.print("\n-> Ingrese el mes (mm): ");
        mes = input.next();
        
        for (int i = 0; i < aux.length; i++) {
            
            if(aux[i] != null){
                Y = aux[i].getFecha(); 
                Subm = Y.substring(3,5);
                if( Subm.equals(mes)) {
                    total += aux[i].Mont();
                }
            }

        }
        System.out.println("El ingreo de ventas del mes "+ mes + " es: Q." +total);
        
    }

    private static void VentaXAño(Factura [] aux) {
        Scanner input = new Scanner(System.in);
        String year;
        String Y;
        String Suby;  
        int total = 0; 

        System.out.print("\n-> Ingrese el año (aaaa): ");
        year = input.next();
        
        for (int i = 0; i < aux.length; i++) {
            
            if(aux[i] != null){
                Y = aux[i].getFecha(); 
                Suby = Y.substring(6,10); 
                if( Suby.equals(year)) {
                    total += aux[i].Mont() ;
                }
            }
            
        }
        System.out.println("El ingreo de ventas del año "+ year + " es: Q." +total);
    }

    public static void VentaXProducto(Factura[]aux) {
        Scanner input = new Scanner(System.in);
        int opc;
        boolean flag = true;

        
        while (flag){
            menu4();
            System.out.print("-> Ingrese una opción: ");
            opc = input.nextInt(); 
            
            switch(opc){
                case 1 ->VentaXplayera(aux);
                case 2 ->VentaXtenis(aux);
                case 3 ->VentaXPans(aux);
                case 4 ->VentaXPantalonetas(aux);
                case 5 ->VentaXGorra(aux);
                case 6 ->{
                    System.out.println("Regresando al menú principal...");
                    flag = false; 
                }
                default -> System.out.println("Opción no válida");
            }
        }
    }

    //Procedimietnos ventas por productos
    private static void VentaXplayera(Factura [] aux) {
        int cant = 0; 
        int total = 0; 

        for (int i = 0; i < aux.length; i++) {
            
            if(aux[i] != null){ 
                if(aux[i].Play() > 0) {
                    cant += aux[i].Play();
                }
            }
        }
        total = cant * 70; 
        System.out.println("El ingreso por playera es: Q." +total);
    }

    private static void VentaXtenis(Factura [] aux) {
        int cant = 0; 
        int total = 0; 

        for (int i = 0; i < aux.length; i++) {
            
            if(aux[i] != null){ 
                if(aux[i].teni() > 0) {
                    cant += aux[i].teni();
                }
            }
        }
        total = cant * 100; 
        System.out.println("El ingreso por tenis es: Q." +total);
    }

    private static void VentaXPans(Factura [] aux) {
        int cant = 0; 
        int total = 0; 

        for (int i = 0; i < aux.length; i++) {
            
            if(aux[i] != null){ 
                if(aux[i].pan() > 0) {
                    cant += aux[i].pan();
                }
            }
        }
        total = cant * 80; 
        System.out.println("El ingreso por pans es: Q." +total);
    }

    private static void VentaXPantalonetas(Factura [] aux) {
        int cant = 0; 
        int total = 0; 

        for (int i = 0; i < aux.length; i++) {
            
            if(aux[i] != null){ 
                if(aux[i].pant() > 0) {
                    cant += aux[i].pant();
                }
            }
        }
        total = cant * 50; 
        System.out.println("El ingreso por pantalonetas es: Q." +total);
    }

    private static void VentaXGorra(Factura [] aux) {
        int cant = 0; 
        int total = 0; 

        for (int i = 0; i < aux.length; i++) {
            
            if(aux[i] != null){ 
                if(aux[i].gor() > 0) {
                    cant += aux[i].gor();
                }
            }
        }
        total = cant * 65; 
        System.out.println("El ingreso por gorras es: Q." +total);
    }
}
