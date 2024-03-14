

/**
 * Фрилансер (работник с почасовой оплатой)
 * TODO: Доработать в рамках домашней работы
 */
public class Freelancer extends Employee{
    private Freelancer(String surName, String name, double salary) {
        super(surName, name, salary);
    }

    public static Freelancer create(String surName, String name, double salary){
        return new Freelancer(surName, name, salary);
    }

@Override
public double calculateSalary() {

    return 20.8*8*salary;
}

}
