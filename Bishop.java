public class Bishop extends MinorPiece{
// Class Bishop, will extend to a MinorPiece
    public Bishop(byte color){
        super(color);
    }

// Returns "B" for bishop
    public String getLetter(){
        return "B";
    }

    // The value 3 is for a White piece, and -3 for the black piece
    public byte getValue(){
        return (byte) (getColor() == 1 ? 3 : -3);
    }
}