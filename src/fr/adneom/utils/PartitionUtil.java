package fr.adneom.utils;
import java.util.ArrayList;
import java.util.List;

public class PartitionUtil {
	public static List<List<Integer>> partition( List<Integer> inputList, int taillePartition ) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		if (inputList==null || taillePartition < 0){		
		result.add(inputList);	
		return result;
		}
		List<Integer> listWork = new ArrayList<Integer>();
		int sizeInputList = inputList.size();
		 int i=0;
			while (i < sizeInputList){
				listWork.clear();
				for (int j = 0; j < taillePartition; j++){
					if((i+j)< sizeInputList)
						listWork.add(inputList.get(i+j));
				}
				List<Integer> newList = new ArrayList<Integer>(listWork);
				result.add(newList); 
				i +=taillePartition;
			}
	 
			return result;
	}
	
}
