package JAVA.Comparable.SortWithMultipleCriteria;

public class Product implements Comparable<Product>{
    private String name;
    private int price;
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    @Override
    public int compareTo(Product o) {
        int priceComparison = Integer.compare(this.price, o.price);
        if(priceComparison == 0){
            return this.name.compareTo(o.name);
        }
        return priceComparison;
    }

    @Override
    public String toString() {
        return "Product{" + "name='" + name + '\'' + ", price=" + price + '}';
    }
    
}
