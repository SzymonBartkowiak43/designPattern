package org.example.zajecia.zadanie8_command;

import java.util.ArrayList;
import java.util.List;

public class ChessApp {
    private List<ChessBoard> playerMove = new ArrayList<>();
    private int currentIndexOfBoard = 0;

    public void addMove(ChessBoard chessBoard) {
        currentIndexOfBoard++;
        playerMove.add(chessBoard);
    }

    public void undo() {
        currentIndexOfBoard--;
        System.out.println(playerMove.get(currentIndexOfBoard));
        System.out.println("rozmiar :" + playerMove.size());
    }
}
