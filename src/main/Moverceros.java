package ArrayssII;

import java.util.Arrays;

public class Moverceros {

    public static int[] moverceros(int[] lista){
        int[] llista2=new int[lista.length];
        int ceros=0;
        for (int i = 0; i < lista.length; i++) {
            if(lista[i]!=0){
                llista2[i-ceros]=lista[i];
            }
            if (lista[i]==0){
                ceros++;
            }
        }
        return llista2;
    }
    public static void main(String[] args) {
        int [] lista={1,2,0,9,8,0,8};
        System.out.println(Arrays.toString(moverceros(lista)));
    }
}
