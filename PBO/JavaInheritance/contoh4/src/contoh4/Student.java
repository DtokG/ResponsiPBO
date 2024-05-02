package contoh4;
import java.util.Scanner;

class Student extends Person {
    private String nim;
    private double spp;
    private double sks;
    private double modul;

    // Method untuk menghitung pembayaran
    public void htgPembayaran() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan SPP: ");
        spp = scanner.nextDouble();
        System.out.print("Masukkan SKS: ");
        sks = scanner.nextDouble();
        System.out.print("Masukkan harga: ");
        modul = scanner.nextDouble();
        double total = spp + sks + modul;
        System.out.println("Total: " + total);
    }
}
