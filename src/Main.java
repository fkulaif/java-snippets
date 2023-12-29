
public class Main {
    public static void main(String[] args) {
/**
 *      Refactoring the previous one-class Main code,
 *      creating the Game class
 */
//        Game game = new Game(false, 0, 0, 0);
        Game game = new Game();
        game.printScoreGameOff();

//        game.setVariables(true, 800, 5, 100);
        game.printScore(true, 800, 5, 100);

        game.clearVariables();
        // score = 10_000;  levelCompleted = 8; bonus = 200;
        game.printScore(true, 10_000, 8, 200);

    }
}