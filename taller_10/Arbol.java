package taller_10;

public class Arbol extends Plantas {

    @Override
    public void fotosintesis (String tipo ){
        System.out.println("el arbol realiza la fontosintesis. ");
    }
    /*
    * Aquí podemos ver un error porque intento sobrescribir
    * el metodo con @Override, pero no utilizo la misma firma.
    * El metodo debe tener el mismo nombre y los mismos parámetros.*/
}
