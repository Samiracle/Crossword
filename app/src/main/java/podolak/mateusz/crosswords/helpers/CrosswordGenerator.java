package podolak.mateusz.crosswords.helpers;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CrosswordGenerator {

    private FileReader fileReader = new FileReader();
    private char[][] grid = new char[15][15];

    public List<String> sortWordsList(List<String> wordsList) {
        Collections.sort(wordsList, new StringLengthComparator());
        return wordsList;
    }

    public char[][] addLongestWordToGrid(List<String> sortedWords) {
        char[] longestWord = sortedWords.get(0).toCharArray();
        for (int i = 0; i < longestWord.length; i++) {
            grid[i][0] = longestWord[i];
        }
        return grid;
    }

    public char[][] addSecondWordToGrid(List<String> sortedWords, char[][] grid) {
        char[] secondWord = sortedWords.get(1).toCharArray();
        for (int i = 0; i < secondWord.length; i++) {
            if (grid[i][0] == secondWord[0]) {
                for (int j = 1; j < secondWord.length; j++) {
                    grid[i][j] = secondWord[j];
                }
                break;
            }
        }
        return grid;
    }

}
