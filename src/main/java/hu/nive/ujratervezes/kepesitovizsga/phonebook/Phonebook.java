package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class Phonebook {

    public void exportPhonebook(Map<String, String> contacts, String output) {
        if (contacts == null || output == null) {
            throw new IllegalArgumentException("arg error");
        }
        try (BufferedWriter bw = Files.newBufferedWriter(Path.of(output))) {
            for (String item : contacts.keySet()) {
                bw.write(item + ": " + contacts.get(item) + "\n");
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't write file", e);
        }
    }
}


