package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Anything that will write symptom data to a destination.
 * The important part is the input parameter of the operation, which is a map
 * of symptom names and their corresponding occurrences.
 */

/**
 * Interface pour toute classe qui écrira les données de symptômes vers une destination.
 * L'élément important est le paramètre d'entrée de l'opération, qui est une map
 * des noms de symptômes et de leurs occurrences correspondantes.
 */

public interface ISymptomWriter {
    /**
     * Writes the given map of symptoms and their counts to a destination.
     *
     * @param symptoms a Map where the key is the symptom name and the value is the number of occurrences
     */

    /**
     * Écrit la map donnée de symptômes et leurs comptes vers une destination.
     *
     * @param symptoms une Map où la clé est le nom du symptôme et la valeur est le nombre d'occurrences
     */

    void writeSymptoms(Map<String, Integer> symptoms);
}

