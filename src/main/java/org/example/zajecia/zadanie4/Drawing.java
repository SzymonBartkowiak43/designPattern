package org.example.zajecia.zadanie4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Drawing {
    private List<Figure> figures = new ArrayList<>();

    private Drawing(DrawingBuilder drawingBuilder) {
        this.figures = drawingBuilder.figures;
    }

    public List<Figure> getFigures() {
        return figures;
    }

    @Override
    public String toString() {
        return "Rysunek: \n" + figures.stream().map(figure -> figure.toString()).collect(Collectors.joining("\n"));
    }

    public static class DrawingBuilder {
        private List<Figure> figures = new ArrayList<>();
        private List<Point> punktyFigury;
        private Point startPoint;

        public DrawingBuilder moveTo(int x, int y) {
            punktyFigury = new ArrayList<>();
            Point point = new Point(x, y);
            startPoint = point;

            punktyFigury.add(point);
            return this;
        }

        public DrawingBuilder lineTo(int x, int y) {
            Point point = new Point(x, y);
            punktyFigury.add(point);
            return this;
        }

        public DrawingBuilder close() {
            punktyFigury.add(startPoint);
            figures.add(new Figure(punktyFigury));
            return this;
        }

        public Drawing build() {
            if(!punktyFigury.isEmpty()) {
                figures.add(new Figure(punktyFigury));
            }
            return new Drawing(this);
        }
    }
}