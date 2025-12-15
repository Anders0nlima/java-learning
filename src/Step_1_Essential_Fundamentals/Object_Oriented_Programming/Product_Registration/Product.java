package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Product_Registration;

public class Product {
    private String name; //Encapsulation - private
    private double price;
    private int quantityInStock;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price >= 0){
            this.price = price;
        } else{
            System.out.println("Error: Price can't be zero or negative");
            this.price = 0.0;
        }
    }


    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public double calculateTotalValue(){
        return getQuantityInStock() * getPrice();
    }
}
