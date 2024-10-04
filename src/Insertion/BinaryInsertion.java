package Insertion;

import fes.aragon.dinamicos.ListaSimple;

public class BinaryInsertion {

    public static void sort(ListaSimple<Integer> lista) {
        for(int i = 1; i < lista.getLongitud(); i++) {
            int v = lista.obtenerNodo(i);
            int lo = 0, hi = i;
            while(lo < hi) {
                int mid = lo + (hi - lo) / 2;
                if(less(v, lista.obtenerNodo(mid))) hi = mid;
                else lo = mid + 1;
            }
            for(int j = i; j > lo; --j) {
                lista.asignar(lista.obtenerNodo(j-1), j);
            }
            lista.asignar(v, lo);
        }
    }

    private static boolean less(Integer v, Integer w) {
        return v.doubleValue() < w.doubleValue();
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
