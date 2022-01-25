public class Connection {
    private String opponentIP;
    private String output;
    private String input;

    public Connection(String opponentIP) {
        this.opponentIP = opponentIP;
        
        
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getInput() {
        return input;
    }
}
