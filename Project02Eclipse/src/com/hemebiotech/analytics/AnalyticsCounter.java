package com.hemebiotech.analytics;
import java.util.*;

public class AnalyticsCounter {
	private ISymptomReader reader;
	private ISymptomWriter writer;
    public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer){
		this.reader = reader;
		this.writer = writer;
    }

	public List<String> getSymptoms(){
		return reader.GetSymptoms();
	}
	public Map<String,Integer> countSymptoms(List<String> symptoms){
		Map<String,Integer> nbrSymptoms = new HashMap<>();
		for (String monSymptoms : symptoms) {
			nbrSymptoms.put(monSymptoms,nbrSymptoms.getOrDefault(monSymptoms,0) + 1);
		}
		return nbrSymptoms;
	}

	public Map<String,Integer> sortSymptoms(Map<String, Integer> symptoms){
		Map<String, Integer> mySort = new TreeMap<>(symptoms);
		return mySort;
	}
	public void writeSymptoms(Map<String,Integer> symptoms){
	writer.writeSymptoms(symptoms);
	}

	public static void main(String args[]) throws Exception {

	}
}