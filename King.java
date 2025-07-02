public class King extends Piece{
// this class extends to the piece class
    public King(byte color){
        super(color);
    }
    
    // Returns the letter "K" for king
    public String getLetter(){
        return "K";
    }

    // will return the value for king
    public byte getValue(){
        return (byte) (getColor() == 1 ? 1 : -1);
    }
}