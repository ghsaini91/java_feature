package lambda.consu_predi_provi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo1 {

    public static void main(String a[]) {
        Supplier<String> supplier = () -> "Hi Himanshu";
        System.out.println(supplier.get());

        List<String> list = Arrays.asList();
        System.out.println(list.stream().findAny().orElseGet(() -> "Hi himanshu"));
    }
}
