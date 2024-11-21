// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
            // Input from user
	    String word = args[0];

            // Variables
            char letter;
            int repetition = Integer.parseInt(args[1]);
            String testChar = "aAeEfFhHiIlLmMnNoOrRsSxX";
            String output = "";
            
            // Loop through all the input
            for (int i = 0; i < word.length() ; i++){
                letter = word.charAt(i); // Get the letter
                String letter_str = Character.toString(letter).toUpperCase();
                
                // Check if the letter need to get a or an
                if (testChar.indexOf(letter) != -1){
                        
                        output = "Give me an " + letter_str + ": " + letter_str + "!";

                }

                else{
                        output = "Give me a  " + letter_str + ": " + letter_str + "!";
                }
        
                System.out.println(output);
            }
            System.out.println("What does that spell?");

            //Output loop of the input word
            for (int i = 0; i < repetition; i++){
                System.out.println(word.toUpperCase() + "!!!");
            }
        }
}
