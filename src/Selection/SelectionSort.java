package Selection;

import fes.aragon.dinamicos.ListaSimple;

public class SelectionSort {

    public static void sort(ListaSimple<Integer> lista){
        for(int i = 0; i < lista.getLongitud(); i++) {
            int minIndex = i;
            for(int j = i + 1; j < lista.getLongitud(); j++) {
                if(less(lista.obtenerNodo(j), lista.obtenerNodo(minIndex))){
                    minIndex = j;
                }
            }
            exch(lista, i, minIndex);
        }
    }

    private static boolean less(Integer v, Integer w) {
        return v.doubleValue() < w.doubleValue();
    }

    private static void exch(ListaSimple<Integer> lista, int i, int j) {
        int temp = lista.obtenerNodo(i);
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
