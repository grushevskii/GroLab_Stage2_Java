package JavaThreads;

import java.util.concurrent.atomic.AtomicInteger;

public class Port {
    private AtomicInteger crispers = new AtomicInteger();
    private int maxCrispers;

    public Port(int crispersInPort, int maxCrispers) {
        this.crispers.set(crispersInPort);
        this.maxCrispers = maxCrispers;
    }

    public boolean addCrisper() {
        if (crispers.get() < maxCrispers) {
            crispers.incrementAndGet();
            return true;
        }
        else
            return false;
    }

    public boolean getCrisper() {
        if (crispers.get() > 0) {
            crispers.decrementAndGet();
            return true;
        }
        else
            return false;
    }

    public int crispersInPort() {
        return crispers.get();
    }
}
