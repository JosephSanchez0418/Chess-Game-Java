public class Knight extends MinorPiece{
// Class extends to minorpiece, and inherits its methods
    public Knight(byte color){
        super(color);
    }

// return "N" for knight
    public String getLetter() {
        return "N";
    }

    public byte getValue(){
    // value 3 is for White pieces, and -3 for black pieces
        return (byte) (getColor() == 1 ? 3 : -3);
    }
}