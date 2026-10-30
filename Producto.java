public class Producto {
    private String nombre;
    private String tipo;

    public void probarSuper(){
        super.mostraDetalles();
    }

    /*
    * el producto no exite ninguna clase por lo que hereda directamente de
    * java.lang.Object y como la clase Object no tine un metodo llamando mostraDetalle()
    * Usar super aqui no sirve de nada porque la superclase directa no posee ese
    * comportamiento. */

}
