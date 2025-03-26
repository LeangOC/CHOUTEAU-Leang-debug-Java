package com.hemebiotech.analytics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnalyticsCounter {
	private ISymptomReader reader;
    public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer){
    }

	public List<String> getSymptoms(){
		return reader.GetSymptoms();
	}
	public static Map<String,Integer> countSymptoms(List<String> symptoms){
		Map<String,Integer> nbrSymptoms = new HashMap<>();
		for (String monSymptoms : symptoms) {
			nbrSymptoms.put(monSymptoms,nbrSymptoms.getOrDefault(monSymptoms,0) + 1);
		}
		return nbrSymptoms;
	}
	//public Map<String,Integer> sortSymptoms(){}
	//public writeSymptoms(Map<String,Integer> symptoms){}

	public static void main(String args[]) throws Exception {
		ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");
		//System.out.println(reader.GetSymptoms().get(1));
		//System.out.println(countSymptoms(reader.GetSymptoms()));
	}
}
