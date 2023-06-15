import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        RewardValue val = new RewardValue(100.0);
        assertEquals(val.getMilesValue(),28571);

        //edge case
        RewardValue val2 = new RewardValue(0.0);
        assertEquals(val2.getMilesValue(),0);
    }

    @Test
    void convert_from_miles_to_cash() {
        RewardValue val = new RewardValue(1000);
        assertEquals(val.getCashValue(),3.5);

        //edge case
        RewardValue val2 = new RewardValue(0);
        assertEquals(val2.getCashValue(),0);
    }
}
