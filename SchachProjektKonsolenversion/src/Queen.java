
import java.util.ArrayList;
import java.util.List;

public class Queen extends AbstractPiece implements Movable {

  private Movable bishop;
  private Movable rook;


  public Queen(PieceColor pieceColor) {
    this(pieceColor, new Bishop(pieceColor), new Rook(pieceColor));
  }

  public Queen(PieceColor pieceColor, Movable bishop, Movable rook) {
    super(pieceColor);
    this.name = "Queen";
    this.bishop = bishop;
    this.rook = rook;
  }

  @Override
  public List<Location> getValidMoves(Board board) {
    List<Location> moveCandidates = new ArrayList<>();
    moveCandidates.addAll(bishop.getValidMoves(board, this.getCurrentSquare()));
    moveCandidates.addAll(rook.getValidMoves(board, this.getCurrentSquare()));
    return moveCandidates;
  }

  @Override
  public List<Location> getValidMoves(Board board, Square square) {
    return null;
  }

  @Override
  public void makeMove(Square square) {
    this.currentSquare.setOccupied(false);
    this.setCurrentSquare(square);
    square.setCurrentPiece(this);
    square.setOccupied(true);
  }
}