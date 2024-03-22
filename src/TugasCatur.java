public class TugasCatur {
  
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
    


