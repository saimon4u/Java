public abstract class Student implements CanRestrict{
    protected String Name;
    protected int RegNum;
    protected String Id;
    protected abstract void generateId();
    Student(String Name,int RegNum){
        this.Name = Name;
        this.RegNum = RegNum;
        generateId();
    }
    public void Restrict(){
        Name = "";
        RegNum = 0;
        Id = "";
        System.out.println("He has been restricted!");
    }

    @Override
    public String toString() {
        return "Name: " + Name + "\n"  + "RegNo: " + RegNum + "\n" + "Id: " + Id + "\n";
    }
}
