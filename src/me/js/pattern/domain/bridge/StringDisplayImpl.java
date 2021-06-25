package me.js.pattern.domain.bridge;

public class StringDisplayImpl implements DisplayImpl {

    private String name;
    private int width;

    public StringDisplayImpl(String name) {
        this.name = name;
        this.width = name.getBytes().length;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + this.name + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i=0; i<width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
