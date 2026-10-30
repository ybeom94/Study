package Day.Day15_Practics;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class MelonMusic extends MusicSystem
{
    public MelonMusic()
    {
        try
        {
            Document doc = Jsoup.connect("https://www.melon.com/chart/index.htm").get();
            Elements title = doc.select("tr#lst50 div.rank01 a");
            Elements artist = doc.select("tr#lst50 div.rank02 span.checkEllipsis");
            Elements album = doc.select("tr#lst50 div.rank03 a");
            Elements poster = doc.select("tr#lst50 div.wrap img");
            //Elements rank = doc.select("table.list-wrap td.number");
            Elements etc = doc.select("tr#lst50 div span.rank_wrap");

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
                if (temp.equals("순위 동일"))
                {
                    id = 0;
                    state = "순위 동일";
                }
                else
                {
                    id = Integer.parseInt(temp.replaceAll("[^0-9]", ""));
                    state = temp.replaceAll("[^가-힣]", "");
                }
                musicVO.setIdcrement(id);
                musicVO.setState(state);

                AddMusicToList(musicVO);

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
