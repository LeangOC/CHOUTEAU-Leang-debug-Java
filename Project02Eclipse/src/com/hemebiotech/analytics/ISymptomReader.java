package com.hemebiotech.analytics;

import java.util.List;

/**
 * Anything that will read symptom data from a source
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications
 * 
 * The implementation does not need to order the list
 * 
 */

/**
 * Interface pour toute classe qui lira les données de symptômes à partir d'une source.
 */

public interface ISymptomReader {
	/**
	 * If no data is available, return an empty List
	 * 
	 * @return a raw listing of all Symptoms obtained from a data source, duplicates are possible/probable
	 */

	/**
	 * Lit les symptômes depuis une source de données (fichier, base de données, etc.).
	 *
	 * @return une liste de symptômes sous forme de chaînes
	 */

	List<String> GetSymptoms ();
}
