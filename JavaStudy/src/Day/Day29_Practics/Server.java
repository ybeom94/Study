// package Day.Day29_Practics;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.io.OutputStream;
// import java.net.*;
// import java.nio.charset.StandardCharsets;
// import java.util.concurrent.Executors;
// import java.util.concurrent.ScheduledExecutorService;
// import java.util.concurrent.ScheduledFuture;
// import java.util.concurrent.TimeUnit;
// import java.util.concurrent.atomic.AtomicInteger;

// public class Server implements Runnable
// {
//     private ServerSocket sSocket;
//     private final int PORT = 11111;

//     ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

//     // 1. 서버 => 대기
//     // 한 컴퓨터에서 서버는 한번만 수행
//     public Server()
//     {
//         try
//         {
//             // bind => ip + port
//             // listen => 대기
//             sSocket = new ServerSocket(PORT);
//             System.out.println("Server Start");
//         } catch (Exception ex)
//         {
//             ex.printStackTrace();
//         }
//     }
    
//     // 클라이언트 접속 대기
//     @Override
//     public void run()
//     {
//         while (true)
//         {
//             try
//             {
//                 Socket socket = sSocket.accept();
//                 // 접속시에 누구 접속 했는지 확인 => Socket 안에 IP
//                 System.out.println("Clinet IP : " + socket.getInetAddress().getHostAddress());
//                 System.out.println("Client PORT : " + socket.getPort());

//                 // 접속자의 메세지 받기
//                 BufferedReader bReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//                 // 접속자에게 응답
//                 OutputStream out = socket.getOutputStream();

//                 //String msg = bReader.readLine();
//                 //System.out.println("받은 메세지 : " + msg);
//                 //out.write(("서버 입니다. 받은 메세지 : " + msg + "\n").getBytes());

//                 // out.write("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★\n".getBytes());
//                 AtomicInteger count = new AtomicInteger(0);

//                 ScheduledFuture<?> task = scheduler.scheduleAtFixedRate(() ->
//                 {
//                     try
//                     {
//                         String msg = count.getAndIncrement() % 2 == 0
//                             ? "☆★☆★☆★☆★☆★☆★☆★☆★"
//                             : "★☆★☆★☆★☆★☆★☆★☆";

//                         // 클라이언트 콘솔 화면 초기화
//                         String clear = "\u001B[2J\u001B[H";

//                         out.write((clear + "서버 응답 : " + msg + "\n")
//                         .getBytes(StandardCharsets.UTF_8));

//                         out.flush();
//                     }
//                     catch (IOException e)
//                     {
//                         e.printStackTrace();
//                     }
//                 }, 0, 1, TimeUnit.SECONDS);

//             } 
//             catch (Exception ex)
//             {
//                 ex.printStackTrace();
//             }    
//         }
//     }

//     public static void main(String[] args)
//     {
//         Server server = new Server();
//         new Thread(server).start();
//     }
// }
