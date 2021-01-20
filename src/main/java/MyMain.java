public class MyMain {
    // This method returns true/false if there 
    // was a boat the specified coordinates. This
    // method also prints out an appropriate message
    public static boolean hit(boolean[][] board, int row, int col) { 
        if (board[row][col]) {
            System.out.println("There was a hit!");
            return true;
        }
        else {
            System.out.println("You missed a boat!");
            return false;
        }
    }

    // Places a boat onto the board
    // The top-left piece of the board is located at (row, col)
    // The remaining pieces are placed in the direction given
    // by the direction input
    public static boolean[][] placeBoat(boolean[][] board, String direction, int boatLength, int row, int col) { 
        for (int i = 0; i < boatLength; i++) {
            if (direction.equals("right")) {
                board[row][col+i] = true;
            }
            if (direction.equals("left")) {
                board[row][col-i] = true;
            }
            if (direction.equals("down")) {
                board[row+i][col] = true;
            }
            if (direction.equals("up")) {
                board[row-i][col] = true;
            }
        }
        return board;
    }

    // Returns true if the every row in the 2D array
    // is in both alphabetical order and in order of 
    // increasing length
    // You may assume that all Strings are lowercase 
    public static boolean inOrder(String[][] words) { 
        int c = 0;
        for (int row = 0; row < words.length; row++) {
            for (int col = 0; col < words[0].length-1; col++) {
                String current_str = words[row][col];
                String next_str = words[row][col+1];
                if ((current_str.compareTo(next_str) < 0) && (current_str.length() < next_str.length())) {
                    c = c + 1;
                }
                
            }
        }
        if (c == ((words[0].length-1)*(words.length))) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        String words [] [] = { {"bye", "hello"}, {"aa", "beta"}};
        System.out.println(inOrder(words));


    }
}
