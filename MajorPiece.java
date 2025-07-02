public abstract class MajorPiece extends Piece{
    // similar to the MinorPiece, this represents a major piece (like the Rook or Queen)
    // and again, its an extension to the Piece class, while inheriting all of its mehtods
    public MajorPiece(byte color){
        // Constructor for MajorPiece
        // And it also gets the color of the piece through its parameter color
        super(color);
    }
}