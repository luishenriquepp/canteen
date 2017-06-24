package shopClient;

import shopServer.Server;
import java.io.IOException;
import java.net.Socket;

public abstract class Terminal {
    private final Socket socket;
    private final Server server;
    private boolean running;
    
    public Terminal(Server server, Socket socket) {
        this.server = server;
        this.socket = socket;
    }
    
    public abstract void start(); 
    
    public void stop() throws IOException {
        running = false;
        socket.close();
    }
    
    public int getId() {
        return this.socket.getPort();
    }
    
    public boolean isRunning() {
        return this.running;
    }
}