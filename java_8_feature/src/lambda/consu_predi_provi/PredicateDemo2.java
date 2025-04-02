package lambda.consu_predi_provi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo2 {

    public static void main(String a[]){

        Predicate<Integer> predicate = (t) -> t % 2 == 0;

        List<Integer> list = Arrays.asList(1,2,3,4);
        list.stream().filter(t -> t %2 ==0).forEach(t -> System.out.println("even number only: "+t));

        System.out.println(predicate.test(2));
    }
}
