package Day;

import java.util.Scanner;

enum GameState
{
    Lobby(0),
    Fight(1),
    Rest(2);

    int index;
    GameState(int index)
    {
        this.index = index;
    }
    int GetIndex()
    {
        return index;
    }
}

class Player
{
    String name;
    int level = 1;
    double hp = 100;
    double attack = 10;
    double defense = 1;

    void SetPlayerName(String name)
    {
        this.name = name;
    }

    void Levelup()
    {
        level++;
        Stat.SetPlayerStat(this);
    }
}

class Monster
{
    String name;
    int level;
    double hp;
    double attack;
    double defense;

    Monster(int playerLevel)
    {
        String[] namePool = new String[]{"피카츄", "파이리", "꼬부기", "버터플", "야도란", "피죤투", "또가스"};
        int rand = (int)(Math.random() * namePool.length);
        name = namePool[rand];

        level = (int)(Math.random() * (playerLevel + 5)) + 1;
        Stat.SetMonsterStat(this);
    }
}

class Stat
{
    final static double playerHpRate = 10;
    final static double playerAttackRate = 1;
    final static double playerDefenseRate = 0.2;

    final static double monsterHpRate = 5;
    final static double monsterAttackRate = 0.5;
    final static double monsterDefenseRate = 0.1;

    static void SetPlayerStat(Player player)
    {
        int level = player.level;
        
        player.hp += (playerHpRate * level);
        player.attack += (playerAttackRate * level);
        player.defense += (playerDefenseRate * level);
    }

    static void SetMonsterStat(Monster monster)
    {
        int level = monster.level;
        
        monster.hp += (monsterHpRate * level);
        monster.attack += (monsterAttackRate * level);
        monster.defense += (monsterDefenseRate * level);
    }
}

public class Game_MethodPractice
{
    public static void main(String[] args)
    {
        Player player = new Player();
        Scanner scanner = new Scanner(System.in, "MS949");
        System.out.print("이름 : ");
        player.SetPlayerName(scanner.next());
        clearConsole();

        int choice = ActionCase();
        switch (choice)
        {
            case 1:
                break;

            case 2:
                break;
            
            default:
                break;
        }

    }

    static GameState ActionCase()
    {
        System.out.println("1. 전투\t\t 2.휴식");
        System.out.print("어떤 활동을 하시겠습니까? : ");
        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();
        if (!(choice == 1 || choice == 2))
        {   
            clearConsole();
            System.out.println("잘못 입력하셨습니다.");
            choice = ActionCase();
        }
        clearConsole();
        return choice;
    }

    static void clearConsole()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
