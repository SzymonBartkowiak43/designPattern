package org.example.reszta.flyweight.task;

import lombok.Getter;


public class ColorRepository {
    @Getter
    private static Color white = new Color(0,0,0);
    @Getter
    private static Color black = new Color(255,255,255);

}
