package Seminar3.Task2;

import java.io.IOException;

public class Counter implements AutoCloseable {
    private Integer count;

    public Counter(int i) {
        this.count = 0;
    }

    public Integer getCount() throws IOException {
        checkClose();
        return count;
    }

    public void add() throws IOException {
        checkClose();
        this.count++;
    }

    public void checkClose() throws IOException {
        if (this.count == null)
            throw new IOException("Экземпляр закрыт");
    }

    @Override
    public void close() {
        this.count = null;
    }
}