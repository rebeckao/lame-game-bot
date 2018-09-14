package bot;

import game.api.GameRunner;
import game.api.Player;
import game.model.ConsoleGameRunner;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MyPlayerTest {
    private GameRunner gameRunner = new ConsoleGameRunner();
    private Player player = new MyPlayer();

    @Test
    public void runGame() {
        boolean goalIsReached = gameRunner.runGame(player);
        assertTrue("Game over", goalIsReached);
    }

}