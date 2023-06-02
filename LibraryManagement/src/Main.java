

public class Main {
    public static void main(String[] args){
        Books book1 = new Books("Chemistry","Hajari","23ghtd",10);
        Books book2 = new Books("Physics", "Tapon", "45sdua", 5);
        Books book3 = new Books("Math", "Ketab", "45sdusdf", 5);
        Books book4 = new Books("Biology", "Ajmal", "5sdua", 5);
        Books book5 = new Books("Bangla", "No one", "45sdua", 0);

        Student one = new Student("Saimon", 1402);
        Student two = new Student("Yasin", 1406);
        Student three = new Student("Mustakim", 1405);
        Student four = new Student("Nahian", 1403);
        Student five = new Student("Toha", 1422);

        Library science = new Library();
        science.AddBook(book1);
        science.AddBook(book2);
        science.AddBook(book3);
        science.AddBook(book4);
        science.AddBook(book5);
        science.borrowbook("Biology", three);
        three.display();
        science.displayBooks();

        one.borrowbook(book2);
    }
}