public class Chess {
    public static void main(String[] args) {
        for (int i = 0; i<8; i++) {         // i= sorindex
            for (int j = 4; j>0; j--) {     // j= oszlopindex
                if (i%2==0) {
                    System.out.print("% ");
                } else {
                    System.out.print(" %");
                }
            }
            System.out.println();           // Sor lezarasa
        }
    }
}

// Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//