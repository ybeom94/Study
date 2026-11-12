package Day.Day24_Practics;

import java.net.URI;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public abstract class MusicSystem
{
    final int ROWSIZE = 10;

    private static ArrayList<Music> mList = new ArrayList<>();
    
    public abstract void dataCollection();

    public ArrayList<Music> musicList(int page)
    {
        int start = ROWSIZE * (page - 1);
        int end = ROWSIZE * page;

        return new ArrayList<Music>(mList.subList(start, end));
    }

    public ArrayList<Music> getMusicList()
    {
        return mList;
    }

    public Music musicDetailData(int mNo)
    {
        return mList.get(mNo - 1);
    }

    public static String youtubeFindKey(String title)
    {
        String key = "";
        try
        {
            String url = "https://www.youtube.com/results?search_query=" + URLEncoder.encode(title, "UTF-8");
            Document doc = Jsoup.connect(url).get();
            Pattern pattern = Pattern.compile("/watch\\?v=[^가-힣]+");
            Matcher matcher = pattern.matcher(doc.toString());
            while (matcher.find())
            {
                String str = matcher.group();
                key = str.substring(str.indexOf("=") + 1, str.indexOf(("\"")));
                key = key.substring(0, key.indexOf("\\"));
                System.out.println(key);
                break;
            }
        }
        catch (Exception ex)
        {
            
        }
        return key;
    }

    public static void main(String[] args) {
        youtubeFindKey("리센느");
    }
}
