package podolak.mateusz.crosswords.helpers;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import podolak.mateusz.crosswords.R;

public class FileReader {

    private List<String> wordsList = new ArrayList<>();

    //to invoke it use this from acticity: getResources().openRawResource(R.raw.words_file);
    public List<String> getWordsFromFile(InputStream file) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(file));
        while (bufferedReader.readLine() != null) {
            wordsList.add(bufferedReader.readLine());
        }
        return wordsList;
    }

}
