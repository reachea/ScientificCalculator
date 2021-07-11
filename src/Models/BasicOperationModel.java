package Models;

public class BasicOperationModel {
    private double basicOperationResult;

    public boolean setBasicOperationResult(double operationResult) {
        this.basicOperationResult = operationResult;

        return true;
    }

    public double getBasicOperationResult() {
        return this.basicOperationResult;
    }
}
