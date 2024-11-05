package org.example.zajecia.zadanie3_2;

import lombok.Getter;

class Header {
    @Getter
    private String name;
    private Cell prototypeCell;

    public Header(String name, Cell prototypeCell) {
        this.name = name;
        this.prototypeCell = prototypeCell;
    }

    public Cell createCell(Object value) {
        Cell cell = prototypeCell.clone();
        cell.setValue(value);
        return cell;
    }

    public Cell createDefaultCell() {
        return prototypeCell.clone();
    }
}
