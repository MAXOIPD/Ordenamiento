package Bubble;

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
        Nodo<Integer> cabeza;
        Nodo<Integer> ultimo = null;

        do{
            swapped = false;
            cabeza = lista.cabeza;
            while(cabeza.next != ultimo) {
                if(cabeza.valor.compareTo(cabeza.next.valor) > 0) {
                    Integer temp = cabeza.valor;
                    cabeza.valor = cabeza.next.valor;
                    cabeza.next.valor = temp;
                    swapped = true;
                }
                cabezat = cabeza.next;
            }
            ultimo = cabeza;
        }while(swapped);
    }
}
