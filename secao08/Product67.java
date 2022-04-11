package secao08;

public class Product67 {
    public String name;
    public Double price;
    public Integer quantity;

    public double totalValueInStock(){
        return  price * quantity;
    }

    public void addProducts(Integer quantity){
        this.quantity += quantity;
    }

    public void removeProducts(Integer quantity){
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return "Product67 {" +
                "name= '" + name + '\'' +
                ", price= " + price +
                ", quantity= " + quantity +
                ", total= " + totalValueInStock() +
                '}';
    }
}
