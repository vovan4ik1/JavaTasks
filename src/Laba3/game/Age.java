package Laba3.game;

import java.util.Comparator;

public class Age implements Comparator<Participant> {
    @Override
    public int compare(Participant p1, Participant p2) {
        return Integer.compare(p1.getAge(), p2.getAge());
    }
}