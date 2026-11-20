// package Day.Day29_Practics;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.io.OutputStream;
// import java.net.*;

// public class Clinet
// {
//     public static void main(String[] args)
//     {
//         Socket socket = null;
//         OutputStream out;
//         try
//         {
//             socket = new Socket("192.168.0.31", 11111);
//         } catch (UnknownHostException e)
//         {
//             // TODO Auto-generated catch block
//             e.printStackTrace();
//         } catch (IOException e)
//         {
//             // TODO Auto-generated catch block
//             e.printStackTrace();
//         }
//         System.out.println("서버 접속 완료");
//         while (true)
//         {
//             try
//             {
//                 //out = socket.getOutputStream();
//                 //out.write("Hi Server!!\n".getBytes());

//                 BufferedReader bReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//                 String msg = bReader.readLine();
//                 System.out.println("서버 응답 : " + msg);
//             } 
//             catch (Exception ex)
//             {
//                 ex.printStackTrace();
//             }
//         }
       
//     }
// }
