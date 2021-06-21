package day55_abstraction.flags;

import java.awt.*;

public class FlagDrawing {
    public static void main(String[] args) {
        RussianFlag russianFlag = new RussianFlag();
        russianFlag.draw();

        FrenchFlag frenchFlag = new FrenchFlag();
        frenchFlag.draw();

        UkraineFlag ukraineFlag = new UkraineFlag();
        ukraineFlag.draw();
    }
}
