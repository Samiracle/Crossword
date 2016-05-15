package podolak.mateusz.crosswords.helpers;

public class GridSetup {

    private int rowSize = 15;
    private int columnSize = 15;
    private char[][] grid = new char[rowSize][columnSize];

    public GridSetup(int rowSize, int columnSize) {
        this.rowSize = rowSize;
        this.columnSize = columnSize;
        this.grid = new char[rowSize][columnSize];
    }

    public char[][] getGrid() {
        return grid;
    }

    public void setGrid(char[][] grid) {
        this.grid = grid;
    }

    public int getRowSize() {
        return rowSize;
    }

    public void setRowSize(int rowSize) {
        this.rowSize = rowSize;
    }

    public int getColumnSize() {
        return columnSize;
    }

    public void setColumnSize(int columnSize) {
        this.columnSize = columnSize;
    }

    public char getCell(int row, int column) {
        return grid[row][column];
    }

    public void setCell(char cell, int row, int column) {
        this.grid[row][column] = cell;
    }

    public char[] getRow(int row) {
        char[] charsInRow = new char[this.columnSize];
        for (int i = 0; i < this.columnSize - 1; i++) {
            charsInRow[i] = this.grid[row][i];
        }
        return charsInRow;
    }

    public char[] getColumn(int column) {
        char[] charsInColumn = new char[this.rowSize];
        for (int i = 0; i < this.rowSize - 1; i++) {
            charsInColumn[i] = this.grid[i][column];
        }
        return charsInColumn;
    }

    public boolean isCellEmpty(int row, int column) {
        return getCell(row, column) == '\u0000';
    }

    public boolean isCharEmpty(char ch) {
        return ch == '\u0000';
    }

    public boolean isRowEmpty(int row) {
        char[] charsInRow = getRow(row);
        for (char cell : charsInRow) {
            if (!isCharEmpty(cell))
                return false;
        }
        return true;
    }

    public boolean isColumnEmpty(int column) {
        char[] charsInColumn = getRow(column);
        for (char cell : charsInColumn) {
            if (!isCharEmpty(cell))
                return false;
        }
        return true;
    }
}
