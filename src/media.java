

//CALCULANDO MEDIA ULTILIZANDO ARRAYS

public class media {

    public static void main(String args[]) {

        int[] valores = new int[5];
        valores[0] = 5;
        valores[1] = 10;
        valores[2] = 7;
        valores[3] = 8;
        valores[4] = 7;

        double retorno_media = media(valores);
        System.out.println("Média = " + retorno_media);

    }

//FUNÇÃO
    
    private static double media(int[] nums) {
        double res_media = 0;
        System.out.println("TAMANHO DO ARRAY = " + nums.length);
        for (int i = 0; i < nums.length; i++) {
            res_media += nums[i];

        }
        res_media = res_media / nums.length;

        return res_media;
    }
}
