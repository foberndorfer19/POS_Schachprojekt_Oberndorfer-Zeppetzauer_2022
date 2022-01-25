public abstract class Piece {
    private int xCoordinate;
    private int yCoordinate;
    protected int value;
    protected int[][] board;
    
    public Piece(int xCoordinate, int yCoordinate, int value, int[][] board) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.value = value;
        this.board = board;
    }
    
    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

}