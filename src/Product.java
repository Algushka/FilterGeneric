public class Product {
    /// /
    private String name;
    private int rating;
    private int price;
    private int numberOfProducts;

    public Product(String name, int rating, int price, int numberOfProducts) {
        this.name = name;
        this.rating = rating;
        this.price = price;
        this.numberOfProducts = numberOfProducts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberOfGoods() {
        return numberOfProducts;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfProducts = numberOfProducts;
    }

    @Override
    public String toString() {
        return "Good{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", price=" + price +
                ", numberOfBooks=" + numberOfProducts +
                '}';
    }
}


