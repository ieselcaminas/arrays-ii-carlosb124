package ArrayssII;

import java.util.Arrays;

public class Inverso {
    public static int [] inverso(int [] llista){
        int [] llista2=new int [llista.length];
        for (int i = 0; i < llista.length; i++) {
            llista2[i]=llista[llista.length-1-i];
        }
        return llista2;
    }
    public static void main(String[] args) {
        int[] llista={1,2,3,4,4,8,6,3,2,0};
        System.out.println(Arrays.toString(inverso(llista)));
    }
}
