package org.example.corejava.exception.customException;
public class CustomThrowExample {
    public static void main(String[] args) {
        try {
            validateNumber(-1);
        } catch (CustomException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }

    static void validateNumber(int number) throws CustomException {
        if (number < 0) {
            throw new CustomException("Number must be positive");
        } else {
            System.out.println("Number is valid");
        }
    }
}