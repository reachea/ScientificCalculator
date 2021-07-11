package Views;

public class SetTheoryView {
    private String setOperationResult;

    public boolean setSetOperationResult(String result) {
        this.setOperationResult = result;

        return true;
    }

    public String getSetOperationResult() {
        return this.setOperationResult;
    }
}
