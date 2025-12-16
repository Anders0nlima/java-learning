package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Authentication_System;

public class User implements Authenticated{
    private String name;
    private String password;

    public User(String name, String password){
        this.name = name;
        this.password = password;
    }

    @Override
    public boolean authenticate(String pass) {
        return password != null && password.equals(pass);
    }
}
