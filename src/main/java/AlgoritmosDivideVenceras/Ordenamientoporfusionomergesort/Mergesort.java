/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmosDivideVenceras.Ordenamientoporfusionomergesort;

/**
 *
 * @author Macharger
 */
public class Mergesort {
    public static int contador = 0;
    public static void mergeSort(int[] a, int n) {
    if (n < 2) {
        contador++;
        return;
    }
    int mid = n / 2;
    int[] l = new int[mid];
    int[] r = new int[n - mid];

    for (int i = 0; i < mid; i++) {
       contador++;
       l[i] = a[i];
    }
    for (int i = mid; i < n; i++) {
        contador++;
        r[i - mid] = a[i];
    }
    mergeSort(l, mid);
    mergeSort(r, n - mid);
    merge(a, l, r, mid, n - mid);
    System.out.println(contador);
}
    public static void merge(
  int[] a, int[] l, int[] r, int left, int right) {
 
    int i = 0, j = 0, k = 0;
    while (i < left && j < right) {
        contador++;
        if (l[i] <= r[j]) {
            a[k++] = l[i++];
        }
        else {
            a[k++] = r[j++];
        }
    }
    while (i < left) {
        a[k++] = l[i++];
    }
    while (j < right) {
        a[k++] = r[j++];
    }
    contador++;
}
    public int vecesejecutado (){
        return contador;
    }
    public static void setcontador(int contador){
        Mergesort.contador=contador;
    }
}
