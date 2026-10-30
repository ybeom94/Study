package Day.Day15_Practics;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain
{
    public static void main(String[] args)
    {
        MusicSystem gMusic = new MelonMusic();

        ArrayList<MusicVO> musicList = gMusic.musicListData();
        for (MusicVO vo : musicList)
        {
            System.out.println(vo.getRank() + "." + vo.getTitle() + " " + vo.getArtist());
        }

        // Scanner scanner = new Scanner(System.in, "MS949");
        // System.out.print("제목 입력 : ");

        // MusicVO[] searchMusic = gMusic.searchByTitle(scanner.next());
        // for (int i = 0; i < searchMusic.length; i++)
        // {
        //     System.out.println(searchMusic[i].getTitle());
        // }
    }
}
