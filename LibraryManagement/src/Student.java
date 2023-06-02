import java.awt.print.Book;

class Student {
    private String Name;
    private int ID;
    private Books [] Book = new Books[100];
    private int numofbooks=0;

    public String getName(){
        return Name;
    }
    public Student(String Name, int ID){
        this.ID=ID;
        this.Name=Name;
    }
    public void display(){
        System.out.println("Name: " + Name);
        System.out.println("ID: " + ID);
        System.out.println("Borrowed Books are: ");
        for(Books book:Book){
            if(book!=null)
                System.out.println(book.getTitle());
        }
    }
    public void borrowbook(Books book){
        if(book.NumofCopies==0){
            System.out.println("Sorry this book is not available at this moment.");
        }
        else{
            book.borrow();
            Book[numofbooks++] = book;
        }
    }
    public void returnbook(Books book){
        book.returnBook();
        boolean flag = true;
        for(int i=0; i<100 ; i++){
            if(Book[i].getTitle() == book.getTitle()){
                for(int j=i+1; j<100; j++){
                    Book[i]=Book[j];
                    i++;
                }
                flag=false;
                break;
            }
        }
        if(flag)
            System.out.println(Name + " didn't borrow " + book.getTitle() + " book.");
    }
}
