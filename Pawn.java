public class Pawn extends Piece{
    // this class will represent the Pawn piece, inheriting the methods from the Piece class
    public Pawn(byte color){
// Constructor for Pawn, and gets us the color of the pawn
        super(color);
    }

    public String getLetter(){
    // Returns an empty string since the pawn still does not have a letter representation
        return "";
    }

    public byte getValue(){
    // Returns the value of a pawn depending on the color
    // white is (+1), and Black is (-1)
    //returning the value of a pawn
        return (byte) (getColor() == 1 ? 1 : -1);
    }
}