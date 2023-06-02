import java.awt.print.Book;

class Library {
    private Books [] Books;
    private Student [] Students;
    private int NumofCurrentBook=0,NumofCurrentStudent=0;

    public Library(){
        Books = new Books[100];
        Students = new Student[100];
    }
    public void AddBook(Books book){
        Books[NumofCurrentBook++]=book;
    }
    public void AddStudent(Student student){
        Students[NumofCurrentStudent++]=student;
    }
    public void displayBooks(){
        System.out.println("Book available in library: ");
        for(Books book: Books){
            if(book!=null)
                System.out.println(book.getTitle());
        }
    }
    Books findbook(String title){
        int i=0;
        boolean flag=true;
        for(; i<NumofCurrentBook; i++){
            if(Books[i].getTitle()==title){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println(title + " is not available in library.");
            return null;
        }
        return Books[i];
    }
    public void borrowbook(String title, Student student){
        boolean flag = true;
        for(int i=0; i<NumofCurrentBook; i++){
            if(Books[i].getTitle() == title){
                student.borrowbook(Books[i]);
                AddStudent(student);
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("There was no " + title + " book.");
    }
    public void returnbook(String title, Student student){
        for(Books book: Books){
            if(book!=null){
                if(book.getTitle() == title){
                    student.returnbook(book);
                    for(int i=0; i<NumofCurrentStudent; i++){
                        if(student.getName()==Students[i].getName()){
                            for(int j=i+1; j<NumofCurrentStudent; j++){
                                Students[i]=Students[j];
                                i++;
                            }
                        }
                        break;
                    }
                    NumofCurrentStudent--;
                    break;
                }
            }
        }
    }
}
