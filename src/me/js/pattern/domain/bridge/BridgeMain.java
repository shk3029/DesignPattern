package me.js.pattern.domain.bridge;

public class BridgeMain {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("HI, D1"));
        Display d2 = new CountDisplay(new StringDisplayImpl("HI, D12"));
        d1.display();
        ((CountDisplay) d2).multiDisplay(3);
    }
}
