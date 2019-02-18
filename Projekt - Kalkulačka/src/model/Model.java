package model;

public class Model {
	public double calculate(long number1, long number2, String operator) {
        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                if (number2 == 0)
                    return 0;

                return 1.0*number1 / number2;
        }

        System.out.println("Unknown operator - " + operator);
        return 0;
    }
}

