package array;

import java.util.ArrayList;

public class Factura {
    private int id;
    private ArrayList<Producto> b;
    
    public Factura(int id){
        this.b = new ArrayList<>();
    }
    public void adicionar(Producto p){
        this.b.add(p);
    }
    
    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < this.b.size(); i++) {
            Producto p = this.b.get(i);
            total+=p.getPrecio();            
        }
        return total;
    }
    public Producto buscar(String Nombre){
        for(Producto b : b){
            if(b.getNombre().equals(Nombre))
                return b;
        }
        return null;
    }
}
