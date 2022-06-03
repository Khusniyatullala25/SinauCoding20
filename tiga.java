import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.IOException;

public class tiga {
    public static void main(String[] args) {
        Kelas datar = new Kelas();
        Scanner input = new Scanner(System.in);
        BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));
        String keputusan = "Y";
        System.out.println("Menghitung Luas dan Keliling Bangun Datar");
        System.out.println("============= Bangun Datar =============");
        System.out.println("1. Lingkaran \n2. Persegi\n3. Segitiga\n4. Persegi Panjang\n");
        while (keputusan.equals("Y") || keputusan.equals("y")) {
            System.out.print("Masukan pilihan = ");
            int pilihan = input.nextInt();
            if (pilihan == 1) {
                datar.lingkaran();
            } else if (pilihan == 2) {
                datar.persegi();
            } else if (pilihan == 3) {
                datar.segitiga();
            } else if (pilihan == 4) {
                datar.ppanjang();
            } else {
                System.out.print("pilihan salah");
            }
            System.out.print("Apakah ingin memilih lagi? Y/T");
            try {
                keputusan = input2.readLine();
            } catch (IOException e) {
                System.out.println("Gagal Membaca Keyboard");
            }
        }

    }
}

class Kelas {
    public void lingkaran() {
        Scanner input = new Scanner(System.in);
        double phi = 3.14;
        double r, luas, keliling;
        System.out.println("\n=====Bangun Datar lingkaran=====");
        System.out.print("Inputkan Panjang Jari-jari : ");
        r = input.nextDouble();
        System.out.println("Hasil");
        luas = phi * r * r;
        keliling = 2 * phi * r;
        System.out.print("Luas  = " + (int) luas + " \nKeliling  = " + (int) keliling);
        System.out.println("");
    }

    public void persegi() {
        Scanner input = new Scanner(System.in);
        double s, luas, keliling;
        System.out.println("\n=====Bangun Datar Persegi=====");
        System.out.print("Inputkan Panjang sisi : ");
        s = input.nextDouble();
        System.out.println("Hasil");
        luas = s * s;
        keliling = 4 * s;
        System.out.print("Luas  = " + (int) luas + " \nKeliling = " + (int) keliling);
        System.out.println("");
    }

    public void segitiga() {
        Scanner input = new Scanner(System.in);
        double a, t, luas, keliling;
        System.out.println("\n=====Bagun Datar Segitiga=====");
        System.out.print("Masukkan Panjang alas : ");
        a = input.nextDouble();
        System.out.print("Masukkan tinggi : ");
        t = input.nextDouble();
        System.out.println("Hasil : ");
        luas = 0.5 * a * t;
        keliling = 3 * t;
        System.out.print("Luas  = " + (int) luas + " \nKeliling = " + (int) keliling);
        System.out.println("");
    }

    public void ppanjang() {
        Scanner input = new Scanner(System.in);
        double p, l, luas, keliling;
        System.out.println("\n=====Bangun Datar Persegi Panjang=====");
        System.out.print("Inputkan Panjang : ");
        p = input.nextDouble();
        System.out.print("Inputkan lebar : ");
        l = input.nextDouble();
        System.out.println("Hasil");
        luas = p * l;
        keliling = 2 * p + 2 * l;
        System.out.print("Luas  = " + (int) luas + " \nKeliling  = " + (int) keliling);
        System.out.println("");
    }
}
