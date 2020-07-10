package JavaThreads;

import java.util.Random;

public class Ships implements Runnable {
    private Port port;
    private int numberWork;
    private int loadedCrispers;
    private static final int MAX_CRISPERS = 3;

    public Ships(Port port, int numberWork, int crispers) {
        this.port = port;
        this.numberWork = numberWork;
        this.loadedCrispers = crispers;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < numberWork; i++) {
            boolean work = false;
            int x = random.nextInt(3);
            String s = Thread.currentThread().getName()+ ", " + ((x == 0) ? "add" : (x == 1) ? "get" : "add/get");
            s += ", port: " + port.crispersInPort();
            s += ", crisper: " + loadedCrispers;
            switch (x) {
                case 0:
                    if (loadedCrispers > 0)
                        if (port.addCrisper()) {
                            loadedCrispers--;
                            work = true;
                        }
                    break;
                case 1:
                    if (loadedCrispers < MAX_CRISPERS)
                        if (port.getCrisper()) {
                            loadedCrispers++;
                            work = true;
                        }
                    break;
                case 2:
                    if (loadedCrispers > 0)
                        if (port.addCrisper()) {
                            loadedCrispers--;
                            work = true;
                        }

                    try {
                        Thread.sleep(random.nextInt(1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    if (loadedCrispers < MAX_CRISPERS)
                        if (port.getCrisper()) {
                            loadedCrispers++;
                            work = true;
                        }
                    break;
            }
            s += ", port: " + port.crispersInPort();
            s += ", crisper: " + loadedCrispers;
            if (work) System.out.println(s);

            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
