package guess_game;

/**
 * the number this player guessed
 */
public class Player {

    // where the guess goes
    int number = 0;
    /**
     * method for making a guess
     */
    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }
}
