package strategy;

public class AddOpt implements IStrategy {
    @Override
    public int doOpt(int num1, int num2) {
        return num1 + num2;
    }
}
