package taller_10;

public class Arbol2 extends Plantas {

    public void fotosintesis() {
        System.out.println("El árbol realiza la fotosíntesis.");
    }
}
/*
* Aquí podemos sobrescribir sin @Override y no hay problema,
* pero no es una buena práctica porque no podemos comprobar
* fácilmente que realmente se está sobrescribiendo
* el metodo de la clase padre. */