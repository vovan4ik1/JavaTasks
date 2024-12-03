package Laba3.game;

import java.util.Comparator;

public class Priority {
   public static Comparator<Participant> byNameThenAge = 
        Comparator.comparing(Participant::getName)
                  .thenComparing(Participant::getAge);
}
