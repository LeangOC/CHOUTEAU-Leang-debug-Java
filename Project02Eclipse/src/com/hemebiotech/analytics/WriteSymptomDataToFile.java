package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Simple implementation that writes symptom data to a text file.
 */
public class WriteSymptomDataToFile implements ISymptomWriter {

    private String filepath;

    /**
     *
     * @param filepath a full or partial path to the file where the symptom data should be written
     */
    public WriteSymptomDataToFile(String filepath) {
        this.filepath = filepath;
    }

    /**
     * Writes each symptom and its count to the file specified by the filepath.
     * Each line of the file will contain a symptom followed by its count, separated by a colon.
     *
     * Example line: "headache: 3"
     *
     * @param symptoms a Map containing symptom names as keys and their corresponding counts as values
     */
    @Override
    public void writeSymptoms(Map<String, Integer> symptoms) {
        try (FileWriter writer = new FileWriter(filepath)) {
            for (Map.Entry<String, Integer> entry : symptoms.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
