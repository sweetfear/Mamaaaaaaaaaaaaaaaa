import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println();

    }

   public static Double calculate(double a, double b,DoubleBinaryOperator operator){
        return operator.applyAsDouble(a,b);
   }
    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return a -> condition.test(a) ? ifTrue.apply(a):ifFalse.apply(a);
    }

    public static String getString(List<Integer> list) {
        return list.stream()
                .map(n -> (n % 2 == 0 ? "e" + n : "o" + n))
                .collect(Collectors.joining(","));
    }
    public static int go( List<? extends Number> list,Predicate predicate){
        return (int)list.stream().filter(predicate).count();
    }







}













