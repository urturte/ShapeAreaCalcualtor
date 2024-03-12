package it.academy.project;

public class UnknownShapeException extends Exception{
    private String message;
    public UnknownShapeException(String txt) {
        this.message = txt;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
