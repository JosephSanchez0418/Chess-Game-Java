public abstract class Piece {
// This private field will the storing the color of the piece, either 1 or 2
    private byte color;

    public Piece(byte color){
        this.color = color;// sets the color field
    }

    public byte getColor(){
        return color;// this will getter will return the color of the piece
    }

    public String getStringLocation(){//this will return the location of the piece on the board
    // Loop through the Board in order to find the piece
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
            // If the current position matches THIS piece instance
                if(Board.getPieces()[i][j] == this){
                // Convert the index into algebraic notation.
                    char col = (char) ('a' + i);
                    // row index + 1 since the array is 0-indexed
                    int row = j+1;
                    return "" + col + row;
                }
            }
        }
        return "";// Return an empty string if it nothing was found
    }
// Computes the adjusted piece value based on the distance to the center of the board
// The pieces closer to the center have higher value 
    public double computeAdjustedValue(){
        for (int i = 0; i<8; i++){
            for (int j = 0; j < 8; j++){
                if(Board.getPieces()[i][j] == this){
                // computes teh distance from the center of the board (3.5, 3.5)
                    double dx = Math.abs(i - 3.5);
                    double dy = Math.abs(j - 3.5);
                // Calculate the adjusted value using given formula
                    return getValue() * (5 - dx) * (5 - dy);
                }
            }
        }
        return 0;// Default if nothing was found, default is 0
    }
// Returns the string representation of the piece!
// Letter + location
    public String toString() {
        return getLetter() + getStringLocation();
    }
// These abstract method is to get the piece type letter
    public abstract String getLetter();
    public abstract byte getValue();
}