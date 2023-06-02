public class Main {
    public static void main(String[] args) {
        Student saimon = new Undergraduate("Saimon",2021,1402);
        Student messi = new Undergraduate("Messi",2022,1400);
        Student Neymar = new Graduate("Neymar",2222,4,3.5);
        Student Ronaldo = new Graduate("Ronaldo",2000,2,3.9);
        System.out.println(Neymar);
        ((Graduate)Neymar).DoThesis();
        Neymar.Restrict();
        System.out.println(Neymar);
    }
}