
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Program {

    public static void main(String[] args) {

       ArrayList<Employee> employees = EmployeeFabric.generateEmployees(5,"w");
       employees.addAll(EmployeeFabric.generateEmployees(5,"f"));
       
       for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println();
        System.out.println("***");
        System.out.println();

    //     Arrays.sort(workers);

    //     for (Worker worker : workers) {
    //         System.out.println(worker);
    //     }
     }

}
