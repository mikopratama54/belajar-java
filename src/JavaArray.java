public class JavaArray {
    public static void main(String[] args) throws Exception {
        int[] array = new int[10];
        int jumlah = 0;

        // Isi array dengan bilangan ganjil
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2 + 1;
        }

        // Tampilkan array dan jumlahkan semua bilangan ganjil
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            jumlah += array[i];
        }
        // 
        System.out.println("\njumlahkan: " + jumlah);
    }
}
