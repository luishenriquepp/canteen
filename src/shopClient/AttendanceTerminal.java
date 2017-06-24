package shopClient;

import java.net.Socket;
import shopServer.Server;

public class AttendanceTerminal extends Terminal implements Runnable {
    private Thread thread;
    
    public AttendanceTerminal(Server server, Socket socket) {
        super(server,socket);
    }
    
    @Override
    public void run() {
        while (this.isRunning()) {
            
        }
    }   

    @Override
    public void start() {
        this.thread = new Thread(this);
        this.thread.start();
    }

}
