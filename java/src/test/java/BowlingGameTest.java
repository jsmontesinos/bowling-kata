import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {

  @Test
  public void should_return_empty_score() {
    BowlingGame game = new BowlingGame();

    int score = game.score("--|--|--|--|--|--|--|--|--|---");

    assertEquals(0, score);
  }

  @Test
  public void should_score_1() {
    BowlingGame game = new BowlingGame();

    int score = game.score("1-|--|--|--|--|--|--|--|--|---");

    assertEquals(1, score);
  }

  @Test
  public void should_score_1_on_second_roll() {
    BowlingGame game = new BowlingGame();

    int score = game.score("-1|--|--|--|--|--|--|--|--|---");

    assertEquals(1, score);
  }

}
