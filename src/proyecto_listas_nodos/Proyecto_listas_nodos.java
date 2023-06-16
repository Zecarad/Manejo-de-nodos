
package proyecto_listas_nodos;

public class Proyecto_listas_nodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
       lista Lista= new lista(); 
       
       System.out.println("<<-- Ejemplo de lista simple -->>\n");
        
        Lista.agregaralinicio(01);
        Lista.agregaralinicio(34);
        Lista.agregaralinicio(32);
        Lista.agregaralinicio(78);
        Lista.agregaralinicio(32);
        Lista.agregaralinicio(60);
        Lista.agregaralinicio(74);
        Lista.agregaralinicio(95);
        Lista.agregaralinicio(80);
        Lista.agregaralinicio(60);
        Lista.agregaralinicio(17);
        
          Lista.listar();
        
         
        System.out.println("\nAgregar el numero 15 al inicio de la lista ");
         Lista.agregaralinicio(15);
         Lista.listar();
         
        System.out.println("\nInsertar en la posicion 7 el numero 45");
         Lista.insertarporposicion(7, 45);
         Lista.listar();
        
        System.out.println("\nInsertar en la posicion 3 el numero 22");
         Lista.insertarporposicion(3, 22);
         Lista.listar(); 
         
        System.out.println("\nAgregar al final de la lista el numero 19");
         Lista.agregaralfinal(19);
         Lista.listar();
         
        System.out.println("\nCambiar el 32 por el 30");
         Lista.editarporreferencia(32, 30);
         Lista.listar();        
        
        System.out.println("\ninsertar por referencia 15, 16");
         Lista.insertarporreferencia(15, 16);
         Lista.listar();
         
        System.out.println("\nInsertar un nodo con el 61, despues del 60");
         Lista.insertarporreferencia(60, 61);
         Lista.listar();
            
        System.out.println("\nActualizar el valor 74 por el 59");
         Lista.editarporreferencia(74, 59);
         Lista.listar();        
         
        System.out.println("\nEliminar el valor 32");
         Lista.eliminarporreferencia(32);
         Lista.listar();   
         
        System.out.println("\nBuscar el valor 100"); 
         System.out.println(Lista.buscar(100));
        
        System.out.println("\nEliminar por referencia los valores 34 y 01");
         Lista.eliminarporreferencia(34);
         Lista.eliminarporreferencia(01);
         Lista.listar();
         
        System.out.println("\nElimina la lista");
        Lista.eliminar(); 
        
        System.out.println("\nConsulta si la lista está vacia");
        System.out.println(Lista.esVacia());
        
        System.out.println("\n\n<<-- Final de ejercicio -->>");
    }
    
}
