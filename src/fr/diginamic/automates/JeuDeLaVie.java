package fr.diginamic.automates;

public class JeuDeLaVie {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 10;
        int generations = 10;

        Grid grid = new Grid(rows, cols);
        grid.initializeGrid();
        System.out.println("Generation 0:");
        grid.printGrid();

        for (int generation = 1; generation <= generations; generation++) {
            grid.nextGeneration();
            System.out.println("Generation " + generation + ":");
            grid.printGrid();
        }
    }
}

class Cell {
    private boolean isAlive;

    public Cell() {
        isAlive = false;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}

class Grid {
    private int rows;
    private int cols;
    private Cell[][] cells;

    public Grid(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        cells = new Cell[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    public void initializeGrid() {
        // Exemple d'initialisation avec quelques cellules vivantes
        cells[0][2].setAlive(true);
        cells[0][9].setAlive(true);
        cells[1][7].setAlive(true);
        cells[1][8].setAlive(true);
        cells[2][3].setAlive(true);
        cells[2][4].setAlive(true);
        cells[4][3].setAlive(true);
        cells[4][7].setAlive(true);
        cells[4][8].setAlive(true);
        cells[4][9].setAlive(true);
    }

    public void nextGeneration() {
        Cell[][] newCells = new Cell[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int liveNeighbors = countLiveNeighbors(i, j);
                newCells[i][j] = new Cell();

                if (cells[i][j].isAlive()) {
                    // Règles de survie et de mort
                    newCells[i][j].setAlive(liveNeighbors == 2 || liveNeighbors == 3);
                } else {
                    // Règle de naissance
                    newCells[i][j].setAlive(liveNeighbors == 3);
                }
            }
        }

        cells = newCells;
    }

    public int countLiveNeighbors(int row, int col) {
        int count = 0;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int newRow = row + i;
                int newCol = col + j;

                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && !(i == 0 && j == 0)) {
                    if (cells[newRow][newCol].isAlive()) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public void printGrid() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(cells[i][j].isAlive() ? "X" : " ");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
