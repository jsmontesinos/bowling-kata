
class BowlingGame {

    public int score(String frames) {
        int number = 0;

        try {
            number = Integer.parseInt(frames.substring(0, 1));
        } catch (NumberFormatException e) {
            try {
                number = Integer.parseInt(frames.substring(1, 2));
            } catch (NumberFormatException e2) {

            }
        }

        return number;
    }

}
