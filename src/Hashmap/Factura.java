package Hashmap;

import java.util.HashMap;

public class Factura {
    private int id;
    private HashMap<String,Producto> b;
    
    public Factura(int id){
        this.b = new HashMap<>();
    }
    public void adicionar(Producto p){
        this.b.put(p.getNombre(),p);
    }
    
    public double calcularTotal(){
        double total = 0;
        for (Producto p : b.values()) {
            total+=p.getPrecio();            
        }
        return total;
    }
    public Producto buscar(String Nombre){
        return this.b.get(Nombre);
    }
}
