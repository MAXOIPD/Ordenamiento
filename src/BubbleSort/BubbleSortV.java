package BubbleSort;

import fes.aragon.dinamicos.ListaSimple;
import fes.aragon.dinamicos.Nodo;

public class BubbleSortV {

    public static void main(String[] args) {
    ListaSimple<Integer> lista = new ListaSimple<>();
    lista.insertarEnCola(4);
    lista.insertarEnCola(2);
    lista.insertarEnCola(5);
    lista.insertarEnCola(1);
    lista.insertarEnCola(3);
    BubbleSortV bubbleSortV = new BubbleSortV();
    lista.imprimir();
    bubbleSortV.bubbleSort(lista);
    lista.imprimir();
    }

    private void bubbleSort(ListaSimple<Integer> lista) {
        if(lista.esVacia()) {
            return;
        }
        boolean swapped;
        Nodo<Integer> current;
        Nodo<Integer> last = null;

        do{
            swapped = false;
            current = lista.cabeza;
            while(current.next != last) {
                if(current.valor.compareTo(current.next.valor) > 0) {
                    Integer temp = current.valor;
                    current.valor = current.next.valor;
                    current.next.valor = temp;
                    swapped = true;
                }
                current = current.next;
            }
            last = current;
        }while(swapped);
    }
}
