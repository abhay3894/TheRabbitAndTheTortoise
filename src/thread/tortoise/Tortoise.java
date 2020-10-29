package thread.tortoise;

public class Tortoise extends Thread{

    private static final int MILESTONES = 5;

    private final Thread tortoise;
    private Tortoise(){
        this.tortoise=new Thread(this,"tortoise");

    }
}
