package me.js.pattern.domain.bridge;

public class CountDisplay extends Display {

    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times) {
        open();
        for (int i=0; i<times; i++) {
            open();
            print();
        }
        close();
    }
}
