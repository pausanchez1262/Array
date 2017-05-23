package array;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto();
        p1.setNombre("A");
        p1.setPrecio(20);
        
        Producto p2 = new Producto();
        p2.setNombre("B");
        p2.setPrecio(20);
        
        Factura f = new Factura(1);
        f.adicionar(p1);
        f.adicionar(p2);
        double total = f.calcularTotal();
        System.out.println("Total"+ total);
        
        Producto b = f.buscar("A");
        if(b!=null)
            System.out.println("Precio" + b.getPrecio());
    }
    
}
