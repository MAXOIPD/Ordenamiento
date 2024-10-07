package Quick;

import fes.aragon.dinamicos.ListaSimple;

public class QuickSort {
    public static void quickSort(ListaSimple<Integer> lista) {
        quickSort(lista, 0, lista.getLongitud() - 1);
    }

    // por qué mierdas usamos linux?
    public static void quickSort(ListaSimple<Integer> lista, int lo, int hi) {
        if(lo < hi) {
            int pivotIndex = particion(lista, lo, hi);
            quickSort(lista, lo, pivotIndex - 1);
            quickSort(lista, pivotIndex + 1, hi);
        }
    }

    public static int particion(ListaSimple<Integer> lista, int lo, int hi) {
        Integer pivot = lista.obtenerNodo((lo));
        int i = lo;
        int j = hi +1;

        while(true) {
            do {
                i++;
            }while(i <= hi && lista.obtenerNodo(i) < pivot);

            do {
                j--;
            }while(lista.obtenerNodo(j) > pivot);

            if(i >= j) break;

            intercambiar(lista, i, j);
        }
        intercambiar(lista, lo, j);
        return j;
    }

    public static void intercambiar(ListaSimple<Integer> lista, int i, int j) {
        Integer temp = lista.obtenerNodo(i);
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
        quickSort(lista);
        lista.imprimir();
    }
}
