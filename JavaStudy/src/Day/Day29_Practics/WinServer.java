package Day.Day29_Practics;

import java.io.*;
import java.net.*;
import java.util.Vector;

public class WinServer implements Runnable
{
    private Vector<Client> waitVc = new Vector<>();
    private ServerSocket serverSocket;
    private final int PORT = 3355;

    public WinServer()
    {
        try
        {
            serverSocket = new ServerSocket(PORT);
        } 
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    @Override
    public void run()
    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

    class Client extends Thread
    {

    }

}
