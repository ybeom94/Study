package Day;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import lombok.Data;

public class Day14
{
    public static void main(String[] args)
    {
        //
        MovieSystem movieSystem = new MovieSystem();
        Scanner scanner = new Scanner(System.in);

        boolean isExit = false;
        while (!isExit)
        {
            System.out.println("==========Menu==========");    
            System.out.print("1.전체 목록\t2.상세 보기\t3.검색\t4.종료");
            System.out.println("\n======================");
            System.out.print("메뉴 선택 : ");
            int menu = scanner.nextInt();
            switch (menu)
            {
                case 1:
                    //Movie[] movie = 
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    ClearConsole();
                    System.out.println("프로그램 종료");
                    isExit = true;
                    break;
            
                default:
                    break;
            }
        }

        



    }

    public static void ClearConsole()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

@Data 
class Movie
{
    private int index;
    private String title;
    private String genre;
    private String poster;
    private String actor;
    private String regdate;
    private String grade;
    private String director;

    Movie(int index, String title, String genre, String poster, String actor, String regdate, String grade, String director)
    {
        this.index = index;
        this.title = title;
        this.genre = genre;
        this.poster = poster;
        this.actor = actor;
        this.regdate = regdate;
        this.grade = grade;
        this.director = director;
    }
}

class MovieSystem
{
    private static ArrayList<Movie> movieList = new ArrayList<>();

    // static 
    // {

    // }
    MovieSystem()
    {
        try
        {
            FileReader reader = new FileReader("C:\\Users\\sist\\Desktop\\Study\\movie.txt");
            StringBuffer buffer = new StringBuffer();
            int i = 0;
            while ((i = reader.read()) != -1)
            {
                buffer.append((char)i);
            }
            reader.close();
            // System.out.println(buffer.toString());
            String[] movieArr = buffer.toString().split("\n");

            for (String movieStr : movieArr)
            {   
                String[] str = movieStr.split("\\|");
                Movie movie = new Movie(Integer.parseInt(str[0]), str[1], str[2], str[3], str[4], str[5], str[6], str[7]);
                movieList.add(movie);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void AddMovie(Movie movie)
    {
        movieList.add(movie);
    }

    public Movie GetMovie(int index)
    {
        return movieList.get(index - 1);
    }

    public Movie GetMovie(String title)
    {
        for (Movie m : movieList)
        {
            if (m.getTitle() == title)
            {
                return m;
            }
        }
        return null;
    }

    public Movie[] GetMovieList(String find)
    {
        ArrayList<Movie> tempList = new ArrayList<>();
        for (Movie m : movieList)
        {
            if (m.getTitle().contains(find))
            {
                tempList.add(m);
            }
        }
        return tempList.toArray(new Movie[0]);
    }
}

class User
{
    
}