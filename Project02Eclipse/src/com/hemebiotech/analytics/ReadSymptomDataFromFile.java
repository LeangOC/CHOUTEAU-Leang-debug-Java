package com.hemebiotech.analytics;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */

/**
 * Classe qui lit les données de symptômes depuis un fichier texte.
 */

public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;
	
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */

	/**
	 *
	 * @param cheminFichier le chemin du fichier texte contenant les symptômes, un par ligne
	 */

	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}
	/**
	 * Lit tous les symptômes depuis le fichier et les retourne dans une liste.
	 *
	 * @return une liste contenant chaque symptôme lu depuis le fichier
	 */

	@Override
	public List<String> GetSymptoms() {
		ArrayList<String> result = new ArrayList<String>();
		
		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();
				
				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

}
