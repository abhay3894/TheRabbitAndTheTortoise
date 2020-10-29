package thread.tortoise;

public class Tortoise extends Thread {

    private static final int MILESTONES = 5;

    private final Thread tortoise;

    private Tortoise() {this.tortoise = new Thread(this, "tortoise");}

    public Thread getTortoise() { return tortoise;}

    @Override
    public void run() {
        for (int index = 0; index < MILESTONES; index++) {
            switch (index) {
                case 0:
                    System.out.println("The Rabbit has started from the start line!");
                    break;
}

