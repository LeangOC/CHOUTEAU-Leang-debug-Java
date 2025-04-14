
package com.hemebiotech.analytics;

import java.util.*;

/**
 * This class is responsible for processing symptom data.
 * It includes reading symptoms, counting their occurrences, sorting them alphabetically,
 * and writing the final results to a file.
 */
public class AnalyticsCounter {
	private ISymptomReader reader;
	private ISymptomWriter writer;

	/**
	 *
	 * @param reader an implementation of ISymptomReader to read symptom data
	 * @param writer an implementation of ISymptomWriter to output processed symptom data
	 */
	public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
		this.reader = reader;
		this.writer = writer;
	}

	/**
	 * Reads the list of symptoms using the provided reader.
	 *
	 * @return a List of symptoms as Strings
	 */
	public List<String> getSymptoms() {
		return reader.getSymptoms();
	}

	/**
	 * Counts how many times each symptom appears in the list.
	 *
	 * @param symptoms a List of symptom strings, possibly with duplicates
	 * @return a Map with symptom names as keys and number of occurrences as values
	 */
	public Map<String, Integer> countSymptoms(List<String> symptoms) {
		Map<String, Integer> nbrSymptoms = new HashMap<>();
		for (String monSymptoms : symptoms) {
			nbrSymptoms.put(monSymptoms, nbrSymptoms.getOrDefault(monSymptoms, 0) + 1);
		}
		return nbrSymptoms;
	}

	/**
	 * Sorts the symptoms alphabetically by their names.
	 *
	 * @param symptoms a Map of symptoms with their counts
	 * @return a TreeMap containing the same data but sorted by key (symptom name)
	 */
	public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {
		Map<String, Integer> mySort = new TreeMap<>(symptoms);
		return mySort;
	}

	/**
	 * Writes the sorted symptom data using the provided writer.
	 *
	 * @param symptoms a Map of symptom names and counts to be written
	 */
	public void writeSymptoms(Map<String, Integer> symptoms) {
		writer.writeSymptoms(symptoms);
	}
}
