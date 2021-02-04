package CodeWars;

import java.util.Locale;

public class CodeWars1 {

    //Multi-tap Keypad Text Entry on an Old Mobile Phone
    public int presses(String phrase) {
        String[] keys = {"1", "ABC2", "DEF3", "GHI4", "JKL5", "MNO6", "PQRS7", "TUV8", "WXYZ9", "*", " 0", "#"};
        int count = 0;

        for(char c : phrase.toCharArray()) {
            for (String s : keys) {
                count += s.indexOf(c) + 1;
            }
        }
        return count;
    }
}
