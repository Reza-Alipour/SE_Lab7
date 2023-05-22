package parser;

public abstract class Act {
    public abstract String toString();

    public String actionToString(int num) {
        return this.toString() + num;
    }
}
