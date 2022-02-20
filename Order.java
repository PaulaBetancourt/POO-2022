package uv.poo.generictupla;

import java.util.Arrays;

/**
 *
 * @author Maria Paula Betancourt Mota
 */
public class Order {
    public static <T extends Comparable<T>> void ordenaUno (T[] arr) {
    
    if (arr == null || arr.length == 0 || arr.length == 1) return;

    ordenaDos(arr, 0, arr.length - 1);
}

public static <T extends Comparable<T>> void ordenaDos(T[] arr, int start, int end) {

    int i = start;
    int j = end;

    if (end <= start) return;

    T pivot = arr[start + (end - start) / 2];

    T temp;

    while (i <= j) {
        while (arr[i].compareTo(pivot) < 0) {
            i++;
        }

        while (arr[j].compareTo(pivot) > 0) {
            j--;
        }

        if (i <= j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
    if (start < j)
        ordenaDos(arr, start, j);
    if (i < end)
        ordenaDos(arr, i, end);
}

public static void main( String[] args )
    {
        Integer[] intVector = {101, 99, 12, 19, 21, 111, 345};
        Order.ordenaUno(intVector);
 
        System.out.println( Arrays.toString(intVector));
    }
    
}