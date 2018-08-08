package hanoitower;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestHanoiTower {
	HanoiTower tower;

	@BeforeEach
	void setUp() throws Exception {
		tower = new HanoiTower();
	}

	@Test
	void test_HanoiTowerExists() {
		HanoiTower tower = new HanoiTower();
	}

	@Test
	void test_using3disks() {
		String moves = runTowerGame(3);
		String result ="Move disk 1 from rod A to rod C\n" + 
				"Move disk 2 from rod A to rod B\n" + 
				"Move disk 1 from rod C to rod B\n" + 
				"Move disk 3 from rod A to rod C\n" + 
				"Move disk 1 from rod B to rod A\n" + 
				"Move disk 2 from rod B to rod C\n" + 
				"Move disk 1 from rod A to rod C\n";
		assertEquals(result, moves);
	}
	
	@Test
	void test_using4disks() {
		String moves = runTowerGame(4);
		String result ="Move disk 1 from rod A to rod B\n" + 
				"Move disk 2 from rod A to rod C\n" + 
				"Move disk 1 from rod B to rod C\n" + 
				"Move disk 3 from rod A to rod B\n" + 
				"Move disk 1 from rod C to rod A\n" + 
				"Move disk 2 from rod C to rod B\n" + 
				"Move disk 1 from rod A to rod B\n" + 
				"Move disk 4 from rod A to rod C\n" + 
				"Move disk 1 from rod B to rod C\n" + 
				"Move disk 2 from rod B to rod A\n" + 
				"Move disk 1 from rod C to rod A\n" + 
				"Move disk 3 from rod B to rod C\n" + 
				"Move disk 1 from rod A to rod B\n" + 
				"Move disk 2 from rod A to rod C\n" + 
				"Move disk 1 from rod B to rod C\n";
		assertEquals(result, moves);

	}
	
	private String runTowerGame(int n) {
		StringBuilder builder = new StringBuilder();
		tower.move(n, 'A', 'C', 'B', builder);
		return builder.toString();
	}
}
