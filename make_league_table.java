import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int num = Integer.parseInt(line);
        String[][] scoretable = new String[num][num];
        int input_lines_num = (num * (num-1)) / 2;

        for(int i = 0; i < input_lines_num; i++){
            String score_line = sc.nextLine();
            String[] score_arr = score_line.split("[\\s]+");
            int winner = Integer.parseInt(score_arr[0]);
            int looser = Integer.parseInt(score_arr[1]);

            scoretable[winner-1][looser-1] = "W";
            scoretable[looser-1][winner-1] = "L";
        }

        for(int s = 0; s < num; s++){
            scoretable[s][s] = "-";
        }


        for(String[] result_arr: scoretable){
            int counter = 0;
            for(String result: result_arr){
                System.out.print(result);
                counter += 1;
                if(counter != num){
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

    }
}
