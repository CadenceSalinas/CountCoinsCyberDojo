
public class CountCoins {

    public static boolean answer(int[] coins) {
        int sum;
        int quarter = coins[0]*25;
        int dime = coins[1]*10;
        int nickle = coins[2]*5;
        int penny = coins[3];
        
        for(int i = 0; i < coins.length-1; i++)
        {
            if(coins[i] <= -1)
            {
                return false;
            }//end nested if
        }//end for loop
        
        if(quarter + dime + nickle + penny == 100)
        {
            return true;
        }
        
        return false;
    }
}
