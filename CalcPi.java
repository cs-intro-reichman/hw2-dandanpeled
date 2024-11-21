// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 

		int number_of_numbers = Integer.parseInt(args[0]);
		double pi_calc = 1.0;
		double divider = 1.0;

		for (double i = 1.0; i < number_of_numbers ; i++){
			divider = divider+2;
			pi_calc = pi_calc - 1/divider;
			i++;
			if (number_of_numbers == i){
				break;
			}

			divider = divider+2;
			pi_calc = pi_calc + 1/divider;
		}

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + (pi_calc * 4));
	
	}
}
