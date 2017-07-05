package shopServer;

import java.net.Socket;

public class AttendanceThread extends TerminalThread implements Runnable {
    private Thread thread;
    
    public AttendanceThread(Server server, Socket socket) {
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
