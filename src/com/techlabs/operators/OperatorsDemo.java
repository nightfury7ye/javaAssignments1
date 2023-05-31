package com.techlabs.operators;

public class OperatorsDemo {

	public static void main(String[] args) {
		int num1 = 10;
        int num2 = 5;

        // Arithmetic Operators
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("Arithmetic Operators:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Assignment Operators
        int value = 10;
        value += 5; 
        System.out.println("\nAssignment Operators:");
        System.out.println("Value: " + value);

        // Comparison Operators
        boolean isEqual = (num1 == num2);
        boolean isNotEqual = (num1 != num2);
        boolean isGreaterThan = (num1 > num2);
        boolean isLessThan = (num1 < num2);
        boolean isGreaterThanOrEqual = (num1 >= num2);
        boolean isLessThanOrEqual = (num1 <= num2);

        System.out.println("\nComparison Operators:");
        System.out.println("Is Equal: " + isEqual);
        System.out.println("Is Not Equal: " + isNotEqual);
        System.out.println("Is Greater Than: " + isGreaterThan);
        System.out.println("Is Less Than: " + isLessThan);
        System.out.println("Is Greater Than or Equal: " + isGreaterThanOrEqual);
        System.out.println("Is Less Than or Equal: " + isLessThanOrEqual);

        // Logical Operators
        boolean logicalAnd = (num1 > 0) && (num2 > 0);
        boolean logicalOr = (num1 > 0) || (num2 > 0);
        boolean logicalNot = !(num1 > 0);

        System.out.println("\nLogical Operators:");
        System.out.println("Logical AND: " + logicalAnd);
        System.out.println("Logical OR: " + logicalOr);
        System.out.println("Logical NOT: " + logicalNot);

        // Increment and Decrement Operators
        int value1 = 5;
        value1++; 
        int value2 = 10;
        value2--; 

        System.out.println("\nIncrement and Decrement Operators:");
        System.out.println("Value 1: " + value1);
        System.out.println("Value 2: " + value2);

        // Bitwise Operators
        int bitwiseAnd = num1 & num2;
        int bitwiseOr = num1 | num2;
        int bitwiseXor = num1 ^ num2;
        int bitwiseComplement = ~num1;

        System.out.println("\nBitwise Operators:");
        System.out.println("Bitwise AND: " + bitwiseAnd);
        System.out.println("Bitwise OR: " + bitwiseOr);
        System.out.println("Bitwise XOR: " + bitwiseXor);
        System.out.println("Bitwise Complement: " + bitwiseComplement);

        // Shift Operators
        int leftShift = num1 << 2; 
        int rightShift = num1 >> 2; 
        
        System.out.println("\nShift Operators:");
        System.out.println("Left Shift: " + leftShift);
        System.out.println("Right Shift: " + rightShift);

        // Ternary Operator
        int max = (num1 > num2) ? num1 : num2;

        System.out.println("\nTernary Operator:");
        System.out.println("Max value: " + max);
    }

}
