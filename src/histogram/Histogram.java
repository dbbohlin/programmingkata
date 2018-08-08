package histogram;

import static org.junit.jupiter.api.Assumptions.assumingThat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Histogram {
	class ValueComparator<K, V extends Comparable<V>> implements Comparator<K>{
		 
		HashMap<K, V> map = new HashMap<K, V>();
	 
		public ValueComparator(HashMap<K, V> map){
			this.map.putAll(map);
		}
	 
		@Override
		public int compare(K s1, K s2) {
			return ((Comparable) ((Map.Entry) (s2)).getValue()).compareTo(((Map.Entry) (s1)).getValue());
		}
	}
	public static void main(String[] args) {
		Histogram histogram = new Histogram();
		Map<String, Integer> count = histogram.countCharacters("Display the count of occurrence characters from a string");
		System.out.println(count);
		System.out.println(histogram.printHistogram("Display the count of occurrence characters from a string"));
	}

	private String printHistogram(String string) {
		StringBuilder builder = new StringBuilder();
		HashMap<String, Integer> count = (HashMap<String, Integer>) countCharacters(string);
		List keys = new LinkedList(count.entrySet());
		Collections.sort(keys, new ValueComparator(count));
		for(Iterator it = keys.iterator(); it.hasNext();) {
			Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) it.next();
			builder.append(entry.getKey());
			Integer strCount = count.get(entry.getKey());
			for(int i = 0; i < strCount.intValue(); ++i) {
				builder.append("#");
			}
			builder.append(System.lineSeparator());
		}
		
		return builder.toString();
	}

	private Map<String, Integer> countCharacters(String string) {
		Map<String, Integer> count = new HashMap<String, Integer>();
		for(int i = 0; i < string.length(); ++i) {
			if(count.containsKey(""+string.charAt(i))) {
				int charcount = count.get(""+string.charAt(i));
				count.put(""+string.charAt(i), (charcount + 1));
			}else {
				count.put(""+string.charAt(i), 1);
			}
		}
		return count;
	}

}
