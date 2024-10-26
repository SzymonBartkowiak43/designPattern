package org.example.builder.zad1;

class Program {
    public static void main(String[] args) {
        // Używamy Buildera, aby stworzyć rysunek z dwóch figur
        Drawing.DrawingBuilder drawingBuilder = new Drawing.DrawingBuilder();

        // Pierwsza figura
        drawingBuilder
                .moveTo(100, 400)  // Początek figury
                .lineTo(200, 50)   // Dodajemy kolejne punkty
                .lineTo(450, 300)
                .lineTo(250, 250)
                .close();          // Zamykamy figurę

        // Druga figura
        drawingBuilder
                .moveTo(300, 350)  // Początek figury
                .lineTo(350, 100)
                .lineTo(50, 200);  // Figura może być otwarta

        // Odbieramy gotowy rysunek
        Drawing drawing = drawingBuilder.build();

        // Wypisujemy rysunek do konsoli
        System.out.println(drawing);
    }
}
