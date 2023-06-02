public class Fruit {
    private String Name;
    private String variety;
    private int totalQuantityKg;
    private double pricePerKg;
    public Fruit(String Name,String variety,int totalQuantityKg,double pricePerKg){
        this.totalQuantityKg = totalQuantityKg;
        this.variety = variety;
        this.Name = Name;
        this.pricePerKg = pricePerKg;
    }

    @Override
    public String toString() {
        return "Name: " + Name + "\n" + "Variety: " + variety + "\n" + "PricePerKg: " + pricePerKg + "\n";
    }

    public String getName() {
        return Name;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public int getTotalQuantityKg() {
        return totalQuantityKg;
    }

    public void setTotalQuantityKg(int totalQuantityKg) {
        this.totalQuantityKg = totalQuantityKg;
    }
}
