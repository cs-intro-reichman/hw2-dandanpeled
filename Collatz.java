// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Input from user
		int seed = Integer.parseInt(args[0]);
		String mode = args[1];

		// check if mode is Verbose
		if (mode.equals("v")){
		
		// Loop to create hailstone sequences
		for (int i = 1; i <= seed; i++){
			int current_num = i;
			int steps = 0;
			System.out.print(i + " ");
			
				do {
					if (current_num != i){
						System.out.print(current_num + " ");
					}

					if (current_num % 2 == 0){
						current_num = current_num / 2;
					} else{
						current_num = (current_num *3) +1;
					}
					
					steps ++;

				} while (current_num != 1);

				System.out.print ("1 ");
				steps ++;

				System.out.print("(" + steps + ")");
				System.out.println();
			}
			System.out.println("Every one of the first " + seed +" hailstone sequence reached 1.");

		}

		// check if mode is C
		if (mode.equals("c")){
			System.out.println("Every one of the first " + seed + " hailstone sequence reached 1.");
		}

	}

}
