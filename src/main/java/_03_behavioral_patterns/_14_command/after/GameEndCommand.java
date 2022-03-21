package _03_behavioral_patterns._14_command.after;

import _03_behavioral_patterns._14_command.before.Game;

public class GameEndCommand implements Command{

    private Game game;

    public GameEndCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.end();
    }
}
