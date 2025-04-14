package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * This "Main" class execute the application logic.
 * It orchestrates reading symptoms from a file, counting them, sorting them,
 * and writing the result to another file.
 */
/**
 * Classe principale pour exécuter la logique de l'application.
 * Elle orchestre la lecture des symptômes à partir d'un fichier, leur comptage,
 * leur tri, et l'écriture du résultat dans un autre fichier.
 */


public class Main {
    public static void main(String args[]) throws Exception {
        // Initialize the reader with the input file containing symptoms
        // Initialiser le lecteur avec le fichier d'entrée contenant les données
        ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");

        // Initialize the writer with the output file path for processed data
        // Initialiser l'écrivain avec le fichier de sortie pour les données traitées
        ISymptomWriter writer = new WriteSymptomDataToFile("result.out");

        // Create the analytics processor with the reader and writer
        // Créer le processeur d'analytique avec le lecteur et l'écrivain
        AnalyticsCounter myAnalytics = new AnalyticsCounter(reader, writer);

        // Read the symptoms from the input file
        // Lire les symptômes à partir du fichier d'entrée
        List<String> symptoms = myAnalytics.getSymptoms();

        // Count the number of occurrences of each symptom
        // Compter le nombre d'occurrences de chaque symptôme
        Map<String, Integer> myCount = myAnalytics.countSymptoms(symptoms);

        // Sort the symptoms alphabetically
        // Trier les symptômes par ordre alphabétique

        Map<String, Integer> mySort = myAnalytics.sortSymptoms(myCount);

        // Write the sorted and counted symptoms to the output file
        // Écrire les symptômes triés et comptés dans le fichier de sortie
        myAnalytics.writeSymptoms(mySort);
    }
}

