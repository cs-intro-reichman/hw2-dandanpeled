public class TimeCalc {
    public static void main(String[] args) {
        
        // Input from terminal
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int time_to_add = Integer.parseInt(args[1]);

        // Calculation of new time
        int total_minutes = (hours*60) + minutes + time_to_add;
        int total_hours = total_minutes / 60;
        int new_hours = total_hours % 24;
        int new_minutes = total_minutes - (total_hours*60);
        
        // Organize output by rules
        String output_hours = Integer.toString(new_hours);
        String output_minutes = Integer.toString(new_minutes);

        if (new_hours < 10){
            output_hours = String.format("%02d", new_hours);
        }
        if (new_minutes <10){
            output_minutes = String.format("%02d", new_minutes);
        }

        // Final output
        System.out.println(output_hours + ":" + output_minutes);


      
    }
}
