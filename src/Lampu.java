public class Lampu {
    
    // 1. Isi dari objek Lampu adalah nyala dan mati
    private boolean isNyala;
    private String warna;

    public Lampu(String warna) {
        this.warna = warna;
        this.isNyala = false; // awalnya lampu mati
    }

    // 3. Method dari objek Lampu adalah nyalakan dan matikan
    public void nyalakan() {
        this.isNyala = true;
    }

    public void matikan() {
        this.isNyala = false;
    }

    // Method untuk mengecek status lampu
    public String cekStatus() {
        return isNyala ? "Lampu menyala" : "Lampu mati";
    }
    
    public static void main(String[] args) {
        Lampu lampu = new Lampu("Merah");
        lampu.nyalakan();
        System.out.println(lampu.cekStatus()); // Output: Lampu menyala
        lampu.matikan();
        System.out.println(lampu.cekStatus()); // Output: Lampu mati
    }
}


    

