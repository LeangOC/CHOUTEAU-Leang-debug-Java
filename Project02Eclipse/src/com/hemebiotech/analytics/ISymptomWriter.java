package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Interface pour toute classe qui écrira les données de symptômes vers une destination.
 * L'élément important est le paramètre d'entrée de l'opération, qui est une map
 * des noms de symptômes et de leurs occurrences correspondantes.
 */

public interface ISymptomWriter {

    /**
     * Écrit la map donnée de symptômes et leurs comptes vers une destination.
     *
     * @param symptoms une Map où la clé est le nom du symptôme et la valeur est le nombre d'occurrences
     */

    void writeSymptoms(Map<String, Integer> symptoms);
}

