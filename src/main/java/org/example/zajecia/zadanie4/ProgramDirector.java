package org.example.zajecia.zadanie4;

public class ProgramDirector {
    public static void main(String[] args) {
        Drawing.DrawingBuilder drawingBuilder = new Drawing.DrawingBuilder();

        // Przykład użycia z klasą Director
        Director director = new Director(drawingBuilder);
        director.constructFromString("M 100 400 L 200 50 L " +
                "450 300 L 250 250 Z M 300 350 L 350 100 L 50 200");

        // Odbieramy gotowy rysunek
        Drawing drawing = drawingBuilder.build();

        // Wypisujemy rysunek do konsoli
        System.out.println(drawing);
    }
}
