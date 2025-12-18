package Step_1_Essential_Fundamentals.Object_Oriented_Programming.People_Registration;

public class Person {
    private String name;
    private int age;
    private Address address; //Attribute of another class type (Composition)

    public Person(String name, int age, String street, String city, int zipCode){
        this.name = name;
        this.age = age;
        this.address = new Address(street, city, zipCode);
    }

    public void displayCompleteData(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Street: " + address.getStreet());
        System.out.println("City: " + address.getCity());
        System.out.println("Zip Code: " + address.getZipCode());
    }

    //An object is "made of" other objects.
}
