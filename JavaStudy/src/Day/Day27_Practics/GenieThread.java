package Day.Day27_Practics;

import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GenieThread
{
    public void dataCollection()
    {
        List<Music> musicList = new ArrayList<>();
        // 1페이지 당 스레드를 이용해서 저장
        Thread[] threads = new Thread[4];
        for (int i = 0; i < threads.length; i++)
        {
            final int page = i + 1;
            threads[i] = new Thread(new Runnable()
            {
                List<Music> temp = new ArrayList<>();

                @Override
                public void run()
                {
                    try
                    {
                        Document doc = Jsoup.connect(
                                "https://www.genie.co.kr/chart/top200?ditc=D&ymd=20261117&hh=14&rtm=Y&pg=" + page)
                                .get();
                        Elements title = doc.select("table.list-wrap a.title");
                        Elements artist = doc.select("table.list-wrap a.artist");
                        Elements album = doc.select("table.list-wrap a.albumtitle");
                        Elements poster = doc.select("table.list-wrap a.cover img");

                        for (int i = 0; i < title.size(); i++)
                        {
                            Music music = new Music();
                            music.setMno(i + 1);
                            music.setTitle(title.get(i).text());
                            music.setArtist(artist.get(i).text());
                            music.setAlbum(album.get(i).text());
                            music.setPoster(poster.get(i).attr("src"));
                            temp.add(music);
                        }
                    } catch (Exception ex)
                    {
                        ex.printStackTrace();
                    }

                    synchronized (musicList)
                    {
                        musicList.addAll(temp);
                    }
                }
            });
        }
        for (Thread t : threads)
        {
            t.start();
        }
        for (Thread t : threads)
        {
            try
            {
                t.join();
            } 
            catch (Exception e)
            {
                Thread.currentThread().interrupt();
                return;
            }
        }
        musicList.sort(Comparator.comparingInt(Music::getMno));
        System.out.println("전체 수집 완료 : " + musicList.size() + "곡");

        for (Music m : musicList)
        {
            System.out.println(m);
        }
    }
    
    public static void main(String[] args)
    {
        new GenieThread().dataCollection();
    }
}
