package lambda.consu_predi_provi;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateDemo1 implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        if(integer % 2 ==0 )
            return true;
        else
        return false;
    }

    public static void main(String a[]) {
        PredicateDemo1 predicateDemo1 = new PredicateDemo1();
        System.out.println("Is even: "+predicateDemo1.test(2));
    }
}
