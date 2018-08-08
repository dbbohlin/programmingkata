package hanoitower;

public class HanoiTower {

	public void move(int n, char from_rod, char to_rod, char aux_rod, StringBuilder builder) {
        if (n == 1)
        {
            builder.append("Move disk 1 from rod " +  from_rod + " to rod " + to_rod + "\n");
            return;
        }
        move(n-1, from_rod, aux_rod, to_rod, builder);
        builder.append("Move disk " + n + " from rod " +  from_rod + " to rod " + to_rod + "\n");
        move(n-1, aux_rod, to_rod, from_rod, builder);
	}

}
