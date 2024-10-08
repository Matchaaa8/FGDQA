import java.util.Scanner;

// Kelas Utama
public class Part2 {

    // Metode utama (main)
    public static void main(String[] args) {
        // Pembuatan Scanner untuk input
        Scanner scanner = new Scanner(System.in);

        // 1. Deklarasi variabel dan tipe data
        int integerVar = 10;   // Tipe data int
        double doubleVar = 20.5; // Tipe data double
        char charVar = 'A';     // Tipe data char
        boolean boolVar = true; // Tipe data boolean

        System.out.println("Nilai integer: " + integerVar);
        System.out.println("Nilai double: " + doubleVar);
        System.out.println("Nilai char: " + charVar);
        System.out.println("Nilai boolean: " + boolVar);

        // 2. Penggunaan operator
        int a = 10, b = 5;
        int sum = a + b;       // Penjumlahan
        int diff = a - b;      // Pengurangan
        int product = a * b;   // Perkalian
        int quotient = a / b;  // Pembagian
        int remainder = a % b; // Sisa pembagian

        System.out.println("Penjumlahan: " + sum);
        System.out.println("Pengurangan: " + diff);
        System.out.println("Perkalian: " + product);
        System.out.println("Pembagian: " + quotient);
        System.out.println("Sisa pembagian: " + remainder);

        // 3. Penggunaan if-else (Pengkondisian)
        if (a > b) {
            System.out.println(a + " lebih besar dari " + b);
        } else {
            System.out.println(a + " lebih kecil atau sama dengan " + b);
        }

        // 4. Penggunaan switch
        System.out.print("Masukkan angka antara 1-3: ");
        int switchInput = scanner.nextInt();

        switch (switchInput) {
            case 1:
                System.out.println("Anda memilih angka 1");
                break;
            case 2:
                System.out.println("Anda memilih angka 2");
                break;
            case 3:
                System.out.println("Anda memilih angka 3");
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }

        // 5. Penggunaan perulangan for
        System.out.println("Loop for:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iterasi ke: " + i);
        }

        // 6. Penggunaan perulangan while
        System.out.println("Loop while:");
        int count = 1;
        while (count <= 3) {
            System.out.println("While Iterasi ke: " + count);
            count++;
        }

        // 7. Penggunaan array
        int[] array = {10, 20, 30, 40, 50};
        System.out.println("Array values:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Elemen ke-" + i + ": " + array[i]);
        }

        // 8. Penggunaan metode (fungsi)
        System.out.println("Hasil dari penjumlahan 5 dan 10: " + sumTwoNumbers(5, 10));

        // 9. Pembuatan objek dan penggunaan kelas
        Person person = new Person("John", 25);
        person.displayPersonInfo();

        // 10. Penanganan input dari pengguna
        System.out.print("Masukkan nama Anda: ");
        String name = scanner.next();
        System.out.println("Halo, " + name + "!");

        // Menutup Scanner
        scanner.close();
    }

    // Metode untuk menjumlahkan dua angka
    public static int sumTwoNumbers(int x, int y) {
        return x + y;
    }
}

// Kelas untuk representasi objek sederhana
class Person {
    String name;
    int age;

    // Konstruktor untuk kelas Person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Metode untuk menampilkan informasi orang
    public void displayPersonInfo() {
        System.out.println("Nama: " + name);
        System.out.println("Umur: " + age + " tahun");
    }
}
