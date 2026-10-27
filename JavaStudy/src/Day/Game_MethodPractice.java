package Day;

import java.util.Scanner;

class Unit
{
    String name;
    int level;
    double hp;
    double attack;
    double defense;

    public void PrintUnitStat()
    {
        System.out.println(name + "\tLv : " + level + "\nHp : " + hp + "\tAttack : " + attack + "\tDefense : " + defense);
    }

    public void GetDamage(double damage)
    {
        this.hp -= damage * defense;
    }
}

class Player extends Unit
{   
    final static double playerHpRate = 10;
    final static double playerAttackRate = 1;
    final static double playerDefenseRate = 0.1;

    Player(String name)
    {
        this.name = name;
        level = 1;
        hp = 100;
        attack = 10;
        defense = 1;
    }

    void Levelup()
    {
        level++;
        SetPlayerStat();
    }

    void SetPlayerStat()
    {
        hp += (playerHpRate * level);
        attack += (playerAttackRate * level);
        defense += (playerDefenseRate * level);
    }
}

class Monster extends Unit
{   
    final static double monsterHpRate = 5;
    final static double monsterAttackRate = 0.5;
    final static double monsterDefenseRate = 0.1;

    Monster(int playerLevel)
    {
        String[] namePool = new String[]{"피카츄", "파이리", "꼬부기", "버터플", "야도란", "피죤투", "또가스"};
        int rand = (int)(Math.random() * namePool.length);
        name = namePool[rand];

        level = (int)(Math.random() * (playerLevel + 5)) + 1;
        SetMonsterStat();
    }

    void SetMonsterStat()
    {
        hp += (monsterHpRate * level);
        attack += (monsterAttackRate * level);
        defense += (monsterDefenseRate * level);
    }
}

class GameState
{
    public void Lobby(Player player) throws InterruptedException
    {
        System.out.println("1.전투\t\t2.내정보");
        System.out.print("어떤 활동을 하시겠습니까? : ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        ConsoleController.ClearConsole();

        switch (choice)
        {
            case 1: // 전투
                InstanceMonster(player);
                Lobby(player);
                break;

            case 2: // 내정보
                PlayerInfo(player);
                Lobby(player);
                break;
            
            default:
                ConsoleController.ClearConsole();
                System.out.println("잘못 입력하셨습니다.");
                Lobby(player);
                break;
        }
    }

    public void InstanceMonster(Player player) throws InterruptedException
    {
        Monster monster = new Monster(player.level);
        System.out.println("야생의 " + monster.name + "이(가) 나타났다!!");
        monster.PrintUnitStat();

        Combat(player, monster);
    }

    public void Combat(Player player, Monster monster) throws InterruptedException
    {
        System.out.println("1.공격\t\t2.도망");
        System.out.print("어떤 활동을 하시겠습니까? : ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        ConsoleController.ClearConsole();

        switch (choice)
        {
            case 1:
                Attack(player, monster);
                break;

            case 2:
                Lobby(player);
                break;

            default :
                break;
        }

        
    }

    public void Attack(Player player, Monster monster) throws InterruptedException
    {
        boolean isOver = false;

        System.out.println(player.name + "의 공격!");
        monster.GetDamage(player.attack);
        System.out.println(player.name + " : " + player.hp + "\t\t" + monster.name + " : " + monster.hp);
        isOver = CheckCombat(player, monster);
        System.out.println();
        if (isOver)
        {
            return;
        }

        System.out.println(monster.name + "의 공격!");
        player.GetDamage(monster.attack);
        System.out.println(player.name + " : " + player.hp + "\t\t" + monster.name + " : " + monster.hp);
        isOver = CheckCombat(player, monster);
        System.out.println();
        if (isOver)
        {
            return;
        }
        else
        {
            Combat(player, monster);
        }
    }

    public boolean CheckCombat(Player player, Monster monster) throws InterruptedException
    {
        boolean isOver = false;
        if (player.hp <= 0)
        {
            Lose();
            isOver = true;
        }
        if (monster.hp <= 0)
        {
            Win(player);
            isOver = true;
        }
        return isOver;
    }

    public void Win(Player player) throws InterruptedException
    {
        player.Levelup();
        System.out.println("승리!!");
        ConsoleController.SleepConsole(5000);
        ConsoleController.ClearConsole();
        Lobby(player);
    }

    public void Lose() throws InterruptedException
    {
        System.out.println("Game Over..");
        ConsoleController.SleepConsole(5000);
        ConsoleController.Closeconsole();
    }

    public void PlayerInfo(Player player) throws InterruptedException
    {
        player.PrintUnitStat();
        ConsoleController.SleepConsole(5000);
        ConsoleController.ClearConsole();
    }
}

class ConsoleController
{   
    static void SleepConsole(int time) throws InterruptedException
    {
        Thread.sleep(time);
    }

    static void Closeconsole()
    {
        System.exit(0);
    }

    static void ClearConsole()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

public class Game_MethodPractice
{
    public static void main(String[] args) throws InterruptedException
    {
        GameState state = new GameState();

        Scanner scanner = new Scanner(System.in, "MS949");
        System.out.print("이름 : ");
        Player player = new Player(scanner.next());
        ConsoleController.ClearConsole();
        state.Lobby(player);
    }
}
