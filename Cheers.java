// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String word = args[0];
            char letter;
            int repetition = Integer.parseInt(args[1]);
            String testChar = "aAeEfFhHiIlLmMnNoOrRsSxX";
            String output = "";
            
            for (int i = 0; i < word.length() ; i++){
                letter = word.charAt(i);
                String letter_str = Character.toString(letter).toUpperCase();

                if (testChar.indexOf(letter) != -1){
                        
                        output = "Give me an " + letter_str + ": " + letter_str + "!";

                }

                else{
                        output = "Give me a " + letter_str + ": " + letter_str + "!";
                }
        
                System.out.println(output);
            }
            System.out.println("What does that spell?");

            for (int i = 0; i < repetition; i++){
                System.out.println(word.toUpperCase() + "!!!");
            }
        }
}
