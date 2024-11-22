public class Comunes {

    public static String comunes (int[] a, int[] b){
        String resultado = "";

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    resultado += a[i] + " ";
                    break;
                }
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        int[] a = {2, 4, 8, 3, 5};
        int[] b = {9, 1, 2, 3, 5};

        System.out.println(comunes(a, b));

    }
}


