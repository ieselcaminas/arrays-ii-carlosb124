package ArrayssII;

import java.util.Arrays;
import java.util.Scanner;

public class Eliminar {
    public static int[] eliminar(int[] llista, int posicio){
        int [] llista2 = new int[llista.length];
        for (int i = 0; i < posicio; i++) {
            llista2[i]=llista[i];
        }
        for (int i = posicio+1; i < llista.length ; i++) {
            llista2[i-1]=llista[i];
        }
        llista2[(llista.length-1)]=llista[posicio];
        return llista2;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [] llista={1,2,3,4,5};
        System.out.println("Dime quin lloc vols eliminar");
        int posicio=sc.nextInt()-1;
        if(posicio> llista.length){
            System.out.println("El numero es mes gran que la llista torna a mirar-ho");
        }else{
            System.out.println(Arrays.toString(eliminar(llista,posicio)));
        }
    }
}
