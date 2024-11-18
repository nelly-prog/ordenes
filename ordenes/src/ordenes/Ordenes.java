package ordenes;

public class Ordenes {
    
    static class Nodo {
        int valor;
        Nodo izquierdo, derecho;

        public Nodo(int item) {
            valor = item;
            izquierdo = derecho = null;
        }
    }

    static class ArbolBinario {
        Nodo raiz;

        
        void inOrden(Nodo nodo) {
            if (nodo != null) {
                inOrden(nodo.izquierdo);
                System.out.print(nodo.valor + " ");
                inOrden(nodo.derecho);
            }
        }

        
        void postOrden(Nodo nodo) {
            if (nodo != null) {
                postOrden(nodo.izquierdo);
                postOrden(nodo.derecho);
                System.out.print(nodo.valor + " ");
            }
        }

        
        void inOrden() {
            inOrden(raiz);
        }

        
        void postOrden() {
            postOrden(raiz);
        }

        
        Nodo insertar(Nodo nodo, int valor) {
            if (nodo == null) {
                return new Nodo(valor);
            }

            if (valor < nodo.valor) {
                nodo.izquierdo = insertar(nodo.izquierdo, valor);
            } else if (valor > nodo.valor) {
                nodo.derecho = insertar(nodo.derecho, valor);
            }

            return nodo;
        }

        
        void insertar(int valor) {
            raiz = insertar(raiz, valor);
        }
    }

    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

       
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(70);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(60);
        arbol.insertar(80);

        System.out.println("Recorrido InOrden:");
        arbol.inOrden(); 
        System.out.println();

        System.out.println("Recorrido PostOrden:");
        arbol.postOrden(); 
        System.out.println();
    }
}
