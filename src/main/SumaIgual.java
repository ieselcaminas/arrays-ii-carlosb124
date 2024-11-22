package ArrayssII;

import java.util.Scanner;

public class SumaIgual {

    public static String sumaigual(int [] lista, int numfinal){
        String numeros="";
        for (int i = 0; i < lista.length; i++) {
            for (int j = i+1; j < lista.length; j++) {
                if(lista[i]+lista[j]==numfinal){
                     numeros+="["+lista[i]+"+"+lista[j]+"]";
                     break;
                }
            }
        }
        return numeros;
    }
    public static void main(String[] args) {
        int numeros;
        int num2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Dime cuants numeros vols per a la llista");
        numeros= sc.nextInt();
        int llista[]=new int[numeros];
        for (int i = 0; i < numeros; i++) {
            System.out.println("Dime un numero");
            llista[i] = sc.nextInt();
        }
        System.out.println("Dime quin numero vols que trague");
        num2=sc.nextInt();
        System.out.println(sumaigual(llista,num2));
    }
}
