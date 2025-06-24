public class Q2 {
    public static void main(String[] args) {
        String firstname = "Sayan";
        String lastname = "Dan";

        // String fullname = firstname + " " + lastname;
        String fullname = firstname.concat(" ").concat(lastname);

        // System.out.print(fullname);
        System.out.print(fullname.toUpperCase());
    }
}
