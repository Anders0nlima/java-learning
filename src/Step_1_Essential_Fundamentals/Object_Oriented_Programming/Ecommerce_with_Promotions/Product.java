package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Ecommerce_with_Promotions;

public abstract class Product {
    private String name;
    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        if (price <= 0){
            System.out.println("Invalid: doesn't allow negative or zero as values");
        }else{
            this.price = price;
        }

    }
}
