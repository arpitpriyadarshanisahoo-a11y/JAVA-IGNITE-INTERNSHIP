package DAY6ASSIGNMENT;

public class Batsman {
	String playerName;
    int runs, balls;
    double strikeRate;

    Batsman(String p, int r, int b)
    {
        playerName = p;
        runs = r;
        balls = b;
        strikeRate = (runs * 100.0) / balls;
    }

    void display()
    {
        System.out.println("Player Name : " + playerName);
        System.out.println("Runs : " + runs);
        System.out.println("Balls : " + balls);
        System.out.println("Strike Rate : " + strikeRate);
    }

    public static void main(String args[])
    {
        Batsman b = new Batsman("Arpita", 75, 50);
        b.display();
    }
}
	
