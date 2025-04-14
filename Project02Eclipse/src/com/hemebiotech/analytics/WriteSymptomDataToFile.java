package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Implémentation simple qui écrit les données de symptômes dans un fichier texte.
 */

public class WriteSymptomDataToFile implements ISymptomWriter {

    private String filepath;

    /**
     *
     * @param filepath un chemin complet ou partiel vers le fichier où les données de symptômes doivent être écrites
     */

    public WriteSymptomDataToFile(String filepath) {
        this.filepath = filepath;
    }

    /**
     * Écrit chaque symptôme et son nombre d'occurrences dans le fichier spécifié par le chemin.
     * Chaque ligne du fichier contiendra un symptôme suivi de son compte, séparés par un deux-points.
     *
     * Exemple de ligne : "maux de tête: 3"
     *
     * @param symptoms une Map contenant les noms des symptômes comme clés et leurs comptes comme valeurs
     */

    @Override
    public void writeSymptoms(Map<String, Integer> symptoms) {
        try (FileWriter writer = new FileWriter(filepath)) {
            for (Map.Entry<String, Integer> entry : symptoms.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
