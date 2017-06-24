package shopClient;

import java.net.Socket;
import shopServer.Server;

public class ClientTerminal extends Terminal implements Runnable {
    private Thread thread;
    
//  by default the client have 75 bucks
//  we could make it settable
    private final double cash = 75;
    
    public ClientTerminal(Server server, Socket socket) {
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
    public double getCash() {
        return this.cash;
    }
}
