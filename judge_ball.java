import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String first_line = sc.nextLine();
        int num_pitch = Integer.parseInt(first_line);

        int num_ball = 0;
        int num_strike = 0;

        for(int i=0; i<num_pitch; i++){
            String input_judge = sc.nextLine().trim();

            if(input_judge.equals("ball")){
                if(num_ball == 3){
                    System.out.println("fourball!");
                    break;
                }else{
                    System.out.println("ball!");
                    num_ball += 1;
                }
            }else if(input_judge.equals("strike")){
                if(num_strike == 2){
                    System.out.println("out!");
                    break;
                }else{
                    System.out.println("strike!");
                    num_strike += 1;
                }
            }
        }
    }
}
