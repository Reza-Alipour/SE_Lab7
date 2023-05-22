package parser;

public class ReduceAct extends Act {
    @Override
    public String toString() {
        return "reduce";
    }

    @Override
    public String actionToString(int num) {
        return "r" + num;
    }
}
