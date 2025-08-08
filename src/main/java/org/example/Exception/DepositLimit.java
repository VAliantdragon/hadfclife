package org.example.Exception;

public class DepositLimit extends RuntimeException {

    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DepositLimit(String message) {
        super(message);
    }


}
