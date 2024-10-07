package Merge;

import fes.aragon.dinamicos.ListaSimple;

public class MergeSort {
    private static void merge(ListaSimple<Integer> lista, ListaSimple<Integer> aux, int lo, int mid, int hi) {
        for(int k = lo; k <= hi; k++) {
            aux.insertar(lista.obtenerNodo(k), k);
        }
        int i = lo, j = mid + 1;
        for(int k = lo; k <= hi; k++) {
            if(i > mid) {
                lista.asignar(aux.obtenerNodo(j), k);
                j++;
            }else if(j > hi) {
                lista.asignar(aux.obtenerNodo(i), k);
                i++;
            }else if( less(aux.obtenerNodo(j), aux.obtenerNodo(i)) ) {
                lista.asignar(aux.obtenerNodo(j), k);
                j++;
            }else {
                lista.asignar(aux.obtenerNodo(i), k);
                i++;
            }
        }
    }

    private static void sort(ListaSimple<Integer> lista , ListaSimple<Integer> aux, int lo, int hi) {
        if(hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort(lista, aux, lo, mid);
        sort(lista, aux, mid + 1, hi);
        merge(lista, aux, lo, mid, hi);
    }
    public static void sort(ListaSimple<Integer> lista) {
        ListaSimple<Integer> aux = new ListaSimple<>();
        for(int i = 0; i < lista.getLongitud() ; i++) {
            aux.insertar(lista.obtenerNodo(i), i);
        }
        sort(lista, aux, 0, lista.getLongitud() - 1);
    }

    private static boolean less(Integer v, Integer w) {
        return v < w;
    }

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
}
