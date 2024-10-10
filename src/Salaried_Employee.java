public class Salaried_Employee extends Employee{
    private double Bonus;
    private double Deduction;

    public Salaried_Employee() {
    }

    public Salaried_Employee(String name, double age, double salary,
                             String rank, String job, double bonus, double deduction) {
        super(name, age, salary, rank, job);
        Bonus = bonus;
        Deduction = deduction;
    }

    @Override
    public double getSalary() {

        return Salary + Bonus - Deduction;
    }
}
