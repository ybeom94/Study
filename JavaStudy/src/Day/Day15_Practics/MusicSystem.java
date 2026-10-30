package Day.Day15_Practics;

import java.util.ArrayList;

enum SearchType
{
    Rank,
    Title,
    Artist,
}

public class MusicSystem
{
    private static ArrayList<MusicVO> musicVOList = new ArrayList<>();

    public MusicSystem()
    {
        removeMusicList();
    }

    public void AddMusicToList(MusicVO musicVO)
    {
        musicVOList.add(musicVO);
    }

    public void SetMusicListData(MusicVO[] musicVOs)
    {
        for (MusicVO vo : musicVOs)
        {
            musicVOList.add(vo);
        }
    }

    public ArrayList<MusicVO> musicListData()
    {
        return musicVOList;
    }

    public MusicVO[] searchByTitle(String title)
    {
        ArrayList<MusicVO> list = new ArrayList<>();
        for (MusicVO vo : musicVOList)
        {
            if (vo.getTitle().contains(title))
            {
                list.add(vo);
            }
        }
        return list.toArray(new MusicVO[0]);
    }

    public void removeMusicList()
    {
        musicVOList.removeAll(musicVOList);
    }

    // public MusicVO[] musicSearchByArtist(String artist)
    // {

    // }
}
