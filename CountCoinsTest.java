// A simple example to get you started
// JUnit assertion - the default Java assertion library
// https://junit.org/junit5/

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class CountCoinsTest {

    /*@Test
    void life_the_universe_and_everything() {
        int expected = 42;
        int actual = Hiker.answer();
        assertEquals(expected, actual);
    }*/
    
    @Test
    void fourQuarters() {
        boolean expected = true;
        int[] coins = new int[4];
        coins[0] = 4;
        coins[1] = 0;
        coins[2] = 0;
        coins[3] = 0;
        boolean actual = CountCoins.answer(coins);
        assertEquals(expected, actual);
    }
    
    @Test
    void fourQuartersFiveDimes() {
        boolean expected = false;
        int[] coins = new int[4];
        coins[0] = 4;
        coins[1] = 5;
        coins[2] = 0;
        coins[3] = 0;
        boolean actual = CountCoins.answer(coins);
        assertEquals(expected, actual);
    }
    
    @Test
    void twoQuarterFiveDimes() {
        boolean expected = true;
        int[] coins = new int[4];
        coins[0] = 2;
        coins[1] = 5;
        coins[2] = 0;
        coins[3] = 0;
        boolean actual = CountCoins.answer(coins);
        assertEquals(expected, actual);
    }
    
    @Test
    void threeQuarterFiveNickles() {
        boolean expected = true;
        int[] coins = new int[4];
        coins[0] = 2;
        coins[1] = 5;
        coins[2] = 0;
        coins[3] = 0;
        boolean actual = CountCoins.answer(coins);
        assertEquals(expected, actual);
    }
    
    @Test
    void oneQuarter75pennies() {
        boolean expected = true;
        int[] coins = new int[4];
        coins[0] = 1;
        coins[1] = 0;
        coins[2] = 0;
        coins[3] = 75;
        boolean actual = CountCoins.answer(coins);
        assertEquals(expected, actual);
    }
    
    @Test
    void oneQuarter5dimes10nickles1penny() {
        boolean expected = false;
        int[] coins = new int[4];
        coins[0] = 1;
        coins[1] = 5;
        coins[2] = 10;
        coins[3] = 1;
        boolean actual = CountCoins.answer(coins);
        assertEquals(expected, actual);
    }
    
    @Test
    void negativeQuarters() {
        boolean expected = false;
        int[] coins = new int[4];
        coins[0] = -10;
        coins[1] = 0;
        coins[2] = 0;
        coins[3] = 0;
        boolean actual = CountCoins.answer(coins);
        assertEquals(expected, actual);
    }
    
    @Test
    void tenDimes() {
        boolean expected = true;
        int[] coins = new int[4];
        coins[0] = 0;
        coins[1] = 10;
        coins[2] = 0;
        coins[3] = 0;
        boolean actual = CountCoins.answer(coins);
        assertEquals(expected, actual);
    }
    
    @Test
    void tenDimesFifteenNickles() {
        boolean expected = false;
        int[] coins = new int[4];
        coins[0] = 0;
        coins[1] = 10;
        coins[2] = 15;
        coins[3] = 0;
        boolean actual = CountCoins.answer(coins);
        assertEquals(expected, actual);
    }
    
    @Test
    void threeDimes19nickles30pennies() {
        boolean expected = false;
        int[] coins = new int[4];
        coins[0] = 0;
        coins[1] = 3;
        coins[2] = 19;
        coins[3] = 30;
        boolean actual = CountCoins.answer(coins);
        assertEquals(expected, actual);
    }
    
    @Test
    void negative3Dimes5Quarters1Nickle() {
        boolean expected = false; //coins cant be negative
        int[] coins = new int[4];
        coins[0] = 5;
        coins[1] = -3;
        coins[2] = 1;
        coins[3] = 0;
        boolean actual = CountCoins.answer(coins);
        assertEquals(expected, actual);
    }
    
    @Test
    void negativeDime() {
        boolean expected = false; //coins cant be negative
        int[] coins = new int[4];
        coins[0] = 0;
        coins[1] = -1;
        coins[2] = 0;
        coins[3] = 0;
        boolean actual = CountCoins.answer(coins);
        assertEquals(expected, actual);
    }
    
    @Test
    void twentyNickles() {
        boolean expected = true;
        int[] coins = new int[4];
        coins[0] = 0;
        coins[1] = 0;
        coins[2] = 20;
        coins[3] = 0;
        boolean actual = CountCoins.answer(coins);
        assertEquals(expected, actual);
    }
    
    @Test
    void fourtyNickles() {
        boolean expected = false;
        int[] coins = new int[4];
        coins[0] = 0;
        coins[1] = 0;
        coins[2] = 40;
        coins[3] = 0;
        boolean actual = CountCoins.answer(coins);
        assertEquals(expected, actual);
    }
    
    @Test
    void oneNickle5Dimes89Pennies() {
        boolean expected = false;
        int[] coins = new int[4];
        coins[0] = 0;
        coins[1] = 5;
        coins[2] = 1;
        coins[3] = 89;
        boolean actual = CountCoins.answer(coins);
        assertEquals(expected, actual);
    }
    
    @Test
    void negative5Nickles5Quarters() {
        boolean expected = false; //can't have negative coins
        int[] coins = new int[4];
        coins[0] = 5;
        coins[1] = 0;
        coins[2] = -5;
        coins[3] = 0;
        boolean actual = CountCoins.answer(coins);
        assertEquals(expected, actual);
    }
    
    @Test
    void negative20Nickles4Quarters() {
        boolean expected = false; 
        int[] coins = new int[4];
        coins[0] = 4;
        coins[1] = 0;
        coins[2] = -20;
        coins[3] = 0;
        boolean actual = CountCoins.answer(coins);
        assertEquals(expected, actual);
    }
    
    @Test
    void hundredPennies() {
        boolean expected = true;
        int[] coins = new int[4];
        coins[0] = 0;
        coins[1] = 0;
        coins[2] = 0;
        coins[3] = 100;
        boolean actual = CountCoins.answer(coins);
        assertEquals(expected, actual);
    }
    
    @Test
    void fiftyPennies() {
        boolean expected = false;
        int[] coins = new int[4];
        coins[0] = 0;
        coins[1] = 0;
        coins[2] = 0;
        coins[3] = 50;
        boolean actual = CountCoins.answer(coins);
        assertEquals(expected, actual);
    }
    
    @Test
    void onePenny10Nickles3Dimes() {
        boolean expected = false;
        int[] coins = new int[4];
        coins[0] = 0;
        coins[1] = 3;
        coins[2] = 10;
        coins[3] = 1;
        boolean actual = CountCoins.answer(coins);
        assertEquals(expected, actual);
    }
    
    @Test
    void seventyFivePenniesOneQuarter() {
        boolean expected = true;
        int[] coins = new int[4];
        coins[0] = 1;
        coins[1] = 0;
        coins[2] = 0;
        coins[3] = 75;
        boolean actual = CountCoins.answer(coins);
        assertEquals(expected, actual);
    }
    
    @Test
    void negative25pennies7Dimes1Nickle2Quarter() {
        boolean expected = false; //coins cant be negative
        int[] coins = new int[4];
        coins[0] = 2;
        coins[1] = 7;
        coins[2] = 1;
        coins[3] = 75;
        boolean actual = CountCoins.answer(coins);
        assertEquals(expected, actual);
    }
    
}
