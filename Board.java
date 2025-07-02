public class Board{
// This class represents the chess board. Keeps track of all the pieces in an 8x8 grid
    private static Piece[][] pieces;
    //Static 2D array golding references to Piece objects on the board

    public Board(){
    // constructor starts an empty 8x8 board(with null pieces)
        pieces = new Piece[8][8];
    }

    // this constructor takes an existing 8x8 array of pieces
    // the parameter is the initial board setup
    public Board(Piece[][] pieces){
        Board.pieces = pieces;
    }

    //this places the given piece at the given x,y coordinates (1-based).
    // It maps out to 0-based array indices
    // parameter piece is to place the piece
    // x column numbers are form 1 to 8, same with y row
    public void setPiece(Piece piece, int x, int y){
        pieces[x - 1][y - 1] = piece;
    }

    //this static getter is for the pieces array
    public static Piece[][] getPieces() {
        //the return is a 2D array of pieces.
        return pieces;
    }

    //This calculates the sum of raw piece values currently on the board
    // the return is a double sum of piece values
    public double relativeEvaluation(){
        double sum = 0;
        for (Piece[] row : pieces){
            for (Piece p : row){
                if (p != null) sum += p.getValue();
            }
        }
        return sum;
    }

    //Calculates the sum of adjusted piece values(using computeAdjustedValue)
    // the return is a double sum of adjusted values.
    public double adjustedEvaluation(){
        double sum = 0;
        for(Piece[] row : pieces){
            for (Piece p : row){
                if (p != null) sum += p.computeAdjustedValue();
            }
        }
        return sum;
    }
    
    //Provide a textua summary of board's current state, showing us how many kings,
    // pawns, major pieces, and minor pieces are on the board
    // the return of this is a summary of each, in strings
    public String toString(){
        int king = 0, pawn = 0, major = 0, minor = 0;
        for(Piece[] row : pieces){
            for (Piece p : row){
                if (p != null){
                    if (p instanceof King) king++;
                    else if (p instanceof Pawn) pawn++;
                    else if (p instanceof MajorPiece) major++;
                    else if (p instanceof MinorPiece) minor++;
                }
            }
        }
        return "Board has:\n-King: " + king + "\n-Pawn: " + pawn + "\n-MajorPieces: " + major + "\n-MinorPieces: " + minor;
    }
}