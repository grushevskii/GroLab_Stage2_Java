package JavaThreads;

import java.util.Random;

public class MultiThreadProgram {
    private static final int CRISPERS_IN_PORT = 8;
    private static final int MAX_CRISPERS_IN_PORT = 12;
    private static final int NUMBER_WORKING_SHIPS = 12;

    public static void main(String[] args) {
        Random random = new Random();
        Port port = new Port(CRISPERS_IN_PORT, MAX_CRISPERS_IN_PORT);

        new Thread(new Ships(port, NUMBER_WORKING_SHIPS, random.nextInt(3)), "Crisper1").start();
        new Thread(new Ships(port, NUMBER_WORKING_SHIPS, random.nextInt(3)), "Crisper2").start();
        new Thread(new Ships(port, NUMBER_WORKING_SHIPS, random.nextInt(3)), "Crisper3").start();
        new Thread(new Ships(port, NUMBER_WORKING_SHIPS, random.nextInt(3)), "Crisper4").start();
        new Thread(new Ships(port, NUMBER_WORKING_SHIPS, random.nextInt(3)), "Crisper5").start();
    }
}
