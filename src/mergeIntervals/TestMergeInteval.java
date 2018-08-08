package mergeIntervals;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestMergeInteval {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testMergeringIntervals() {
		List<Interval> intervals = testArray();
		List<Interval> merged = Interval.merge(intervals);
		for(Interval interval: merged) {
			System.out.println("["+interval.getLower()+","+interval.getHigher()+"]\n");
		}

	}

	private List<Interval> testArray(){
		List<Interval> intervals = Arrays.asList(
			      new Interval(1,3),
			      new Interval(13,20),
			      new Interval(4,10),
			      new Interval(3,4),
			      new Interval(10,13)
				);		
		return intervals;
	}
}
