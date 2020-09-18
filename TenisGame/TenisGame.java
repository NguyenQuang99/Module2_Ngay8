package BT_Recfactoring;

public class TennisGame {
    private static final  int ZERO = 0;
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int THREE = 3;

    public static String getScore(String player1Name, String player2Name, int mScore1, int mScore2) {

        String score = "";
        int tempScore=0;
        return getString(mScore1, mScore2, score);
    }




    public static String getString(int mScore1, int mScore2, String score) {
        int tempScore;
        if (mScore1 == mScore2)
        {
            switch (mScore1)
            {
                case ZERO:
                    score = "Love-All";
                    break;
                case ONE:
                    score = "Fifteen-All";
                    break;
                case TWO:
                    score = "Thirty-All";
                    break;
                case THREE:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        }
        else if (mScore1 >=4 || mScore2 >=4)
        {
            int minusResult = mScore1 - mScore2;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = mScore1;
                else { score +="-"; tempScore = mScore2;}
                score = getString(score, tempScore);
            }
        }
        return score;
    }

    private static String getString(String score, int tempScore) {
        switch(tempScore)
        {
            case 0:
                score +="Love";
                break;
            case 1:
                score +="Fifteen";
                break;
            case 2:
                score +="Thirty";
                break;
            case 3:
                score +="Forty";
                break;
        }
        return score;
    }
}
