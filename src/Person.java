/**
 * Created by Root on 05.02.2016.
 */
public abstract class Person {

    public String name;
    public int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String getDescription();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
