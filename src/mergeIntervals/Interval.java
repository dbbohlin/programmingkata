package mergeIntervals;

import java.util.ArrayList;
import java.util.List;

public class Interval {
	private int lower;
	private int higher;

	public Interval(int lower, int higher) {
		this.higher = higher;
		this.lower = lower;
	}

	public static List<Interval> merge(List<Interval> intervals) {
	    List<Interval> merged = new ArrayList<Interval>();
	    for (Interval interval : intervals ){
	      boolean hasInterval = false;
	      for (int i = 0; i < merged.size(); ++i){
	    	Interval set = merged.get(i);
			if(isValueInSet(interval, set)){
			  merged.add(i, setHigherAndLower(interval, set));
			  hasInterval = true;
			  break;
			}
	      }
	      if(!hasInterval) {
	    	  merged.add(interval);
	      }
	    }
	    return merged;
	}
	
	private static boolean isValueInSet(Interval inter1, Interval set) {
//		System.out.println("inter1["+inter1.getLower()+","+inter1.getHigher()+"] set["+set.getLower()+","+set.getHigher()+"]");
	    if(inter1.getLower() <= set.getHigher() && inter1.getLower() >= set.getLower()){
	        return true;
	      }
	      if(inter1.getHigher() >= set.getLower() && inter1.getHigher() <= set.getHigher()){
	        return true;
	      }
	      return false;
	}
	
	private static Interval setHigherAndLower(Interval inter, Interval set) {
		if(inter.getLower() < set.getLower()) {
			set.setLower(inter.getLower());
		}
		if(inter.getHigher() > set.getHigher()) {
			set.setHigher(inter.getHigher());
		}
		return set;
	}

	public void setLower(int lower) {
		this.lower = lower;
	}

	public void setHigher(int higher) {
		this.higher = higher;
	}

	public int getLower() {
		return lower;
	}

	public int getHigher() {
		return higher;
	}
}
