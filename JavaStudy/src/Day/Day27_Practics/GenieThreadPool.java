package Day.Day27_Practics;

import java.util.*;
import java.util.concurrent.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import lombok.Getter;
import lombok.Setter;

public class GenieThreadPool
{
    @Getter 
    private static List<Music> musicList = new ArrayList<>();
    private final int threadNum = 4;

    public void dataCollection()
    {
        ExecutorService service = Executors.newFixedThreadPool(threadNum);
        List<Future<List<Music>>> futures = new ArrayList<>();
        // Future => 결과값 관리, 결과 보관 장소
        // submit() => 작업 등록, 스레드 동작
        // get() => 작업 결과 갖고 오기
        // shutdown() => 작업 정리, 종료

        for (int i = 1; i <= 4; i++)
        {
            final int page = i;
            // 데이터 저장
            Future<List<Music>> future = service.submit(new Callable<List<Music>>()
            {
                @Override
                public List<Music> call() throws Exception
                {
                    List<Music> temp = new ArrayList<>();
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
                    return temp;
                }
            });
            futures.add(future);
        }
        for (Future<List<Music>> future : futures)
        {
            try
            {
                List<Music> temp = future.get();
                musicList.addAll(temp);
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        for (Music m : musicList)
        {
            System.out.println(m.getMno() + " " + m.getTitle() + " " + m.getArtist());
        }
        service.shutdown();
    }

    public static void main(String[] args)
    {
        long start = System.currentTimeMillis();
        new GenieThreadPool().dataCollection();
        long end = System.currentTimeMillis();
        System.out.println("총 걸린 시간 : " + (end - start));
    }
}
