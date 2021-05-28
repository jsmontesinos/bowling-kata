
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

public class BowlingGameTest {

    BowlingGame game;

    @BeforeEach
    public void init() {
        game = new BowlingGame();
    }

    @Test
    public void should_return_empty_score() {
        int score = game.score("--|--|--|--|--|--|--|--|--|---");

        assertEquals(0, score);
    }

    @Test
    public void should_score_1() {
        int score = game.score("1-|--|--|--|--|--|--|--|--|---");

        assertEquals(1, score);
    }

    @Test
    public void should_score_1_on_second_roll() {
        int score = game.score("-1|--|--|--|--|--|--|--|--|---");

        assertEquals(1, score);
    }

    @Test
    public void should_score_simple_full_frame() {
        int score = game.score("12|--|--|--|--|--|--|--|--|---");

        assertEquals(3, score);
    }

}
