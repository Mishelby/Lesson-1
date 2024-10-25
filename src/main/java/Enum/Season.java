package Enum;

import java.util.HashSet;
import java.util.Set;

public enum Season {
    SUMMER("Summer"),
    WINTER("Winter"),
    SPRING("Spring"),
    AUTUMN("Autumn");

    String name;

    Season(String name) {
        this.name = name;
    }
}

class Season2{
    Set<String> seasons = new HashSet<>(Set.of(
            "Spring", "Summer", "Winter", "Autumn"
    ));
}