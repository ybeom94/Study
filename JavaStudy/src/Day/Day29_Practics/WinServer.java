package Day.Day29_Practics;

import java.io.*;
import java.net.*;
import java.util.Vector;

public class WinServer implements Runnable
{
    private Vector<Client> waitVc = new Vector<>();
    private ServerSocket serverSocket;
    private final int PORT = 11111;

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
        try
        {
            while (true)
            {
                Socket socket = serverSocket.accept(); // 클라이언트 접속시에만 호출
                Client client = new Client(socket);
                waitVc.add(client);
                // 각 접속자마다 통신 시작
                client.start();
            }
        } catch (Exception ex)
        {

        }
    }
    
    public static void main(String[] args)
    {
        WinServer server = new WinServer();
        new Thread(server).start();
    }

    class Client extends Thread
    {
        // 독립적인 통신 => 접속자 IP => Socket
        Socket socket;
        OutputStream out;
        BufferedReader in;

        public Client (Socket socket)
        {
            try
            {
                this.socket = socket;
                out = socket.getOutputStream();
                in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 요청 받는 통로
            } 
            catch (Exception ex)
            {
                
            }
        }

        public void run()
        {
            try
            {
                while (true)
                {
                    // 접속자의 요청을 받는다
                    String msg = in.readLine();
                    for (Client c : waitVc)
                    {
                        c.out.write((msg + "\n").getBytes());
                    }
                }
            } 
            catch (Exception ex)
            {
                
            }
        }
    }

}
