package calculadoraLambda;

import java.util.function.BiFunction;
import java.util.stream.IntStream;

public class CalculadoraLambda {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> suma = (a,b) ->  a+b;
        BiFunction<Integer, Integer, Integer> resta = (a,b) ->  a-b;

        BiFunction<Integer, Integer, Integer> multiplicacion = (a,b) -> IntStream.range(0,b+1)
                .reduce((acumulador, numero)-> {

                    return suma.apply(acumulador, a);
                }).getAsInt();


        BiFunction<Integer, Integer, Integer> divi = (a,b) -> IntStream.range(0,a)
                .reduce((acumulador, numero)->
                        multiplicacion.apply(numero,b)<= a?suma.apply(acumulador,1):acumulador).getAsInt();

        System.out.println(suma.apply(8,12));
        System.out.println(resta.apply(8,3));
        System.out.println(multiplicacion.apply(6,4));
        System.out.println(divi.apply(27,3));

    }
}
