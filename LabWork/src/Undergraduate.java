public class Undergraduate extends Student{
   private int RollNo;
   Undergraduate(String Name,int RegNum,int RollNo){
      super(Name,RegNum);
      this.RollNo = RollNo;
   }
   @Override
   public void generateId(){
      super.Id = "UnderGraduate";
   }
   public void SubmitAssignment(){
      System.out.println("Assignment Submitted!");
   }
   public int getRollNo() {
      return RollNo;
   }

   @Override
   public String toString() {
      return "Name: " + Name + "\n"  + "RegNo: " + RegNum + "\n" + "Id: " + Id + "\n";
   }
}
