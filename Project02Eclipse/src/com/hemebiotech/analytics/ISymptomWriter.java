package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Anything that will write symptom data to a destination.
 * The important part is the input parameter of the operation, which is a map
 * of symptom names and their corresponding occurrences.
 */
public interface ISymptomWriter {
    /**
     * Writes the given map of symptoms and their counts to a destination.
     *
     * @param symptoms a Map where the key is the symptom name and the value is the number of occurrences
     */
    void writeSymptoms(Map<String, Integer> symptoms);
}

