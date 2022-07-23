package ca.ciccc.wmad202.Assignment7.Question5;

import java.util.List;
import java.util.function.Predicate;

public class RelativelyPrime {
    public interface unaryPredicate<T> extends Predicate<T> {
    }

    public static <T> int findFirst(List<T> list, int Begin, int End, unaryPredicate<T> p) {
        for (int i = Begin; i <= End; i++) {
            for (int j = i + 1; j <= End; j++) {
                if (p.test(gcd(list.get(i), list.get(j)))) {
                    return (int) list.get(i);
                }
            }
        }
        return -1;
    }
    private static <T> T gcd(T a,T b){
        if ((Integer) b==0){
            return (T) a;
        }
        return (T) gcd(b, (Integer) a %(Integer) b);
    }
}







