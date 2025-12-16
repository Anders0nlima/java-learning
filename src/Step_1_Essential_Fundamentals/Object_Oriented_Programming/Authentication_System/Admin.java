package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Authentication_System;

public class Admin implements Authenticated{

    @Override
    public boolean authenticate(String pass){
        return "admin123".equals(pass);
    }
}
