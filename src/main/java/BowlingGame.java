import java.util.List;

public class BowlingGame {

    public int calcScore(List<Integer> bowlingHits) {
        int score = 0;
        int spareFlag = 1;
        int prevScore = 0;
        int roundScore = 0;
        int extraScoreTime = 0;
        int round = 1;
        for (Integer integer : bowlingHits) {
            if (integer == 10 && round != 10) {
                score += integer;
                ++round;
                extraScoreTime += 2;
                continue;
            } else if (integer == 10 && round == 10) {
                if (extraScoreTime > 0) {
                    score += integer * 2;
                    --extraScoreTime;
                } else {
                    score += integer;
                }
                continue;
            }
            score += integer;
            if (extraScoreTime > 0 && round != 11) {
                score += integer;
                --extraScoreTime;
            }
            if (spareFlag == 1) {
                ++spareFlag;
            } else {
                spareFlag = 1;
                roundScore = score - prevScore;
                prevScore = score;
                if (roundScore == 10) {
                    extraScoreTime += 1;
                }
                ++round;
            }

        }
        return score;
    }
}
