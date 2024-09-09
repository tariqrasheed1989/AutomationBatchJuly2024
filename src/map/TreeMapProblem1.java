package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapProblem1 {
	
	public static void main(String[] args) {
		Map<Integer, Integer> studentScores = new HashMap<>();
		studentScores.put(101, 85);
		studentScores.put(102, 90);
		studentScores.put(103, 83);
		studentScores.put(104, 95);
		studentScores.put(105, 90);
		
		TreeMap<Integer, List<Integer>> scoreMap = new TreeMap(Collections.reverseOrder());
		
		for(Map.Entry<Integer, Integer> entry: studentScores.entrySet() ) {
			int studentID= entry.getKey();
			int score= entry.getValue();
			
			scoreMap.putIfAbsent(score, new ArrayList<>());
			
			scoreMap.get(score).add(studentID);
		}
			System.out.println("---student rank----");
			int rank =1;
			
			for(Map.Entry<Integer, List<Integer>> entry:scoreMap.entrySet()) {
				int score= entry.getKey();
				List<Integer> studentIDs= entry.getValue();
				
				Collections.sort(studentIDs);
				
				for(int StudentID:studentIDs) {
					System.out.println("Rank "+rank+" Student ID = "+StudentID+" Score = "+score);
					rank++;
				}
			}		
		
	}

}
