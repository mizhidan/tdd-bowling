import java.util.List;

public class BowlingGame {

    public int calcScore(List<Integer> bowlingHits) {
        int score = 0;
        for (Integer integer : bowlingHits) {
            score += integer;
        }
        return score;
    }
}
