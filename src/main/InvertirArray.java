//Crea un programa que a partir de un array de enteros, cree una copia en otro array con los elementos en orden inverso

package main;

import java.util.Arrays;

public class InvertirArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arrInvertido = invertirArray(arr);

        System.out.println("Array original: " + Arrays.toString(arr));
        System.out.println("Array invertido: " + Arrays.toString(arrInvertido));
    }

    public static int[] invertirArray(int[] arr) {
        int[] arrInvertido = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrInvertido[i] = arr[arr.length - 1 - i];
        }
        return arrInvertido;
    }
}
