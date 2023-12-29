public class Game {
    public boolean gameOver;
    public int score;
    public int levelCompleted;
    public int bonus;
    public int finalScore;

    public Game() {
        this.gameOver = false;
        this.score = 0;
        this.levelCompleted = 0;
        this.bonus = 0;
//        this.finalScore = 0;
    }

    public Game(boolean g, int s, int l, int b) {
        this.gameOver = g;
        this.score = s;
        this.levelCompleted = l;
        this.bonus = b;
//        this.finalScore = 0;
    }
    public void setVariables(boolean gameOver, int score, int levelCompleted, int bonus) {
        this.gameOver = gameOver;
        this.score = score;
        this.levelCompleted = levelCompleted;
        this.bonus = bonus;
//        this.finalScore = finalScore;
    }

    public void clearVariables(){
        this.gameOver = false;
        this.score = 0;
        this.levelCompleted = 0;
        this.bonus = 0;
        this.finalScore = 0;
    }

    public void printScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if (gameOver){
            System.out.printf("\nScore: " + score);
            finalScore = score;
            System.out.printf("\nFinal Score: " + score);

            finalScore += (levelCompleted * bonus);
            System.out.printf("\nYour final score was " + finalScore);
        }
    }

    public void printScoreGameOff() {
        System.out.printf("\nGame hasn't started yet!");
    }
}
