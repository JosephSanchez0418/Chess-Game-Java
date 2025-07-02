public abstract class MinorPiece extends Piece{
// Absract class here is to represent the minor piece
// it extends to the Piece class, while inheriting its methods
    public MinorPiece(byte color){
        // jus tthe constructor for the MinorPiece(like the Bishop or Knight)
        // the paraemeter is teh color of the piece
        super(color);
    }
}