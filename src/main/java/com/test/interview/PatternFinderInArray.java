package com.test.interview;

import java.util.ArrayList;
import java.util.List;

public class PatternFinderInArray {
    public static void main(String[] args) {
        char[][] matrix = {
                "axymn".toCharArray(),
                "bozmo".toCharArray(),
                "cxmoz".toCharArray(),
                "xymza".toCharArray(),
                "amxzy".toCharArray()
        };
        if (exist1(matrix, "xoxmozab")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean exist1(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        int lengthOfWord = word.length();

//        if word is larger than the total element in the array then it should not be found
        if (lengthOfWord > rows * cols) {
            return false;
        }

        List<Coordinates> coordinates = new ArrayList<>();
        List<Coordinates> nextElementCoordinates = new ArrayList<>();

//        in this for loop, we are finding the coordinates of the first characters in the array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (word.charAt(0) == board[i][j]) {
                    coordinates.add(new Coordinates(i, j));
                }

            }
        }

//        should return false if the first char is not preset at all
        if (coordinates.size() == 0) {
            return false;
        }

//        while end of pattern is not reached
//        recursively pick each coordinate for the first char and then traverse to the
//        adjacent block to see if the next char is preset in the block
        int i = 1;
        while (i < word.length()) {
            for (Coordinates coordinates1 : coordinates) {
//                search top
                if (coordinates1.x != 0) {
                    if (word.charAt(i) == board[coordinates1.x - 1][coordinates1.y]) {
                        nextElementCoordinates.add(new Coordinates(coordinates1.x - 1, coordinates1.y));
                    }
                }
//                search bottom
                if (coordinates1.x != rows - 1) {
                    if (word.charAt(i) == board[coordinates1.x + 1][coordinates1.y]) {
                        nextElementCoordinates.add(new Coordinates(coordinates1.x + 1, coordinates1.y));
                    }
                }
//                search left
                if (coordinates1.y != 0) {
                    if (word.charAt(i) == board[coordinates1.x][coordinates1.y - 1]) {
                        nextElementCoordinates.add(new Coordinates(coordinates1.x, coordinates1.y - 1));
                    }
                }
//                search right

                if (coordinates1.y != cols - 1) {
                    if (word.charAt(i) == board[coordinates1.x][coordinates1.y + 1]) {
                        nextElementCoordinates.add(new Coordinates(coordinates1.x, coordinates1.y + 1));
                    }
                }
            }

            if (nextElementCoordinates.size() == 0) {
                return false;
            } else {
                i = i + 1;
                coordinates.clear();
                coordinates.addAll(nextElementCoordinates);
                nextElementCoordinates.clear();
            }
        }
        return true;
    }

}

class Coordinates {
    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int x;
    int y;
}
