public class Pawn extends ConcretePiece{
    private int kills;
    public Pawn(ConcretePlayer owner) {
        super(owner, "♟");
    }
    public void kill(){kills++;}

}
