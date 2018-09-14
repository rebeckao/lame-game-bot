package bot;

import game.api.Move;
import game.api.Player;
import game.api.VisibleGameState;

public class MyPlayer implements Player {
    @Override
    public Move choice(VisibleGameState visibleGameState) {
        return Move.STRAIGHT;
    }
}
