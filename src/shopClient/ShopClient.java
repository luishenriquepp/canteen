package shopClient;

import java.net.*;
import java.io.*;

public class ShopClient {  
    private Socket socket = null;

   public ShopClient(String serverName, int serverPort) {  
        System.out.println("Establishing connection. Please wait ...");
      
        try {  
            socket = new Socket(serverName, serverPort);
            System.out.println("Connected: " + socket);
        } catch(UnknownHostException uhe) {  
            System.out.println("Host unknown: " + uhe.getMessage());
        } catch(IOException ioe) {  
            System.out.println("Unexpected exception: " + ioe.getMessage());
        }
      
        while (true) {  
            try {  
                ObjectOutputStream os = new ObjectOutputStream(socket.getOutputStream());
                os.writeObject(12.5);
            }
            catch(IOException ioe) {  
                System.out.println("Sending error: " + ioe.getMessage());
            }
        }
    }   
    
    public static void main(String args[]) {  
        ShopClient client = new ShopClient("localhost", 4200);
    }
}