package by.balashevich.taskeditor.reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextReader {
    private static final String DEFAULT_PATH = "datares/textExample.txt";

    public String readFileData(String filename){
        Path path;
        String data;

        if (filename != null && Files.exists(Paths.get(filename))) {
            path = Paths.get(filename);
        } else{
            path = Paths.get(DEFAULT_PATH);
        }

        try {
            data = Files.readString(path);
        } catch (IOException e) {
            throw new RuntimeException("File not available, data not read", e);
        }

        return data;
    }
}
