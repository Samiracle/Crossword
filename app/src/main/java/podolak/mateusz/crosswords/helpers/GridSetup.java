package podolak.mateusz.crosswords.helpers;

public class GridSetup {

    private int rows = 15;
    private int columns = 15;
    private char[][] grid = new char[rows][columns];

    public GridSetup(char[][] grid) {
        this.grid = grid;
    }

    public char[][] getGrid() {
        return grid;
    }

    public void setGrid(char[][] grid) {
        this.grid = grid;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public char getCell(int row, int column) {
        return grid[row][column];
    }

    public void setCell(char cell, int row, int column) {
        this.grid[row][column] = cell;
    }

    public boolean isCellEmpty(int row, int column) {
        return getCell(row, column) == '\u0000';
    }
}
