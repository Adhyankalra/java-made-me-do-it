import java.util.Scanner;

public class func {
    public static void main(String args[]) {
        if (1>=0){
        System.out.println("hello");
        int a = 10;
        int b = 20;
        int c = Integer.sum(a, b);
        System.out.println("Sum is: " + c);}

        // Check if a number is even or odd
        // Using Scanner to take input from the user
        System.out.println("Check if a number is even or odd"); 
        System.out.println("hello");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
        
        sc.close();
        

        // Example of a for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Value of i: " + i);
        }
        // Example of a while loop
        int j = 0;
        while (j < 5) {
            System.out.println("Value of j: " + j);
            j++;
        }
        // Example of a do-while loop
        int k = 0;
        do {
            System.out.println("Value of k: " + k);
            k++;
        } while(k < 5);
        // Example of a switch statement
       int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        } 
        // Example of a method
        int result = add(5, 10);
        System.out.println("Result of addition: " + result);
        // Example of a method with a loop
        int factorial = facct(5);
        System.out.println("Factorial of 5: " + factorial);
        // Example of a method with a loop and a return value
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);
        // Example of a method with a loop and a return value
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 numbers: " + product);
        // Example of a method with a loop and a return value
        int difference = 10 - 5;
        System.out.println("Difference of 10 and 5: " + difference);
        // Example of a method with a loop and a return value
        int sumOfTwo = sum(10, 20);
        System.out.println("Sum of 10 and 20: " + sumOfTwo);
        // Example of a method with a loop and a return value
        int productOfTwo = product(10, 20);
        System.out.println("Product of 10 and 20: " + productOfTwo);
        // Example of a method with a loop and a return value
        int differenceOfTwo = difference(10, 20);
        System.out.println("Difference of 10 and 20: " + differenceOfTwo);
        // Example of a method with a loop and a return value
        int sumOfFirstN = sumOfFirstN(10);
        System.out.println("Sum of first 10 numbers: " + sumOfFirstN);
        // Example of a method with a loop and a return value
        int productOfFirstN = productOfFirstN(5);
        System.out.println("Product of first 5 numbers: " + productOfFirstN);
        // Example of a method with a loop and a return value
        int differenceOfFirstN = differenceOfFirstN(10);
        System.out.println("Difference of first 10 numbers: " + differenceOfFirstN);
        // Example of a method with a loop and a return value
        int sumOfFirstNAgain = sumOfFirstN(10);
        System.out.println("Sum of first 10 numbers again: " + sumOfFirstNAgain);
        // Example of a method with a loop and a return value
        int productOfFirstNAgain = productOfFirstN(5);
        System.out.println("Product of first 5 numbers again: " + productOfFirstNAgain);
        // Example of a method with a loop and a return value
        int hemlo = hemlo();
        System.out.println("Result of hemlo method: " + hemlo);
        // Example of a method with a loop and a return value
        int hemloAgain = hemlo();
        System.out.println("Result of hemlo method again: " + hemloAgain);

    } 

    public static int add(int a, int b) {
        return a * b;}


    public static int facct(int e){
        int gum =  1;
        for( int i = 1 ; i <= e ;i++){  
            gum = gum * i;
        }
        return gum  ;
    }
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int product(int a, int b) {
        return a * b;
    }
    public static int difference(int a, int b) {
        return a - b;
    }
    public static int sumOfTwo(int a, int b) {
        return a + b;
    }
    public static int productOfTwo(int a, int b) {
        return a * b;
    }
    public static int differenceOfTwo(int a, int b) {
        return a - b;
    }
    public static int sumOfFirstN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static int productOfFirstN(int n) {
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }
    public static int differenceOfFirstN(int n) {
        int difference = 0;
        for (int i = 1; i <= n; i++) {
            difference -= i;
        }
        return difference;
    }
    

    public static int hemlo() {
        return 0; // Placeholder for future implementation
    }
   
}
