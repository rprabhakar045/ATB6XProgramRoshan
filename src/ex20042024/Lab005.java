package ex20042024;

public class Lab005 {
    public static void main(String[] args) {
        String password = "Abcd@123";
        String pass_u = password.toLowerCase();
        System.out.println(pass_u);

        System.out.println(pass_u == password);
        System.out.println(pass_u.equals(password));
        System.out.println(pass_u.equalsIgnoreCase(password));

        System.out.println(password.substring(0,4));
        System.out.println(password.indexOf("d"));






    }
}
