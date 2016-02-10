import javax.jws.soap.SOAPBinding;

/**
 * Created by Root on 05.02.2016.
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee1 = new Employee("John Higgins", 40, 2500);
        Person employee2 = new Employee("Mark Wiliams", 40, 3000);
        Manager boss1 = new Manager("Ronnie O'Sullivan", 40, 4000, 2150);
        Person student1 = new Student("Bill Gates", 35, "MIT", "Micriprocessors");

//    Person mx[] = new Person[4];
//        mx[0] = employee1;
//        mx[1] = employee2;
//        mx[2] = boss1;
//        mx[3] = student1;
//
//
//        for (Person e : mx) {
//                System.out.println(e.getDescription() );
//
//        }

        Manager boss2 =  boss1.clone();
        //boss2.setBonus(2500);
        System.out.println(boss1.compareTo(boss2));


    }

}

