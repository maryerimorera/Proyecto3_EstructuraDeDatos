
package proyecto3arboles;

public class NodoCadena {
    
    private String dato;
    private String genero;
    private NodoCadena izquierda, derecha;

    public NodoCadena(String dato, String genero) {
        this.dato = dato;
        this.genero = genero;
        this.izquierda = this.derecha = null;
    }


    public String getDato() {
        return dato;
    }
    
    public String getGenero() {
        return genero;
    }

    public NodoCadena getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoCadena izquierda) {
        this.izquierda = izquierda;
    }

    public NodoCadena getDerecha() {
        return derecha;
    }

    public void setDerecha(NodoCadena derecha) {
        this.derecha = derecha;
    }

    public void imprimirDato() {
        System.out.println(this.getDato() + " " +this.getGenero());
    }
}
