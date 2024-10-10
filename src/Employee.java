//abstract class we can not take object from him
public abstract class Employee {
    protected String Name;
    protected double Age;
    protected double Salary;
    protected String Rank;
    protected String Job;

    public Employee() {
    }

    public Employee(String name, double age, double salary, String rank, String job) {
        Name = name;
        Age = age;
        Salary = salary;
        Rank = rank;
        Job = job;
    }



    public void setSalary(double salary) {
        Salary = salary;
    }


    //abstract method must override on it in subclass
    public abstract double getSalary();


}
