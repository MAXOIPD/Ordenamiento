package Insertion;

import fes.aragon.dinamicos.ListaSimple;

public class Insertion {
    public static void sort(ListaSimple<Integer> lista) {
        for(int i = 1; i < lista.getLongitud(); i++) {
            for(int j = i; j > 0 && less(lista.obtenerNodo(j), lista.obtenerNodo(j-1)); j--) {
                exch(lista, j, j-1);
            }
        }
    }

    private static boolean less(Integer v, Integer w) {
        return v.doubleValue() < w.doubleValue();
    }

    private static void exch(ListaSimple<Integer> lista, int i, int j) {
        int temp = lista.obtenerNodo((i));
        lista.asignar(lista.obtenerNodo(j), i);
        lista.asignar(temp, j);
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
