package sortnames;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortNames {
	List<String> sorted = new ArrayList<String>();
	
	class ValueLengthComparator<K, V extends Comparable<V>> implements Comparator<K>{
		HashMap<K, V> map = new HashMap<K, V>();
		 
		public ValueLengthComparator(HashMap<K, V> map){
			this.map.putAll(map);
		}

		@Override
		public int compare(K s1, K s2) {
			Integer len1 = new Integer(((Map.Entry) (s1)).getValue().toString().length());
			Integer len2 = new Integer(((Map.Entry) (s2)).getValue().toString().length());
			return len1.compareTo(len2);
		}
		
	}
	class ValueComparator<K, V extends Comparable<V>> implements Comparator<K>{
		 
		HashMap<K, V> map = new HashMap<K, V>();
	 
		public ValueComparator(HashMap<K, V> map){
			this.map.putAll(map);
		}
	 
		@Override
		public int compare(K s1, K s2) {
			return ((Comparable) ((Map.Entry) (s1)).getValue()).compareTo(((Map.Entry) (s2)).getValue());
		}
	}
	public static void main(String[] args) {
		Map<String, String> names = new HashMap();
		names.put("Jane", "Doe");
		names.put("Joe", "Doe");
		names.put("Jon", "Smith");
		names.put("Test", "Smithy");
		names.put("George", "Ge");
		names.put("Fred", "Dee");
		
		SortNames sortNames = new SortNames();
		List<String> sorted = sortNames.sortByLengthOfLasName(names);
		System.out.println(sorted);
		sorted = sortNames.sortByLastName(names);
		System.out.println(sorted);
	}

	private List<String> sortByLastName(Map<String, String> names) {
		List list = new LinkedList(names.entrySet());
		Collections.sort(list, new ValueComparator((HashMap) names));
		return transformNames(list);
	}

	private List<String> transformNames(List<String> sorted) {
		List<String> list = new LinkedList<String>();
		for(Iterator it = sorted.iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			list.add(entry.getKey() + " " + entry.getValue());
		}
		return list;
	}

	private List<String> sortByLengthOfLasName(Map<String, String> names) {
		List list = new LinkedList(names.entrySet());
		Collections.sort(list, new ValueLengthComparator((HashMap) names));
		return transformNames(list);
	}

}
