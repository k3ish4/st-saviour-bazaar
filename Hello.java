public class Hello {

public static void main(String[] args) {


    String[][] solid = new String [11][11];
    
    for (int i = 0; i < 11; i++){
        for (int j = 0; j < 11; j++){
            solid[i][j] = "🌺";
            System.out.print(solid[i][j]);
        }
        System.out.println("");
    }

    String[][] horizontal = new String[11][11];

    for(int i = 0; i < 11; i++){
        for(int j = 0; j < 11; j++){
            if(i % 2 == 0){
                horizontal[i][j] = "🌸";
            }else{
                horizontal[i][j] = "🌺";
            }
            System.out.print(horizontal[i][j]);
        }
        System.out.println("");
    }

    String[][] vertical = new String[11][11];

    for(int i = 0; i < 11; i++){
        for(int j = 0; j < 11; j++){   
            if(j % 2 == 0){
                vertical[i][j] = "🌸";
            }else{
                vertical[i][j] = "🌺";
            }
            System.out.print(vertical[i][j]); 
        }
        System.out.println("");
    }
    
}

    // public static void weave(String[][] rug) {
    //     // Method to print 2D emoji arrays.
    //     for(int i = 0; i < rug.length; i++) {
    //         for(int j = 0; j < rug[i].length; j++) {
    //             System.out.print(rug[i][j]);
    //         }
    //         // Break the line at the end of every row.
    //         System.out.println("");
    //     }
    // }

    // public static String[][] solid(int width, int height) {
    //     String[][] rug = new String[width][height];

    //     for(int i = 0; i < rug.length; i++) {
    //         for(int j = 0; j < rug[i].length; j++) {
    //             rug[i][j] = "X";
    //         }
    //     }

    //     return rug;
    // }

}