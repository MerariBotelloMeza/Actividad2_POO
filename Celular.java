public class Celular extends Producto{
    public void mostraDetalles(){
        System.out.println(super.nombre);
        System.out.println(super.tipo);
    }
    /*
    * por el principio de encapsulamiento los atributo private
    * pertenecen totalmente a la clase que los define por lo que la herencia
    * otorga acceso a miembro public o protected, pero no a private para
    * solucionarlo, deberias cambiar la visibilidad a protected, public en Producto o
    * crear metodos de acceso getters
    * */
}
