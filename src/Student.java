/**
 * Created by Root on 05.02.2016.
 */
public class Student extends Person{

    private String university;
    private String faculty;

    public Student(String name, int age, String university, String faculty) {
        super(name,age);
        this.university = university;
        this.faculty = faculty;
    }


    @Override
    public String getDescription() {
        return name + " " + university + " " + faculty + " " +this.getClass();
    }
}
