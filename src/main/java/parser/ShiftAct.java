package parser;

public class ShiftAct extends Act {
    @Override
    public String toString() {
        return "shift";
    }

    @Override
    public String actionToString(int num) {
        return "s" + num;
    }
}
