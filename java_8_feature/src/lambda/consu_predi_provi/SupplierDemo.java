package lambda.consu_predi_provi;

import java.util.function.Supplier;

public class SupplierDemo implements Supplier<String> {
    @Override
    public String get() {
        return "Hi himanshu";
    }

    public static void main(String a[]){
        SupplierDemo supplierDemo = new SupplierDemo();
        System.out.println(supplierDemo.get());
    }
}
