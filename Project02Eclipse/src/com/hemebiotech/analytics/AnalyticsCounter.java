
package com.hemebiotech.analytics;

import java.util.*;

/**
 * This class is responsible for processing symptom data.
 * It includes reading symptoms, counting their occurrences, sorting them alphabetically,
 * and writing the final results to a file.
 */

/**
 * Cette classe est responsable du traitement des données de symptômes.
 * Elle inclut la lecture des symptômes, le comptage de leurs occurrences,
 * leur tri alphabétique, et l'écriture des résultats finaux dans un fichier.
 */

public class AnalyticsCounter {
	private ISymptomReader reader;
	private ISymptomWriter writer;

	/**
	 *
	 * @param reader an implementation of ISymptomReader to read raw symptom data
	 * @param writer an implementation of ISymptomWriter to output processed symptom data
	 */

	/**
	 *
	 * @param reader une implémentation de ISymptomReader pour lire les données brutes de symptômes
	 * @param writer une implémentation de ISymptomWriter pour écrire les données de symptômes traitées
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

	/**
	 * Lit la liste des symptômes en utilisant le lecteur fourni.
	 *
	 * @return une Liste de symptômes sous forme de chaînes
	 */

	public List<String> getSymptoms() {
		return reader.GetSymptoms();
	}

	/**
	 * Counts how many times each symptom appears in the list.
	 *
	 * @param symptoms a List of symptom strings, possibly with duplicates
	 * @return a Map with symptom names as keys and number of occurrences as values
	 */

	/**
	 * Compte combien de fois chaque symptôme apparaît dans la liste.
	 *
	 * @param symptoms une Liste de chaînes représentant les symptômes, avec possibles doublons
	 * @return une Map avec les noms des symptômes comme clés et le nombre d'occurrences comme valeurs
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

	/**
	 * Trie les symptômes par ordre alphabétique de leurs noms.
	 *
	 * @param symptoms une Map de symptômes avec leurs comptes
	 * @return une TreeMap contenant les mêmes données mais triées par clé (nom du symptôme)
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

	/**
	 * Écrit les données de symptômes triées en utilisant le writer fourni.
	 *
	 * @param symptoms une Map des noms de symptômes et leurs comptes à écrire
	 */

	public void writeSymptoms(Map<String, Integer> symptoms) {
		writer.writeSymptoms(symptoms);
	}
}
