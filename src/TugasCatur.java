public class TugasCatur {
//   tugas 2D Array ; papan catur
//   buatlah sebuah program yang menggunakan array 2D untuk mereprentasikan papan catur
//   inisialisasikan array dengan nilai-nilai yang merepresentasikan bidak catur
//   dimana setiap budak di berikan sebuah kode unik 
//  (misal R untuk raja, Q untuk ratu, B untuk benteng, G untuk gajah, N untuk kuda, dan P untuk Pion)
//   cetak papan catur ke konsol
        public static void main(String[] args) {
            // Inisialisasi papan catur dengan bidak-bidak catur
            String[][] papanCatur = {
                {"R", "N", "B", "Q", "K", "B", "N", "R"},
                {"P", "P", "P", "P", "P", "P", "P", "P"},
                {" ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " "},
                {"p", "p", "p", "p", "p", "p", "p", "p"},
                {"r", "n", "b", "q", "k", "b", "n", "r"}
            };
    
            // Cetak papan catur ke konsol
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    System.out.print(papanCatur[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    


