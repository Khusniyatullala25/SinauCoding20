public class dua {
    public static void main(String[] args) {
        // Inisialisasi data yang digunakan
        int a = 1;
        int batas = 20;
        int i = 0;
        // Proses
        for (; a <= batas; a++) {
            i = 0;
            for (int cek = 1; cek <= a; cek++) {
                if (a % cek == 0) {
                    i += 1;
                }
            }
            if (i == 2) {
                System.out.println(a + " Bilangan Prima"); // output untuk menampilkan jika i adalah bilangan prima
            } else {
                System.out.println(a + " Bukan Bilangan Prima"); // output untuk menampilkan jika i adalah bukan
                                                                 // bilangan prima
            }
        }
    }
}
