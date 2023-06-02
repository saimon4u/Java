

class Books {
    private String title;
    public String author;
    public String ISBN;
    public int NumofCopies;

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getNumofCopies() {
        return NumofCopies;
    }
    public Books(String title , String author, String ISBN, int NumofCopies) {
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
        this.NumofCopies=NumofCopies;
    }
    public void display() {
        System.out.println("Title: " + title);

        System.out.println("Author: " + author);

        System.out.println("ISBN: " + ISBN);

        System.out.println("There was " + NumofCopies + " " + "copies of " + title + " in library.");
    }
    public void borrow() {
        NumofCopies--;
    }
    public void returnBook() {
        NumofCopies++;
    }
}
