/**
 * Created by Root on 05.02.2016.
 */
public class Employee extends Person implements Cloneable,ICompare {


   // private int age;
    private int salary;

    public Employee() {
    }

    public Employee(String name, int age, int salary) {
        super(name,age);
        this.salary = salary;
    }




    public int getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return getClass().getName() +
                ",name=" + super.name +
                    ", age=" + super.age +
                ", salary=" + salary + " ,"+
                '}';
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {

        return  (Employee)super.clone();
    }

    @Override
    public String getDescription() {
        return getName() + " " +getSalary() + " " +getAge() + " " +this.getClass();

    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Employee object = (Employee)obj;

        return name.equals(object.name) && salary ==((Employee) obj).salary && age == object.age;

    }

    @Override
    public int compareTo(Object other) {
        Employee other1 = (Employee)other;
        if (salary < other1.salary) return (-1);
        if (salary > other1.salary) return (1);
        else return 0;
    }
}
