import java.util.ArrayList;
import java.util.Comparator;
public class University{
    private ArrayList <Person> persons = new ArrayList<>();
    University(ArrayList <Person> list){
        persons = list;
    }

    public String getFullNames(){
//        String output = "";
//        boolean flag = true;
//        for(Person per : persons){
//            if(flag){
//                output = per.getFullName();
//                flag = false;
//                continue;
//            }
//            output = output + "," + per.getFullName();
//        }
//        return output;
        ArrayList <String> names = new ArrayList<>();
        persons.forEach(per -> names.add(per.getFullName()));
        return String.join(",",names);
    }
    public Person getOldestPerson(){
//        persons.sort(Comparator.comparing(Person::getAge).reversed());
//        return persons.get(0);
        Person max = persons.get(0);
        for(Person per : persons){
            if(max.OlderThan(per)) max = per;
        }
        return max;
    }
    public Person getYoungestPerson(){
        Person min = persons.get(0);
        for(Person per : persons){
            if(min.YoungerThan(per)) min = per;
        }
        return min;
    }
    public ArrayList<Person> getVoters(){
        ArrayList <Person> temporary = new ArrayList<>();
        for(Person per : persons){
            if(per.CanVote(per)) temporary.add(per);
        }
        return temporary;
    }
    public int getNumberOfEmployees(){
        int count = 0;
        for(Person per : persons){
            if(per.getFullName().endsWith("(Employee)")) count++;
        }
        return count;
    }
}
