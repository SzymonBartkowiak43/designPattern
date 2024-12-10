package org.example.zajecia.zadanie8_command;

import java.util.Scanner;

public class Ztp08
{
    public static void main(String[] args) {
        ChessBoard board = new ChessBoard();
        ChessApp chessApp = new ChessApp();
        String defaultNotation = """
            ra8 nb8 bc8 qd8 ke8 bf8 ng8 rh8
            pa7 pb7 pc7 pd7 pe7 pf7 pg7 ph7
            Pa2 Pb2 Pc2 Pd2 Pe2 Pf2 Pg2 Ph2
            Ra1 Nb1 Bc1 Qd1 Ke1 Bf1 Ng1 Rh1
        """;
        board.initializeFromString(defaultNotation);

        // Wyświetlenie początkowego stanu planszy
        System.out.println(board);
        chessApp.addMove(board);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Wprowadź ruch (np. e2 e4, wybierz 1 zeby cofnąc ruch, wybierz 2 zeby cofnac cofnięcie lub 'exit' aby zakończyć): ");
            String input = scanner.nextLine();

            // Wyjście z gry
            if ("exit".equalsIgnoreCase(input)) {
                System.out.println("Gra zakończona.");
                break;
            }

            if("1".equals(input)) {
                chessApp.undo();
                System.out.println("Cofniecie");
                continue;
            }

            try {
                // Rozdzielenie ruchu na pole startowe i końcowe
                String[] parts = input.split(" ");
                if (parts.length != 2) {
                    System.out.println("Nieprawidłowy format. Użyj formatu 'e2 e4'.");
                    continue;
                }

                String from = parts[0]; // Pole startowe
                String to = parts[1];   // Pole docelowe

                // Konwersja notacji szachowej na indeksy tablicy
                int fromRow = 8 - (from.charAt(1) - '0');
                int fromCol = from.charAt(0) - 'a';
                int toRow = 8 - (to.charAt(1) - '0');
                int toCol = to.charAt(0) - 'a';

                // Wykonanie ruchu i aktualizacja planszy
                if (board.movePiece(fromRow, fromCol, toRow, toCol)) {
                    System.out.println(board);
                    chessApp.addMove(board);
                }
                else {
                    System.out.println("Nie można wykonać ruchu.");
                }
            }
            catch (Exception e) {
                System.out.println("Błąd podczas przetwarzania ruchu: " + e.getMessage());
            }
        }
    }
}