public class Person{
    private String firstName;
    private String lastName;
    private int age;
    Person(String firstName,String lastName,int age){
        this.firstName = firstName;
        this.lastName  = lastName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getFullName(){
        return firstName + " " + lastName ;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public boolean CanVote(Person object){
        return object.age >= 18 ? true : false;
    }
    public boolean OlderThan(Person object){
        return this.age < object.age;
    }
    public boolean YoungerThan(Person object){
        return this.age > object.age;
    }
    @Override
    public String toString() {
        return "Name: " + getFullName() + "\t" + "Age: " + getAge();
    }
}
