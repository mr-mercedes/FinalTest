package org.example.model;


public class Counter implements AutoCloseable {
    private int count;
    private boolean isOpen;

    public Counter() {
        this.count = 1;
        this.isOpen = true;
    }

    public int getCount() {
        return count;
    }

    public void add() throws Exception {
        if (!isOpen) {
            throw new RuntimeException("Файл закрыт");
        }
        this.count++;
    }

    @Override
    public void close() throws Exception {
        isOpen = false;
    }
}
