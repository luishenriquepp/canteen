package shopServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import shopManager.Menu;
import shopManager.ShopManager;

public class Server implements Runnable {
    private List<TerminalThread> clients;
    private ServerSocket server;
    private final ShopManager shop = new ShopManager();

    @Override
    public void run() {
        try {
            this.server = new ServerSocket(4200);
            this.clients = new ArrayList<>();
            
            while (true) {
                try {  
                    System.out.println("Waiting for a client");                 
                    addClient(server.accept());
                }
                catch(IOException ioe) {  
                    System.out.println("Server accept error: " + ioe); 
                }
            }            
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void addClient(Socket socket) throws IOException {
        System.out.println("Client accepted: " + socket);
        ClientThread client = new ClientThread(this,socket);
        this.clients.add(client);
        client.start();
    }
    
    public synchronized void sendMenu(int id, String input) {  
        this.inputLog(id);
        try {
            Menu menu = this.shop.getMenu();
//            TODO
//            send the menu to client
//            serialize/deserialize
        } catch (Exception e) {
            
        }
    }
    
    public synchronized void enqueue(int id, String input) {
        this.inputLog(id);
        try {
            this.shop.add(null);
        } catch (Exception e) {
            
        }
    }
    
    public synchronized void dispatchOrder(int id, String input) {  
        this.inputLog(id);
        try {
            this.shop.retrieve();
        } catch (Exception e) {
            
        }
    }
        
    private TerminalThread findClient(int id) {
        for(int i=0; i<this.clients.size();i++) {
            if(this.clients.get(i).getId() == id)
               return this.clients.get(i);
        }
        return null;
    }
    
    private void inputLog(int id) {
        System.out.println("Server receiving request from client: "+id);
    }
    
    public static void main(String[] args) {
        Server server = new Server();
        server.run();
    }
}
