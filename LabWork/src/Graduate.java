public class Graduate extends Student{
    private int MeritPosition;
    private double cgpa;
    Graduate(String Name,int RegNum,int MeritPosition,double cgpa){
        super(Name,RegNum);
        this.MeritPosition = MeritPosition;
        this.cgpa = cgpa;
    }
    @Override
    public void generateId(){
        super.Id = "Graduate";
    }
    public void DoThesis(){
        System.out.println("Thesis Done!");
    }

    public double getCgpa() {
        return cgpa;
    }

    public int getMeritPosition() {
        return MeritPosition;
    }

    @Override
    public String toString() {
        return "Name: " + Name + "\n" + "RegNo: " + RegNum + "\n" + "Id: " + Id + "\n";
    }
}
