

import java.util.Random;

public class EmployeeFabric {

    private static Random random = new Random();

    public static Worker generateWorker(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int salary = random.nextInt(60000, 120001);
        return Worker.create(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                salary);
    }

    public static Employee generateEmployee(String empType){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int salary = random.nextInt(60000, 120001);
        if (empType.toLowerCase().equals("w"))
        {
        return Worker.create(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                salary);
        }
        else if (empType.toLowerCase().equals("f"))
        {
            return Freelancer.create(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                salary);           
        }
       else return null;
    }


  
    public static Employee[] generateEmployees(int count,String EmpType){
        
        // if (EmpType.toLowerCase()=="w")
        // {
        //     Worker[] workers = new Worker[count];
        //      for (int i = 0; i < count; i++){
        //     workers[i] = generateWorker();
        //      }
        // return (Employee[])workers;
        // // }
        Employee[] employees = new Employee[count];
        if (EmpType.toLowerCase().equals("f")|EmpType.toLowerCase().equals("w"))
                 {
       
        for (int i = 0; i < count; i++){
            employees[i] = generateEmployee(EmpType);
        }
    }
        // {
        // Freelancer[] freelancers = new Freelancer[count];
        // for (int i = 0; i < count; i++){
        //     freelancers[i] = (Freelancer)generateEmployee(EmpType);
        // }
       // Employee[] res = (Employee[])freelancers;
        //Employee[] res = new Employee[1];
        return employees;
         

    }



}
 