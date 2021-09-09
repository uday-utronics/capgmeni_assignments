package question2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinMaxFinderTestQ1 {

	
	@Test
	void test() throws InvalidException {
		MinMaxFinder obj = new MinMaxFinder();
		int [] check = new int[] {98,2,3,4,54};
		minMax result = obj.findMinMax(check);
		assertEquals(2, result.getMin());
		assertEquals(98, result.getMax());
		
		
		
		//fail("Not yet implemented");
	}

}
