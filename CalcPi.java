// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 

		int number_of_numbers = Integer.parseInt(args[0]);
		double pi_calc = 1.0;
		double divider = 1.0;

		for (double i = 1.0; i < number_of_numbers ; i++){
			System.out.println("Num i: " +i);
			divider = divider+2;
			System.out.println("Divider num: " +divider);

			System.out.println("Divider: "+ (1/divider));
			pi_calc = pi_calc - 1/divider;
			System.out.println(pi_calc );

			
			i++;
			if (number_of_numbers == i){
				break;
			}
			
			System.out.println("Num i: " +i);
			divider = divider+2;
			System.out.println("Divider num: " +divider);

			System.out.println("Divider: "+ (1/divider));
			pi_calc = pi_calc + 1/divider;
			System.out.println(pi_calc);
			System.out.println("Num i: " +i);


			System.out.println("=============");

		}

		System.out.println(pi_calc * 4);
	
	}
}
