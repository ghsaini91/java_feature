package lambda.consu_predi_provi;

import java.util.function.Consumer;

public class Consumer1 implements Consumer<Integer> {

    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }

    public static void main(String a[]){
        Consumer1 c = new Consumer1();
        c.accept(10);
    }
}
