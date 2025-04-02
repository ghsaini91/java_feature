package lambda.consu_predi_provi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer2 {

    public static void main(String a[]) {

        Consumer<Integer> consumer = t -> System.out.println(t);

        consumer.accept(10);

        List<Integer> list = Arrays.asList(1,2,3,4);

        list.stream().forEach(consumer);
        list.stream().forEach(t -> System.out.println(t));
    }
}
