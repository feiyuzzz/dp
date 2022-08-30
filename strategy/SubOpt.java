package strategy;

public class SubOpt implements IStrategy {
    @Override
    public int doOpt(int num1, int num2) {
        return num1 - num2;
    }
}
