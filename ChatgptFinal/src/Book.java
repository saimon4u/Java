public class Book extends Product{
    private String author;
    private int publicationYear;
    Book(String author,int publicationYear,String productId, String name, double price){
        super(productId, name, price);
        this.author = author;
        this.publicationYear = publicationYear;
    }
    @Override
    public double calculateDiscountPrice(Product product){
        double price = product.getPrice() * 0.90;
        return price;
    }

}
