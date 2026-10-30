package Day.Day15_Practics;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GenieMusic extends MusicSystem
{
    public GenieMusic()
    {
        try
        {
            Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
            Elements title = doc.select("table.list-wrap a.title");
            Elements artist = doc.select("table.list-wrap a.artist");
            Elements album = doc.select("table.list-wrap a.albumtitle");
            Elements poster = doc.select("table.list-wrap a.cover img");
            //Elements rank = doc.select("table.list-wrap td.number");
            Elements etc = doc.select("table.list-wrap span.rank");

            for (int i = 0; i < title.size(); i++)
            {   
                MusicVO musicVO = new MusicVO();
                musicVO.setRank(i + 1);
                musicVO.setTitle(title.get(i).text());
                musicVO.setArtist(artist.get(i).text());
                musicVO.setAlbum(album.get(i).text());

                String temp = etc.get(i).text();
                String state = "";
                int id = 0;
                if (temp.equals("유지"))
                {
                    id = 0;
                    state = "유지";
                }
                else
                {
                    id = Integer.parseInt(temp.replaceAll("[^0-9]", ""));
                    state = temp.replaceAll("[^가-힣]", "");
                }
                musicVO.setIdcrement(id);
                musicVO.setState(state);

                AddMusicToList(musicVO);

                // int id = 0;
                // if (temp.equals("유지"))
                // {
                //     id = 0;
                //     state = "유지";
                // }
                // else
                // {
                //     id = Integer.parseInt(temp.replaceAll("[^0-9]", ""));
                //     state = temp.replaceAll("[^가-힣]", "");
                // }
                // music[i].setState(state);
                // music[i].setId(id);


                // String temp = etc.get(i).text();
                // System.out.println(temp.replaceAll("[^0-9]", ""));
                // System.out.println(temp.replaceAll("[^가-힣]", ""));
                // System.out.println
                // (
                //     title.get(i).text() + " " +
                //     artist.get(i).text() + " " +
                //     poster.get(i).attr("src") + " " + 
                //     album.get(i).text() + " " +
                //     //rank.get(i).text() + " " +
                //     temp.replaceAll("[^0-9]", "") + " " +
                //     temp.replaceAll("[^가-힣]", "") + " "
                //     //etc.get(i).text()
                // );
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
