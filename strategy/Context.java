package strategy;

public class Context {

    private final IStrategy IStrategy;

    public Context(IStrategy IStrategy) {
        this.IStrategy = IStrategy;
    }

    public int execute(int num1, int num2){
       return IStrategy.doOpt(num1, num2);
    }
}
