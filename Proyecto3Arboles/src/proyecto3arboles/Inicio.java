package proyecto3arboles;

//Proyecto 3 de Estructura de Datos / Arboles / Maryeri Morera Pereira

public class Inicio {

    public static void main(String[] args) {

        Arbol arbol = new Arbol();
        arbol.insertar(1);
        arbol.insertar(2);
        arbol.insertar(3);
        arbol.insertar(4);
        arbol.insertar(0);
        System.out.println("Recorriendo inorden:");
        arbol.inorden();
        System.out.println("Recorriendo postorden:");
        arbol.postorden();
        System.out.println("Recorriendo preorden:");
        arbol.preorden();
        System.out.println(arbol.existe(1)); // true
        System.out.println(arbol.existe(7)); // false
        System.out.println(arbol.existe(0)); // true

        ArbolCadenas arbolCadenas = new ArbolCadenas();
        arbolCadenas.insertar("Luis", "Masculino");
        arbolCadenas.insertar("Chris", "Masculino");
        arbolCadenas.insertar("Zelda", "Femenino");
        arbolCadenas.insertar("Cuphead", "Masculino");
        arbolCadenas.insertar("Leon", "Masculino");
        System.out.println("Recorriendo inorden:");
        arbolCadenas.inorden();
        System.out.println("Recorriendo postorden:");
        arbolCadenas.postorden();
        System.out.println("Recorriendo preorden:");
        arbolCadenas.preorden();
        System.out.println(arbolCadenas.existe("Luis")); // true
        System.out.println(arbolCadenas.existe("Claire")); // false
        System.out.println(arbolCadenas.existe("Zelda")); // true

    }

}
