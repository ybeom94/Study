package Day.Day24_Practics;

import java.util.ArrayList;
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GenieMusic extends MusicSystem
{
    @Override 
    public void dataCollection()
    {
        ArrayList<Music> list = getMusicList();

        try
        {
            Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
            Elements title = doc.select("table.list-wrap a.title");
            Elements artist = doc.select("table.list-wrap a.artist");
            Elements poster = doc.select("table.list-wrap a.cover img");
        }
        catch(Exception ex)
        {

        }
    }
}
