public class Demo005 {
    public static void main(String[] args) {
        String username = "Sohan";
        int password = 2005;

        while ((username == "Sohan") && (password == 2005)) {
            System.out.println("User logged in");
            break;
        }
    }
}