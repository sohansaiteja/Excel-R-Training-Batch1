package TEST;

public class Test001 {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            if ((i == 5) || (i == 7)) {
                continue;
            }

            System.out.println(i);
        }
    }
}