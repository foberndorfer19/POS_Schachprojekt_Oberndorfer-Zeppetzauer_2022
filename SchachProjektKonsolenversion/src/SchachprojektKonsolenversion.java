
import java.util.Scanner;

public class SchachprojektKonsolenversion {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Insert Opponent IP:");
        String ip = userInput.nextLine();
        
        Connection connection = new Connection(ip);
        
        Board board = new Board();
        board.printBoard();
        
        
    }
}