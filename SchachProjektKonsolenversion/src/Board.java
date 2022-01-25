public class Board {
    int board[][] = new int[8][8];
    

    public Board() {
        
        
        //Place black pieces
        for(int i = 0;i<8;i++){
            board[1][i] = 1;
        }
        for(int i = 0;i<8;i++){
            switch(i){
                case 0:
                    board[0][i] = 2;
                    break;
                case 1:
                    board[0][i] = 3;
                    break;
                case 2:
                    board[0][i] = 4;
                    break;
                case 3:
                    board[0][i] = 5;
                    break;
                case 4:
                    board[0][i] = 6;
                    break;
                case 5:
                    board[0][i] = 4;
                    break;
                case 6:
                    board[0][i] = 3;
                    break;
                case 7:
                    board[0][i] = 2;
                    break;
            }
        }
        
        //Place white pieces
        for(int i = 0;i<8;i++){
            board[6][i] = -1;
        }
        for(int i = 0;i<8;i++){
            switch(i){
                case 0:
                    board[7][i] = -2;
                    break;
                case 1:
                    board[7][i] = -3;
                    break;
                case 2:
                    board[7][i] = -4;
                    break;
                case 3:
                    board[7][i] = -5;
                    break;
                case 4:
                    board[7][i] = -6;
                    break;
                case 5:
                    board[7][i] = -4;
                    break;
                case 6:
                    board[7][i] = -3;
                    break;
                case 7:
                    board[7][i] = -2;
                    break;
            }
        }
    }
    
    public void placePieces(){
        for(int i = 0;i<board.length;i++){
            System.out.print(i+"|");
            for(int j = 0;j<board[i].length;j++){
                switch(board[i][j]){
                    case 0: 
                        break;
                    case 1: Piece farmerB = new Farmer(i,j,board[i][j],board);
                        break;
                    case 2: Piece towerB = new Tower(i,j,board[i][j],board);
                        break;
                    case 3: Piece horseB = new Horse(i,j,board[i][j],board);
                        break;
                    case 4: Piece runnerB = new Runner(i,j,board[i][j],board);
                        break;
                    case 5: Piece queenB = new Queen(i,j,board[i][j],board);
                        break;
                    case 6: Piece kingB = new King(i,j,board[i][j],board);
                        break;
                    case -1: Piece farmerA = new Farmer(i,j,board[i][j],board);
                        break;
                    case -2: Piece towerA = new Tower(i,j,board[i][j],board);
                        break;
                    case -3: Piece horseA = new Horse(i,j,board[i][j],board);
                        break;
                    case -4: Piece runnerA = new Runner(i,j,board[i][j],board);
                        break;
                    case -5: Piece queenA = new Queen(i,j,board[i][j],board);
                        break;
                    case -6: Piece kingA = new King(i,j,board[i][j],board);
                        break;
                }
            }
        }
    }
    
    public void printBoard(){
        for(int i = 0;i<board.length;i++){
            System.out.print(i+"|");
            for(int j = 0;j<board[i].length;j++){
                switch(board[i][j]){
                    case 0: System.out.print("  |");
                        break;
                    case 1: System.out.print("♙|");
                        break;
                    case 2: System.out.print("♖|");
                        break;
                    case 3: System.out.print("♘|");
                        break;
                    case 4: System.out.print("♗|");
                        break;
                    case 5: System.out.print("♕|");
                        break;
                    case 6: System.out.print("♔|");
                        break;
                    case -1: System.out.print("♟|");
                        break;
                    case -2: System.out.print("♜|");
                        break;
                    case -3: System.out.print("♞|");
                        break;
                    case -4: System.out.print("♝|");
                        break;
                    case -5: System.out.print("♛|");
                        break;
                    case -6: System.out.print("♚|");
                        break;
                }
            }
            System.out.println("");
            System.out.println("------------------------");
        }
        System.out.println("1|2|3|4|5|6|7|8");
    }

    public int[][] getBoard() {
        return board;
    }
}
