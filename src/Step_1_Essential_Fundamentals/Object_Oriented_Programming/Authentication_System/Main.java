package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Authentication_System;

public class Main {
    public static void main(String[] args) {
        User user = new User("Admin", "admin123");
        Admin admin = new Admin();

        System.out.println(user.authenticate("admin123"));
        System.out.println(admin.authenticate("admin123"));
    }
}
