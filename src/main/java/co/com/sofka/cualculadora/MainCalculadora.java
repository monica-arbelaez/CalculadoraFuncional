package co.com.sofka.cualculadora;

public class MainCalculadora {

    public static int suma(int numero1, int  numero2){
       return numero1 + numero2;
    }
    public static int resta(int numero1, int  numero2){
        return numero1 - numero2;
    }

    public static int multiplicar(int numero1, int numero2){

        if(numero2 >= 1){
            return suma(numero1, multiplicar(numero1,numero2 -1));
        }else{ return 0;

        }
    }
    public static int  dividir(int dividendo, int divisor){
        if(divisor> dividendo){
            return 0;
        }else{
            return 1 +  dividir(dividendo-divisor, divisor);
        }
    }
    public static void main(String[] args) {
        System.out.println(suma(2,5));
        System.out.println(resta(3,2));
        System.out.println(multiplicar(3,2));
        System.out.println(dividir(15,5));

    }
}
