package org.example.zajecia.zadanie4;

public class Director {
    private final Drawing.DrawingBuilder builder;

    public Director(Drawing.DrawingBuilder builder) {
        this.builder = builder;
    }

    public void constructFromString(String instructions) {
        String[] commands = instructions.split(" ");
        int i = 0;
        int x,y;

        while (i < commands.length) {
            String command = commands[i];
            switch (command) {
                case "M":
                    x = Integer.parseInt(commands[++i]);
                    y = Integer.parseInt(commands[++i]);
                    builder.moveTo(x, y);
                    break;
                case "L":
                    x = Integer.parseInt(commands[++i]);
                    y = Integer.parseInt(commands[++i]);
                    builder.lineTo(x, y);
                    break;
                case "Z":
                    builder.close();
                    break;
            }
            i++;
        }
    }
}
