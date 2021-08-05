
public class Tabuada {
    public static void main(String args[]){
        
        //FOR -> LAÇO REPETIÇÃO TABUADA
       int tabuada = 10;
       for(int i=0; i<10; i++){
           System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
       }
       //--------------------------------------------------------------------------//
       
       //WHILE -> ENQUANTO
       int contador = 0;
       while(contador < 10){
           System.out.println("WHILE contador é menor que 10 (" + contador + ")");
           contador++;
       }
        System.out.println("TERMINOU WHILE");
        
       //--------------------------------------------------------------------------// 
        
       //DO WHILE -> EXECUTA DEPOIS VERIFICA
       int contador2 = 0;
       do{
           System.out.println("Do conador é menor que 10 (" + contador2 + ")");
           contador2++;
       }while(contador2 < 10);
        System.out.println("TERMINOU DO WHILE");
        
       //--------------------------------------------------------------------------//
    
       //CRIAR FUNÇÃO -> SOMA
       double a = 5.4;
       double b = 7;
       soma(a,b);
    }
    
    private static void soma(double num1, double num2){
        System.out.println("SOMA = " + (num1 + num2));
    }
    //--------------------------------------------------------------------------//
}
