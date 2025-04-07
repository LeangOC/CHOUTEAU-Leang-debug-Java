package com.hemebiotech.analytics;
import java.util.List;
import java.util.Map;
public class Main {
    public static void main(String args[]) throws Exception {
        ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");
        ISymptomWriter writer = new WriteSymptomDataToFile("result.out");
        AnalyticsCounter myAnalytics = new AnalyticsCounter( reader, writer);
        List<String> symptoms = myAnalytics.getSymptoms();
        Map<String,Integer> myCount = myAnalytics.countSymptoms(symptoms);
        Map<String,Integer> mySort = myAnalytics.sortSymptoms(myCount);
        myAnalytics.writeSymptoms(mySort);
    }
}
