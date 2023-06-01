package infoProducto;

public class Producto {
    //campos
    private int playera;
    private int tenis;
    private int pans;
    private int pantaloneta;
    private int gorra;
    private int MontoTotal;


    public Producto(int playera, int tenis, int pans, int pantaloneta, int gorra) {
        this.playera = playera;
        this.tenis = tenis;
        this.pans = pans;
        this.pantaloneta = pantaloneta;
        this.gorra = gorra;
 
    }

    public int MontoTotal(int playera, int tenis, int pans, int pantaloneta, int gorra){ 
        int go = 0; 
        int pant = 0; 
        int pa = 0 ;
        int ten = 0 ; 
        int pl = 0;  

        if (playera > 0){
            pl = playera * 70; 
        }

        if(tenis > 0){
            ten = tenis * 100; 
        }

        if(pans > 0){
            pa = pans * 80; 
        }

        if(pantaloneta > 0){
            pant = pantaloneta * 50; 
        }

        if(gorra > 0){
            go = gorra* 65; 
        }

        MontoTotal = pl + ten + pa + pant + go;

        return MontoTotal; 

    }


    public int TotalXPla(int playera){
        int pl = 0;  

        if (playera > 0){
            pl = playera * 70; 
            
        }

        return pl; 
    }

    public int TotalXTen(int tenis){
        int ten = 0 ; 
    
        if(tenis > 0){
            ten = tenis * 100; 
            
        }  

        return ten; 
    }

    public int TotalXPans(int pans) {
        int pa = 0 ;
        
        if(pans > 0){
            pa = pans * 80; 
            
        } 
        return pa; 
    }

    public int TotalXPant(int pantaloneta){
        int pant = 0; 

        if(pantaloneta > 0){
            pant = pantaloneta * 50; 
            
        } 
        return pant; 
    }

    public int TotalXgorra(int gorra){
        int go = 0; 

        if(gorra > 0){
            go = gorra* 65; 
        
        } 
        return go;          
    }

    public int getPlayera() {
        return playera;
    }

    public void setPlayera(int playera) {
        this.playera = playera;
    }

    public int getTenis() {
        return tenis;
    }

    public void setTenis(int tenis) {
        this.tenis = tenis;
    }

    public int getPans() {
        return pans;
    }

    public int getMontoTotal() {
        return MontoTotal(playera, tenis, pans, pantaloneta, gorra);
    }

    public void setPans(int pans) {
        this.pans = pans;
    }

    public int getPantaloneta() {
        return pantaloneta;
    }

    public void setPantaloneta(int pantaloneta) {
        this.pantaloneta = pantaloneta;
    }

    public int getGorra() {
        return gorra;
    }

    public void setGorra(int gorra) {
        this.gorra = gorra;
    }

    @Override
    public String toString() {
        return  "\n\t--------Productos--------\n" + 
                "\nPlayeras: " + playera + "\t\t Q." +TotalXPla(playera) +
                "\nTenis: " + tenis + "\t\t Q." + TotalXTen(tenis) +
                "\nPans: " + pans + "\t\t\t Q." + TotalXPans(pans) +
                "\nPantalonetas: " +pantaloneta+ "\t\t Q." + TotalXPant(pantaloneta) + 
                "\nGorras: " + gorra + "\t\t Q." + TotalXgorra(gorra) +
                "\n\nMonto Total: " + "\t\t Q." + MontoTotal(playera, tenis, pans, pantaloneta, gorra);
    }
}

