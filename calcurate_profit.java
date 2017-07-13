import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first_line = sc.nextLine();
        String[] basic_info = first_line.split("[\\s]+");

        int num_members = Integer.parseInt(basic_info[0]);
        int num_lives = Integer.parseInt(basic_info[1]);

        int[] live_profit_arr = new int[num_lives];
        int proper_profit = 0;

        if(num_members == 0 || num_lives ==0){
            proper_profit = 0;
        }else{
            for(int i=0; i<num_lives; i++){
                String input_line = sc.nextLine();
                String[] live_member_profits = input_line.split("[\\s]+");
                // 各ライブの合計金額
                for(String live_member_profit: live_member_profits){
                    int member_profit = Integer.parseInt(live_member_profit);
                    live_profit_arr[i] += member_profit;
                }
            }

            // 各ライブで0円以上の利益が出ているものを合算
            for(int live_profit: live_profit_arr){
                if(live_profit >= 0){
                    proper_profit += live_profit;
                }
            }
        }

        System.out.println(proper_profit);
    }
}
