public enum MoveType {
    COOPERATE("CO"),
    CHEAT("CH");

    private String input;

    MoveType(String input) {

        this.input = input;
    }

    public static MoveType valueFor(String input) {
        for (MoveType moveType : MoveType.values()) {
            return moveType.input.equals(input) ? moveType : null;
        }
        return null;
    }
}
