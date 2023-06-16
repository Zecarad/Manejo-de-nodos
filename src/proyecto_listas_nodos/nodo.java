
package proyecto_listas_nodos;

/**
 *
 * @author jose-
 */
public class nodo {
    private int valor; ///guarda valores 
    
    private nodo siguiente;  ////une los nodos
    
    public void nodo (){
        this.valor= 0;
        this.siguiente= null;
        ///para inicializar las variables 
    }
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    }

