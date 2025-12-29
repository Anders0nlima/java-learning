package Step_1_Essential_Fundamentals.Additional_Java_Core.Introduction_to_the_Stream_API.Data_Transformation;

public class Product {
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
        this.price = price;
    }

    @Override
    public String toString(){
       return "Product: [" + getName() + "] - [" + getPrice() + "]";
    }
}
