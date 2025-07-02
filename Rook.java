public class Rook extends MajorPiece{
// This extends the MajorPiece
    public Rook(byte color){
        super(color);
    }

    //Return "R" for rook
    public String getLetter(){
        return "R";
    }

    // This one has 5 for White pieces, and -5 for black pieces
    public byte getValue(){
        return (byte) (getColor() == 1 ? 5 : -5);
    }
}