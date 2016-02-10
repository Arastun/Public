/**
 * Created by Root on 05.02.2016.
 */
public class Manager extends Employee implements Cloneable{
private int bonus;

    public Manager(String name, int age, int salary, int bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int getSalary() {
        int total = super.getSalary() ;
        return total + bonus;
    }
    @Override
    public String toString() {
        return super.toString() +
                "[salary=" +getSalary() + "," +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Manager other = (Manager)obj;
        return bonus == other.bonus;
    }

    @Override
    public Manager clone() throws CloneNotSupportedException {
        return (Manager)super.clone();
            }

}


