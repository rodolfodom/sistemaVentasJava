package mx.com.gm.ventas;

public class Orden {
    private int idOrden;
    private Producto[] productos;
    private static int contadorOrdenes;

    private int conatdorProductos;
    private static final int MAX_PRODUCTOS = 10;

    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto){
        if(this.conatdorProductos < Orden.MAX_PRODUCTOS){
            this.productos[conatdorProductos++] = producto;
        }else{
            System.out.println("Se ha superado la cantidad maxima d eproductos: " + Orden.MAX_PRODUCTOS);
        }
    }

    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < this.conatdorProductos; i++) total += productos[i].getPrecio();

        return total;
    }


    public void mostrarOrden(){
        System.out.println("id Orden: " + this.idOrden);
        System.out.println("Total de la orden: " + this.calcularTotal());
        System.out.println("Productos de la orden: ");
        for (int i = 0; i < this.conatdorProductos; i++){
            System.out.println(this.productos[i]);
        }
    }
}
