class BowlingGame {

  public int score(String frames) {
    int number;

    try {
      number = Integer.parseInt(frames.substring(0, 1));
    } catch (NumberFormatException e) {
      return 0;
    }

    return number;
  }

}
