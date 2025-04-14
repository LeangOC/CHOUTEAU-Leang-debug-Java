package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Main class to execute the application logic.
 * It orchestrates reading symptoms from a file, counting them, sorting them,
 * and writing the result to another file.
 */
public class Main {
    public static void main(String args[]) throws Exception {
        // Initialize the reader with the input file containing the symptom
        ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");

        // Initialize the writer with the output file path for processed data
        ISymptomWriter writer = new WriteSymptomDataToFile("result.out");

        // Initialize  "myAnalytics" objet with the reader and writer objets
        AnalyticsCounter myAnalytics = new AnalyticsCounter(reader, writer);

        // Read the symptoms from the input file
        List<String> symptoms = myAnalytics.getSymptoms();

        // Count the number of occurrences of each symptom
        Map<String, Integer> myCount = myAnalytics.countSymptoms(symptoms);

        // Sort the symptoms alphabetically
        Map<String, Integer> mySort = myAnalytics.sortSymptoms(myCount);

        // Write the sorted and counted symptoms to the output file
        myAnalytics.writeSymptoms(mySort);
    }
}

