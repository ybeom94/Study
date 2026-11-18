package Day;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.net.*;

import Day.Day27_Practics.GenieThreadPool;
import Day.Day27_Practics.Music;

public class Day28
{
    public static void main(String[] args)
    {
        // IO
        // => 반드시 입출력 통로 따로 만들어서 제어 / Stream => 단방향
        // 1byte => InputStream => 이미지, PDF ...
        // 2byte => Reader => txt, csv, ...

        //보조 스트림
        // BufferedInputStream
        // BufferedReader

        // 변환하는 클래스
        // InputStreamReader : 1byte를 2byte로 변환

        // try
        // {
        //     // 폴더 지정 => 모든 파일 정보 읽기
        //     File dir = new File("C:\\Users\\sist\\Desktop\\Study");
        //     // 폴더 안에 있는 모든 파일을 읽어 와라
        //     File[] list = dir.listFiles();
        //     for (File f : list)
        //     {
        //         if (f.isFile())
        //         {
        //             String len = f.length() / 1000 > 0 ? (f.length() / 1000) + "KB" : f.length() + "Bytes";
        //             System.out.println(f.getName() + " " + len);
        //         }
        //         if (f.isDirectory())
        //         {
        //             System.out.println(f.getName() + " DIR");
        //         }
        //     }
        // } 
        // catch (Exception e)
        // {
        //     e.printStackTrace();
        // }

        try
        {
            // File dir = new File("c:\\upload");
            // if (!dir.exists())
            // {
            //     dir.mkdir();
            // }
            // else
            // {
            //     System.out.println("이미 존재하는 폴더입니다.");
            // }

            // File file = new File("c:\\upload\\student.txt");
            // if (!file.exists())
            // {
            //     file.createNewFile();
            //     System.out.println("파일 생성 완료.");
            // }
            // else
            // {
            //     System.out.println("이미 파일이 존재합니다.");
            // }

            // File dir = new File("c:\\upload\\data\\data1\\data2");
            // if (!dir.exists())
            // {
            //     dir.mkdirs();
            //     System.out.println("폴더 생성 완료.");
            // }
            // else
            // {
            //     System.out.println("이미 존재하는 폴더입니다.");
            // }

            // File dir = new File("c:\\upload\\data\\data1\\data2");
            // if (dir.exists())
            // {

            //     dir.delete();
            //     System.out.println("폴더 삭제 완료.");
            // }
            // else
            // {
            //     System.out.println("폴더 존재하지 않습니다.");
            // }

            // File[] list = dir.listFiles();
            // for (File f : list)
            // {
            //     f.delete();
            // }
            // dir.delete();

            // String path = "c:\\java_data\\sawon.txt";
            // File dir = new File("c:\\java_data");
            // if (dir.exists())
            // {
            //     File file = new File(path);
            //     if (file.createNewFile())
            //     {
            //         System.out.println("sawon.txt 파일 생성.");
            //     }
            // }
            // else
            // {
            //     if (dir.mkdir())
            //     {
            //         File file = new File(path);
            //         if (file.createNewFile())
            //         {
            //             System.out.println("sawon.txt 파일 생성.");
            //         }
            //     }
            // }
            // // 파일 쓰기
            // FileOutputStream fos = new FileOutputStream(path, true);
            // // create
            // String hong = "1|홍길동|개발부|대리|4000\n";
            // fos.write(hong.getBytes());
            // fos.close();
            // System.out.println("파일 쓰기 완료");
            // // 파일 읽기
            // FileInputStream fis = new FileInputStream(path);
            // int i = 0;
            // // while ((i = fis.read()) != -1)
            // // {
            // //     System.out.print((char) i);
            // // }
            // byte[] buffer = fis.readAllBytes();
            // System.out.println(Arrays.toString(buffer));
            // fis.close();

            // FileInputStream fis = new FileInputStream("");
            // FileOutputStream fos = new FileOutputStream("");
            // byte[] buffer = new byte[1024]; // 지정된 바이트 크기를 모아서 한번에 전송
            // int i = 0;
            // while ((i = fis.read(buffer, 0, 1024)) != -1)
            // {
            //     fos.write(buffer, 0, i);
            // }
            // fis.close();
            // fos.close();

            // 글자 => FileWriter
            // 사진 => FileOutputStream
            // 숫자 => DataOutputStream
            // 객체 => ObjectOutputStream

            // try
            // {
            //     File file = new File("c:\\java_data\\genie.txt");
            //     if (!file.exists())
            //     {
            //         file.createNewFile();
            //     }
            //     GenieThreadPool genie = new GenieThreadPool();
            //     genie.dataCollection();
            //     FileWriter fw = new FileWriter(file, true);
            //     for (Music m : GenieThreadPool.getMusicList())
            //     {
            //         String data = m.getMno() + "|" + m.getTitle() + "|" + m.getArtist() + "|" + m.getAlbum() + "|"
            //                 + m.getPoster() + "\r\n";
            //         fw.write(data);
            //     }
            //     fw.close();
            //     System.out.println("데이터 수집 완료.");
            // } 
            // catch (Exception e)
            // {
            //     e.printStackTrace();
            // }

            // StringBuffer buffer = new StringBuffer();
            // FileReader reader = new FileReader("c:\\java_data\\genie.txt");
            // int i = 0;
            // while ((i = reader.read()) != -1)
            // {
            //     //System.out.print((char)i);
            //     buffer.append((char)i);
            // }
            // reader.close();
            // System.out.println(buffer.toString());
            // String[] musics = buffer.toString().split("\n");
            // for (String m : musics)
            // {
            //     String[] music = m.split("\\|");
            //     System.out.println("번호 : " + music[0]);
            //     System.out.println("곡명 : " + music[1]);
            //     System.out.println("가수명 : " + music[2]);
            //     System.out.println("앨범 : " + music[3]);
            //     System.out.println("이미지 : " + music[4]);
            //     System.out.println("==========================");
            // }

            // 문자
            // BufferedWritter => write(String), newLine(), close()
            // BufferedReader => read(), readLine(), close()

            // 바이트
            // BufferedInputStream
            // BufferedOutputStream

            // BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
            // System.out.print("입력 : ");
            // String msg = bReader.readLine();
            // System.out.println(msg);

            // FileReader reader = new FileReader("");
            // int i = 0;
            // long start = System.currentTimeMillis();
            // while ((i = reader.read()) != -1)
            // {
            //     System.out.println((char) i);
            // }
            // long end = System.currentTimeMillis();
            // reader.close();
            // System.out.println("총 수행시간 : " + (end - start) + "MS");

            // BufferedReader bReader = new BufferedReader(new InputStreamReader(new FileInputStream("")));
            // long start1 = System.currentTimeMillis();
            // while (true)
            // {
            //     String msg = bReader.readLine();
            //     if (msg == null)
            //     {
            //         break;
            //     }
            //     System.out.printf(msg);
            // }
            // bReader.close();
            // long end1 = System.currentTimeMillis();
            // System.out.println("총 수행시간 : " + (end1 - start1) + "MS");

            URI uri = new URI("");
            URL url = uri.toURL();
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            //웹 연결
            if (connection != null)
            {
                BufferedReader bReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

                while (true)
                {
                    String json = bReader.readLine();
                    if (json == null)
                    {
                        break;
                    }
                    System.out.println(json);
                }
                bReader.close();
            }




        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    
    
    
    }
}
