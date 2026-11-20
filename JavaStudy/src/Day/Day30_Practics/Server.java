package Day.Day30_Practics;

import java.util.*;
import java.net.*;
import java.io.*;

public class Server implements Runnable
{
    // 연결 대기 => 연결 수락 => ServerSocket
    // Socket => 클라이언트 연결
    // 수신 : BufferedReader
    // 송신 : OutputStream

    private ServerSocket serverSocket;
    private final int PORT = 11111;

    private Vector<Client> waitVec = new Vector<>();

    // 서버 구동
    public Server()
    {
        try
        {
            serverSocket = new ServerSocket(PORT);
            System.out.println("Server Start..");
        } catch (Exception e)
        {

        }
    }

    // 접속 시 독립적으로 접속자마다 통신이 가능하게 Thread 생성
    @Override
    public void run()
    {
        try
        {
            while (true)
            {
                Socket socket = serverSocket.accept();
                Client client = new Client(socket);
                // 통신 시작
                client.start();

            }
        } catch (Exception e)
        {

        }
    }
    
    public static void main(String[] args)
    {
        Server server = new Server();
        new Thread(server).start();
    }

    class Client extends Thread
    {
        String id, name, gender;
        Socket socket;
        OutputStream out;
        BufferedReader in;

        public Client(Socket socket)
        {
            try
            {
                this.socket = socket;
                out = socket.getOutputStream();
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            } 
            catch (Exception e)
            {
                
            }
        }

        public void run()
        {
            try
            {
                while (true)
                {
                    String msg = in.readLine();
                    StringTokenizer tokenizer = new StringTokenizer(msg, "|");
                    int protocol = Integer.parseInt(tokenizer.nextToken());
                    switch (protocol)
                    {
                        case Function.LOGIN ->
                        {
                            id = tokenizer.nextToken();
                            name = tokenizer.nextToken();
                            gender = tokenizer.nextToken();

                            messageAll(Function.LOGIN + "|" + id + "|" + name + "|" + gender);
                            messageAll(Function.CHAT + "|[알림 ☞] " + name + "님 입장하셨습니다.");
                            waitVec.add(this);

                            messageTo(Function.MYLOG + "|" + id);
                            for (Client c : waitVec)
                            {
                                messageTo(Function.LOGIN + "|" + c.id + "|" + c.name + "|" + c.gender);
                            }
                        }
                    
                        case Function.CHAT ->
                        {
                            messageAll(Function.CHAT + "|[" + name + "]" + tokenizer.nextToken());
                        }
                        
                        case Function.EXIT ->
                        {
                            messageAll((Function.EXIT + "|" + id));
                            messageAll(Function.CHAT + "|[알림 ☞] " + name + "님 퇴장하셨습니다.");

                            for (Client c : waitVec)
                            {
                                if (c.id.equals(id))
                                {
                                    messageTo(Function.MYEXIT + "|");
                                    waitVec.remove(c);
                                    in.close();
                                    out.close();
                                    break;
                                }
                            }
                        }
                    }
                }
            } 
            catch (Exception e)
            {
                
            }
        }

        // 접속자 개인
        public synchronized void messageTo(String msg)
        {
            try
            {
                out.write((msg + "\n").getBytes());
            } 
            catch (Exception e)
            {
                
            }
        }

        // 접속자 전체
        public synchronized void messageAll(String msg)
        {
            try
            {
                for (Client c : waitVec)
                {
                    c.messageTo(msg);
                }
            } 
            catch (Exception e)
            {
                
            }
        }
    }
    
}
