package collections.abstraction;

abstract class PaymentMethod {
    private final String methodName;

    protected PaymentMethod(String methodName) {
        this.methodName = methodName;
    }

    public String getMethodName() {
        return methodName;
    }

    public abstract void pay(long amount);
}

