package ArrayssII;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Iguales {
    public static boolean iguales(int [] lista1, int[] lista2){
        boolean Iguals = false;
        if(lista1.length !=lista2.length){
            Iguals= false;
        }else{
            for (int i = 0; i < lista1.length; i++) {
                if (lista1[i]!=lista2[i]){
                    Iguals= false;
                }else{
                    Iguals= true;
                }
            }
        }
        return Iguals;
    }
    public static void main(String[] args) {
        int [] lista1={1,2,3,4};
        int[] lista2={1,2,3,4};
        if(iguales(lista1,lista2)){
            System.out.println("Son iguals");
        }
    }
}
