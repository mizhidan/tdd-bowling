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
        List<Integer> bowlingHits = Arrays.asList(2,3,4,5,3,7,2,4,5,3,6,2,1,2,4,2,5,1,2,2);
        int score = bowlingGame.calcScore(bowlingHits);
        assertEquals(67, score);
    }

    @Test
    void should_calc_correct_score_when_only_have_spare_and_in_tenth_round() {
        List<Integer> bowlingHits = Arrays.asList(2,3,4,5,3,7,2,4,5,3,6,2,1,2,4,2,5,1,5,5,3);
        int score = bowlingGame.calcScore(bowlingHits);
        assertEquals(76, score);
    }

    @Test
    void should_calc_correct_score_when_only_have_strike() {
        List<Integer> bowlingHits = Arrays.asList(1,2,3,4,5,4,10,4,5,3,6,10,5,2,2,4,3,4);
        int score = bowlingGame.calcScore(bowlingHits);
        assertEquals(93, score);
    }

    @Test
    void should_calc_correct_score_when_have_continuous_strike() {
        List<Integer> bowlingHits4 = Arrays.asList(1,2,3,4,10,10,4,5,3,6,10,5,2,10,10,4,5);
        int score4 = bowlingGame.calcScore(bowlingHits4);
        assertEquals(138, score4);
    }

    @Test
    void should_calc_correct_score_when_have_strike_in_tenth_round() {
        List<Integer> bowlingHits = Arrays.asList(1,2,3,4,5,4,10,4,5,3,6,10,5,2,10,10,4,5);
        int score = bowlingGame.calcScore(bowlingHits);
        assertEquals(123, score);
    }


    @Test
    void should_calc_correct_score_when_all_strike() {
        List<Integer> bowlingHits = Arrays.asList(10,10,10,10,10,10,10,10,10,10,10,10);
        int score = bowlingGame.calcScore(bowlingHits);
        assertEquals(300, score);
    }

    @Test
    void should_calc_correct_score_when_have_strike_and_spare() {
        List<Integer> bowlingHits1 = Arrays.asList(1,2,3,4,5,4,10,5,5,3,6,10,5,2,2,4,3,4);
        int score1 = bowlingGame.calcScore(bowlingHits1);
        assertEquals(95, score1);
    }

    @Test
    void should_calc_correct_score_when_have_strike_and_the_spare_is_in_tenth_round() {
        List<Integer> bowlingHits = Arrays.asList(1,2,3,4,5,4,10,4,5,3,6,10,5,2,10,5,5,5);
        int score = bowlingGame.calcScore(bowlingHits);
        assertEquals(115, score);
    }
}
