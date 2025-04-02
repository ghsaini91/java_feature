package lambda;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Lambda1 {

    public static void main(String a[]){

        LamdaInterface lamdaInterface = (x,y) ->  x+y;
        System.out.println("in lambda function add function : "+lamdaInterface.add(10,20));

        Collections.sort(EmpService.getEmploye(), (o1,o2) -> o1.getName().compareTo(o2.getName()));

        System.out.println(EmpService.getEmploye());
    }
}
