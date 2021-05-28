import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {

	@Test
	public void should_return_empty_score() {
		BowlingGame game = new BowlingGame();

		int score = game.score("--|--|--|--|--|--|--|--|--|---");

		assertEquals(0, score);
	}

}
