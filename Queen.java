public class Queen extends MajorPiece{
// Extends the MajorPiece class
    public Queen(byte color){
        super(color);
    }

// Returns the letter "Q" for queen
    public String getLetter(){
        return "Q";
    }

//Queen has the base value +9 for white, and -9 for black
    public byte getValue(){
        return (byte) (getColor() == 1 ? 9 : -9);
    }
}