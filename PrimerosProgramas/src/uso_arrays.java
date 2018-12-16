
public class uso_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrix = {
				{10,15,18,19,21},
				{14,74,85,64,52},
				{48,87,49,52,87},
				{54,85,64,24,84}
		};


		for(int[]fila:matrix) {
			System.out.println();
			for(int z: fila) {
				System.out.print(z + " ");
			}
		}
	}

}
