
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class SchachprojektKonsolenversion {

    static Scanner user_input = new Scanner(System.in);

	
    public static void main(String[] args) {
	Chessboard chessboard = new Chessboard();
        String input;

        
        
	while (chessboard.getGameRunning()) {
            chessboard.printBoard();
            chessboard.move();
            
            /*
            try {
                ServerSocket ss = new ServerSocket(4800);
                Socket s = ss.accept();
                InputStreamReader isr = new InputStreamReader(s.getInputStream());
                BufferedReader br = new BufferedReader(isr);
                OutputStreamWriter osw = new OutputStreamWriter(s.getOutputStream());
                BufferedWriter bw = new BufferedWriter(osw);
                
                
                if(chessboard.getWhitesTurnToMove()){
                    chessboard.printBoard();
                    chessboard.move();
                }
                else{
                    bw.write("Inputrequest");
                    
                    for(input = br.readLine(); input == null; input = br.readLine()) {
                        if(input != null){
                            chessboard.setMove(input);
                        }
                    }
                    chessboard.printBoard();
                    chessboard.move();
                }
                br.close();
                isr.close();
                s.close();
                ss.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            */
	}
    }
}