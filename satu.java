public class satu {
    public static void main(String[] args) {
        int x;
        for (x = 1; x <= 50; x++) {
            if (x % 3 == 0) {
                System.out.print("Habis dibagi 3");
            } else if (x % 5 == 0) {
                System.out.print("Habis dibagi 5");
            } else
                System.out.print(x);
            System.out.print(" ");
        }
        System.out.println();
    }
}