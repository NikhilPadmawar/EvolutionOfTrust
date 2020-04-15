public enum MoveType {

    CHEAT("CH"),COOPERATE("CO");

    private String input;

    MoveType(String input) {

        this.input = input;
    }

    public static MoveType valueFor(String input) {
        for(MoveType moveType : MoveType.values()) {
            if(moveType.input.equals(input)) {
                return moveType;
            }
        }
        return null;
    }
}
