
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;



public class SchachClient {
    public static void main(String[] args) {
        boolean run = true;
        String input;
        Scanner user_input = new Scanner(System.in);
        
        while(run){
        try{
            Socket s = new Socket("localhost", 4800);
            OutputStreamWriter osw = new OutputStreamWriter(s.getOutputStream());
            BufferedWriter bw = new BufferedWriter(osw);
            InputStreamReader isr = new InputStreamReader(s.getInputStream());
            BufferedReader br = new BufferedReader(isr);
            
            input = br.readLine();
            if(input != null){
                if(input.equals("Inputrequest")){
                    System.out.println("Your turn:");
                    String in = user_input.nextLine();
                    bw.write(in);
                    bw.newLine();
                }
                else if(input.equals("exit")){
                    bw.close();
                    osw.close();
                    s.close();
                }
            }
            
        }catch(Exception e) {
            e.printStackTrace();
        }
        }
    }
}
