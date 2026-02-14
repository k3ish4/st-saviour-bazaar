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

    System.out.println("");
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

    System.out.println("");
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
    
    System.out.println("");
    String[][] diagonal = new String[11][11];
    for(int i = 0; i < 11; i++){
        for(int j = 0; j < 11; j++){
            if(i % 2 == 0 && j % 2 != 0) {
                diagonal[i][j] = "🌸";
            } else if (i % 2 == 0 && j % 2 == 0) {
                diagonal[i][j] = "🌺";
            }
            if(i % 2 != 0 && j % 2 == 0) {
                diagonal[i][j] = "🌸";
            } else if (i % 2 != 0 && j % 2 != 0) {
                diagonal[i][j] = "🌺";
            }
            System.out.print(diagonal[i][j]);
        }
        System.out.println("");
    }

    System.out.println("");
    String[][] plaid = new String[11][11];
    for(int i = 0; i < 11; i++){
        for(int j = 0; j < 11; j++){
           if((i % 2 == 0) && (j % 2 != 0)){
                    plaid[i][j] = "🌺"; 
            }else{
                plaid[i][j] = "🌸";
            }
            System.out.print(plaid[i][j]);
        }
        System.out.println("");
    }

    System.out.println("");
    String[][] argyle = new String[11][11];
    for(int i = 0; i < 11; i++){
        for(int j = 0; j < 11; j++){
            if (((i - j) % 5 == 0) || ((i + j) % 5 == 0)) {
                argyle[i][j] = "🌺";
            } else {
                argyle[i][j] = "🌸";
            }
            System.out.print(argyle[i][j]);
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