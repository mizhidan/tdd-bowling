import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BowlingGameTest {
    BowlingGame bowlingGame = new BowlingGame();
    @Test
    void should_calc_correct_score_when_no_strike_or_spare() {
        List<Integer> bowlingHits = Arrays.asList(2,3,4,5,2,7,2,4,5,3,6,2,1,2,4,2,5,1,2,2);
        int score = bowlingGame.calcScore(bowlingHits);
        assertEquals(64, score);
    }

    @Test
    void should_calc_correct_score_when_only_have_spare() {
        List<Integer> bowlingHits1 = Arrays.asList(2,3,4,5,3,7,2,4,5,3,6,2,1,2,4,2,5,1,2,2);
        List<Integer> bowlingHits2 = Arrays.asList(2,3,4,5,3,7,2,4,5,3,6,2,1,2,4,2,5,1,5,5,3);
        int score1 = bowlingGame.calcScore(bowlingHits1);
        int score2 = bowlingGame.calcScore(bowlingHits2);
        assertEquals(67, score1);
        assertEquals(76, score2);
    }
}
