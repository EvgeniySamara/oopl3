import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        Employee[] employees = EmployeeFabric.generateEmployees(5,"w");
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
