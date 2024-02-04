import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class ConcretePiece implements Piece {

    private String type;
    private ConcretePlayer owner;
    protected int number;
    private List<Position> historyPiece = new ArrayList<>();

    public ConcretePiece(ConcretePlayer owner, String type) {
        this.type = type;
        this.owner = owner;
    }
    public String getType() {
        return type;
    }

    public Player getOwner() {
        return owner;
    }
    public void setNumber(int number){
        this.number= number;
    }
    public void addHistory(Position p){
        this.historyPiece.add(p);
    }
    public List<Position> getHistory(){
        return historyPiece;
    }

    @Override
    public String toString() {
        if(owner.isPlayerOne())
            return "D"+number+":";
        else
            return "A"+number+":";
    }
}
