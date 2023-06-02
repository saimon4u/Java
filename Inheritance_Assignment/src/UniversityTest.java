import java.util.ArrayList;
public class UniversityTest {
    public static void main(String[] args) {
        Person saimon = new Student("Saimon","Bhuiyan",20);
        Person yasin = new Student("Mohammad","Yasin",15);
        Person samdani = new Student("Samdani","Mazumder",19);
        Person one = new Employee("My","name",36);
        Person two = new Employee("Your","Name",45);
        Person three = new Employee("Im","employee",75);
        ArrayList <Person> list = new ArrayList<>();
        list.add(saimon);
        list.add(yasin);
        list.add(samdani);
        list.add(one);
        list.add(three);
        list.add(two);
        University DU = new University(list);
//        System.out.println("All the Name: " + DU.getFullNames());
        System.out.println("Oldest person is: \n" + DU.getOldestPerson());
        System.out.println("Youngest person is: \n" + DU.getYoungestPerson());
//        System.out.println("They can vote: \n" + DU.getVoters());
//        System.out.println("Number of Employees: " + DU.getNumberOfEmployees());
    }
}