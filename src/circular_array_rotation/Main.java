package circular_array_rotation;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	Scanner scan = new Scanner(System.in);
	public Main() {
		// TODO Auto-generated constructor stub
		String input = scan.nextLine();
		String array = scan.nextLine();
		
		String[] arraies = array.split(" ");
		
		int rotations = Integer.parseInt(input.split(" ")[1]);
		int states = Integer.parseInt(input.split(" ")[2]);
		
		Vector<String> vector_array = new Vector<String>();
		vector_array.addAll(Arrays.asList(arraies));
		
		for (int i = 0; i < rotations; i++) {
			String removed_var = vector_array.remove(vector_array.size() - 1);
			vector_array.add(0, removed_var);
		}
		
		Vector<Integer> vector_states = new Vector<Integer>();
		
		for (int i = 0; i < states; i++) {
			int state = scan.nextInt();
			scan.nextLine();
			vector_states.add(state);
		}
		
		for (int i = 0; i < vector_states.size(); i++) {
			System.out.println(vector_array.get(vector_states.get(i)));
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
