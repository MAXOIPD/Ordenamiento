package BubbleSort;

import fes.aragon.dinamicos.ListaSimple;

public class BubbleSort {
    public static void main(String[] args) {
        ListaSimple<Integer> lista = new ListaSimple<>();
        lista.insertarEnCola(5).insertarEnCola(1).insertarEnCola(4)
                .insertarEnCola(2).insertarEnCola(8).insertarEnCola(9)
                .insertarEnCola(3).insertarEnCola(7).insertarEnCola(6);
        System.out.println("Lista dada: ");
        lista.imprimir();
        System.out.println("Lista ordenada: ");
        sort(lista);
        lista.imprimir();
    }
    public static void sort(ListaSimple<Integer> lista) {
        for(int i = 0; i < lista.getLongitud() - 1; i++) {
            for(int j = 0; j < lista.getLongitud() - i - 1; j++) {
                if(lista.obtenerNodo(j) > lista.obtenerNodo((j+1))) {
                    int temp = lista.obtenerNodo(j);
                    int temp2 = lista.obtenerNodo(j+1);
                    lista.asignar(temp, j+1);
                    lista.asignar(temp2, j);
                }
            }
        }
    }
}
