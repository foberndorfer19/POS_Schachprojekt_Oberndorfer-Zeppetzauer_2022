public class Farmer extends Piece{
    private boolean hasMoved = false;

    public Farmer(int xCoordinate, int yCoordinate, int value, int[][] board) {
        super(xCoordinate, yCoordinate, value, board);
    }

    public boolean canMove(int x,int y){
        if(!hasMoved){
            if(getxCoordinate() == x && getyCoordinate() == y+2 && board[x][y+2] == 0 ){
                return true;
            }else if(getxCoordinate() == x && getyCoordinate() == y+1 && board[x][y+1] == 0 ){
                return true;
            }
            else{
                return false;
            }
        }else if(getxCoordinate() == x && getyCoordinate() == y+1 && board[x][y+1] == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean move(int x,int y){
        if(canMove(x, y)){
            setxCoordinate(x);
            setyCoordinate(y);
            
            return true;
        }else{
            return false;
        }
    }
}
