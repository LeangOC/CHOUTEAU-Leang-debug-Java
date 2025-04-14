package com.hemebiotech.analytics;

import java.util.List;

/**
 * Interface pour toute classe qui lira les données de symptômes à partir d'une source.
 */

public interface ISymptomReader {

	/**
	 * Lit les symptômes depuis une source de données (fichier, base de données, etc.).
	 *
	 * @return une liste de symptômes sous forme de chaînes
	 */

	List<String> GetSymptoms ();
}
