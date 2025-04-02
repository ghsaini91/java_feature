package lambda;

import java.util.ArrayList;
import java.util.List;

public class EmpService {

    public static List<EmpPojo> getEmploye(){
        List<EmpPojo> list = new ArrayList<>();
        list.add(new EmpPojo(1,"Himanshu"));
        list.add(new EmpPojo(2,"Vipin"));
        list.add(new EmpPojo(3,"hacker"));
        return list;
    }
}
