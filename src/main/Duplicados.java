package ArrayssII;

public class Duplicados {

    public static String duplicados(int[]lista){
        int num;
        String numeros=" ";
        for (int i = 0; i < lista.length; i++) {
            num=lista[i];
            for (int j = i+1; j < lista.length; j++) {
                if(num==lista[j]){
                    numeros+=num+" ";
                    break;
                }
            }
        }
        return numeros;
    }
    public static void main(String[] args) {
        int[] llista={1,2,2,4,5,6,4,5};
        System.out.println("Els duplicats son "+duplicados(llista));
    }
}
