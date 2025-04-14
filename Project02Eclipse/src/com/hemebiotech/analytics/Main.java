package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Classe principale pour exécuter la logique de l'application.
 * Elle orchestre la lecture des symptômes à partir d'un fichier, leur comptage,
 * leur tri, et l'écriture du résultat dans un autre fichier.
 */

public class Main {
    public static void main(String args[]) throws Exception {
        // Initialiser l'objet "reader" avec le fichier d'entrée contenant les symptômes
        ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");

        // Initialiser l'objet "writer" avec le fichier de sortie pour les données traitées
        ISymptomWriter writer = new WriteSymptomDataToFile("result.out");

        // Créer le processeur d'analytique avec le "reader" et le "writer"
        AnalyticsCounter myAnalytics = new AnalyticsCounter(reader, writer);

        // Lire les symptômes à partir du fichier d'entrée
        List<String> symptoms = myAnalytics.getSymptoms();

        // Compter le nombre d'occurrences de chaque symptôme
        Map<String, Integer> myCount = myAnalytics.countSymptoms(symptoms);

       // Trier les symptômes par ordre alphabétique

        Map<String, Integer> mySort = myAnalytics.sortSymptoms(myCount);

        // Écrire les symptômes triés et comptés dans le fichier de sortie
        myAnalytics.writeSymptoms(mySort);
    }
}

